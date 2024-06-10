package com.androidclub24;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);


        EditText edtFirstName,edtUserName,edtPassword;
        Button btnSignup;

        edtFirstName = findViewById(R.id.edtFirstNameSignup);
        edtUserName  = findViewById(R.id.edtUserNameSignup);
        edtPassword = findViewById(R.id.edtPasswordSignup);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = edtFirstName.getText().toString();
                String userName = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();

                //validation

                //rest api calling -> node js server -> db insert

                //display -> signup success
                Toast.makeText(SignupActivity.this,"Signup successfully done",Toast.LENGTH_LONG).show();
                //redirect -> navigate -> Login
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);//activity - activity
                startActivity(intent);//redirection

            }
        });



    }
}