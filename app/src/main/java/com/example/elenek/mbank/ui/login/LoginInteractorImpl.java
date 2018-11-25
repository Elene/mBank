package com.example.elenek.mbank.ui.login;

import com.example.elenek.mbank.network.RetrofitInstance;
import com.example.elenek.mbank.service.MBankDataService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginInteractorImpl implements LoginContract.LoginInteractor {

    @Override
    public void login(String username, String password, final OnLoginFinishedListener listener) {
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
