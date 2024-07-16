package com.androidclub24;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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


public class AddBookActivity extends AppCompatActivity {

    Button btnAddBook ;
    EditText edtBookName;
    EditText edtBookPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_book);

        edtBookName = findViewById(R.id.edt_book_name);
        edtBookPrice = findViewById(R.id.edt_book_price);
        btnAddBook  = findViewById(R.id.btn_add_book);

        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String bookName = edtBookName.getText().toString();//read book Name
                int bookPrice = Integer.parseInt(  edtBookPrice.getText().toString()); //read book Price
                //default value edt text -> string -> parseInt

                SharedPreferences sp = getApplicationContext().getSharedPreferences("book_app", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =  sp.edit();

                editor.putString("bookName",bookName);
                editor.putInt("bookPrice",bookPrice);
                editor.apply();

                Toast.makeText(getApplicationContext(),"Book Added",Toast.LENGTH_LONG).show();

                //open another activity -> screen
                Intent intent = new Intent(getApplicationContext(),BookListActivity.class);
                startActivity(intent);


            }
        });


    }
}