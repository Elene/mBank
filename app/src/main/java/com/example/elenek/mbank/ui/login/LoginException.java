package com.example.elenek.mbank.ui.login;

import android.content.res.Resources;
import android.util.Log;

import com.example.elenek.mbank.App;
import com.example.elenek.mbank.R;

import java.util.List;

public class LoginException extends RuntimeException {

    private List<LoginError> errors;

    public LoginException(List<LoginError> errors) {
        this.errors = errors;
    }

    @Override
    public String getMessage() {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < errors.size(); i++ ) {
            builder.append(errors.get(i).getMessage());

            if(i != errors.size() - 1)
                builder.append(App.getContext().getResources().getString(R.string.connection_and));
        }

        return builder.toString();
    }
}
