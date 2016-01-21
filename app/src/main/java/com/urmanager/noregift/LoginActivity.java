package com.urmanager.noregift;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    public static final String TAG = LoginActivity.class.getSimpleName();
    private TextInputLayout mUserNameTextWrapper,mPasswordTextWrapper;
    private TextView mLoginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserNameTextWrapper = (TextInputLayout)findViewById(R.id.userNameTextInput);
        mPasswordTextWrapper = (TextInputLayout)findViewById(R.id.passwordTextInput);
        mLoginTextView = (TextView)findViewById(R.id.login);

    }

}
