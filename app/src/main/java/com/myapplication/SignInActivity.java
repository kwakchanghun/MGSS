package com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Administrator on 2017-07-28.
 */
public class SignInActivity extends AppCompatActivity {

    private Button btnRegist;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_in);

        btnRegist = (Button) findViewById(R.id.btnRegist);

        EditText editPhone = (EditText)findViewById(R.id.editPhone);


        btnRegist.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), RegistActivity.class);

                startActivityForResult(intent, 1000);

            }
        });

    }
}
