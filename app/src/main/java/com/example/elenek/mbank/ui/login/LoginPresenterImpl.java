package com.example.elenek.mbank.ui.login;

public class LoginPresenterImpl implements LoginContract.LoginPresenter, LoginContract.LoginInteractor.OnLoginFinishedListener {

    private LoginContract.LoginView loginView;
    private LoginContract.LoginInteractor loginInteractor;

    LoginPresenterImpl(LoginContract.LoginView loginView, LoginContract.LoginInteractor loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void validateCredentials(String username, String password) {
        loginInteractor.login(username, password, this);
    }

    @Override
    public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }

    @Override
    public void onFail(LoginException e) {
        if (loginView != null) {
            loginView.setError(e.getMessage());
        }
    }


}
