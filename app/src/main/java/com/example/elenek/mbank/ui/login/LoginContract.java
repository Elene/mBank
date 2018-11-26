package com.example.elenek.mbank.ui.login;

public class LoginContract {
    interface LoginPresenter {
        void onDestroy();
        void validateCredentials(String username, String password);
    }

    interface LoginView {
        void navigateToHome();
        void setError(String error);
    }

    interface LoginInteractor {
        interface OnLoginFinishedListener {
            void onSuccess();
            void onFail(LoginException e);
        }

        void login(String username, String password, OnLoginFinishedListener listener);
    }

}
