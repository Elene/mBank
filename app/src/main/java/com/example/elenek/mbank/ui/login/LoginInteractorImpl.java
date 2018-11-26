package com.example.elenek.mbank.ui.login;

import com.example.elenek.mbank.network.RetrofitInstance;
import com.example.elenek.mbank.service.MBankDataService;
import com.example.elenek.mbank.utils.TextUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginInteractorImpl implements LoginContract.LoginInteractor {

    @Override
    public void login(String username, String password, final OnLoginFinishedListener listener) {
        List<LoginError> errors = new ArrayList<>();

        String usernameValidationError = TextUtils.getValidationErrorMessage(username);
        String passwordValidationError = TextUtils.getValidationErrorMessage(password);

        if(usernameValidationError != null && passwordValidationError != null &&
                usernameValidationError.equals(passwordValidationError))
            errors.add(new LoginError("მომხმარებლის სახელის და პაროლის " + usernameValidationError));
        else {
            if(usernameValidationError != null)
                errors.add(new LoginError("მომხმარებლის სახელის " + usernameValidationError));
            if(passwordValidationError != null)
                errors.add(new LoginError("პაროლის " + passwordValidationError));
        }

        if(errors.size() > 0) {
            listener.onFail(new LoginException(errors));
            return;
        }

        MBankDataService service = RetrofitInstance.getRetrofitInstance().create(MBankDataService.class);

        service.getSessionInfo(username, password).enqueue(new Callback<SessionInfo>() {
            @Override
            public void onResponse(Call<SessionInfo> call, Response<SessionInfo> response) {
                if (response.isSuccessful()) {
                    String sessionId = response.body().getSessionId();
                    RetrofitInstance.setSessionId(sessionId);
                    listener.onSuccess();
                }
            }

            @Override
            public void onFailure(Call<SessionInfo> call, Throwable t) {

            }
        });
    }
}
