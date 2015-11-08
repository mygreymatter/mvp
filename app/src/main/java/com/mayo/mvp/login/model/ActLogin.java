package com.mayo.mvp.login.model;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mayo.mvp.R;
import com.mayo.mvp.base.ActBase;
import com.mayo.mvp.login.LoginModule;
import com.mayo.mvp.login.presenter.PresenterLogin;
import com.mayo.mvp.login.view.ViewLogin;
import com.mayo.mvp.main.model.ActMain;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;

public class ActLogin extends ActBase implements ViewLogin {

    @Inject
    PresenterLogin mPresenterLogin;
    @Bind(R.id.username)
    EditText username;
    @Bind(R.id.password)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_login);

    }

    @Override
    protected List<Object> getModules() {
        return Arrays.<Object>asList(new LoginModule(this));
    }

    @Override
    public void showSuccess(String status) {
        Toast.makeText(this, status, Toast.LENGTH_SHORT).show();
        ActMain.intent(this);
    }

    @Override
    public void showFailure(String status) {
        Toast.makeText(this, status, Toast.LENGTH_SHORT).show();
    }

    public void validateAndLogin(View v) {
        Log.i("MVP", username.getText().toString() + password.getText().toString());
        mPresenterLogin.validateCredentials(username.getText().toString(), password.getText().toString());
    }
}
