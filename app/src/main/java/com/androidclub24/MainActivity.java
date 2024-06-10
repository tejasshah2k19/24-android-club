package com.androidclub24;

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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI : Object

        EditText edtUserName,edtPassword;
        Button btnLogin;

        edtUserName = findViewById(R.id.edtUserName); //java obj -> ui component
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnMainLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String userName = edtUserName.getText().toString();
                    String password = edtPassword.getText().toString();

                    if(userName.equals("admin") && password.equals("admin")){
                        //success
                        Toast.makeText(MainActivity.this,"Sucess",Toast.LENGTH_LONG).show();
                    }else{
                        //fail
                        Toast.makeText(MainActivity.this,"Invalid",Toast.LENGTH_LONG).show();

                    }
            }
        });


    }

}

//class implements List
    //click