package com.example.elenek.mbank.ui.login;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.elenek.mbank.ui.main.MainActivity;
import com.example.elenek.mbank.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {
    private TextInputLayout tilUsername;
    private TextInputLayout tilPassword;
    private Button btnLogin;

    private LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tilUsername = findViewById(R.id.activity_login_til_username);
        tilPassword = findViewById(R.id.activity_login_til_password);
        btnLogin = findViewById(R.id.activity_login_btn_login);

        presenter = new LoginPresenterImpl(this, new LoginInteractorImpl());

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.validateCredentials(tilUsername.getEditText().getText().toString(),
                        tilPassword.getEditText().getText().toString());
            }
        });
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void setError(String errorMessage) {
        Toast.makeText(getApplicationContext(), errorMessage, Toast.LENGTH_LONG).show();
    }
}

