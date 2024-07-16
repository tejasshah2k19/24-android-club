package com.androidclub24;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.androidclub24.model.BookModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_book_list);

        TextView tvBookName,tvBookPrice;

        tvBookName = findViewById(R.id.tv_list_book_name);
       // tvBookPrice  = findViewById(R.id.tv_list_book_price);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("book_app",MODE_PRIVATE);
        String bookListJsonStr = sp.getString("bookList",null);

        if(bookListJsonStr != null){
            TypeToken<ArrayList<BookModel>> typeToken  = new TypeToken<ArrayList<BookModel>>(){};
            Gson gson = new Gson();

            ArrayList<BookModel> listBook =    gson.fromJson(bookListJsonStr,typeToken);


            tvBookName.setText(String.valueOf(listBook.size()));//resource
        }





    }
}