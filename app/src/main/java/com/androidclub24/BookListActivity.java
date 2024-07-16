package com.androidclub24;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_book_list);

        TextView tvBookName,tvBookPrice;

        tvBookName = findViewById(R.id.tv_list_book_name);
        tvBookPrice  = findViewById(R.id.tv_list_book_price);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("book_app",MODE_PRIVATE);
        String bookName = sp.getString("bookName","BALA");
        int bookPrice = sp.getInt("bookPrice",-1);

        tvBookName.setText(bookName);
        tvBookPrice.setText(bookPrice);

    }
}