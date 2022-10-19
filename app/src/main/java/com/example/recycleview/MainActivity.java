package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import category.CategoryAdapter;
import hotel.Hotel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcv_category;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_category = (RecyclerView) findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcv_category.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcv_category.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<>();

        List<Hotel> listBook = new ArrayList<>();
        listBook.add(new Hotel(R.drawable.hotel1, "Angel Hotel"));
        listBook.add(new Hotel(R.drawable.hotel2, "Le Loi Hotel"));
        listBook.add(new Hotel(R.drawable.hotel3, "Cam Le Hotel"));
        listBook.add(new Hotel(R.drawable.hotel4, "OYeu Hotel"));

        listBook.add(new Hotel(R.drawable.hotel1, "Cai Bua Hotel"));
        listBook.add(new Hotel(R.drawable.hotel2, "Le Loi Hotel"));
        listBook.add(new Hotel(R.drawable.hotel3, "Cam Le Hotel"));
        listBook.add(new Hotel(R.drawable.hotel4, "OYeu Hotel"));

        listCategory.add(new Category("VIP", listBook));
        listCategory.add(new Category("5 Sao", listBook));
        listCategory.add(new Category("4 Sao", listBook));
        listCategory.add(new Category("3 Sao", listBook));


        return listCategory;
    }
}