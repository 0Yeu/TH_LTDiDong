package com.example.profile_nguoidung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewKhachSan extends AppCompatActivity {
    ListView lvKhachSan;
    ArrayList<KhachSan> arrayKhachSan;
    KhachSanAdapter adapter;
    TextView tv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_khach_san);
        tv_back = findViewById(R.id.tv_back);
        tv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewKhachSan.this, Home.class);
                startActivity(intent);
                finish();
            }
        });
        AnhXa();

        adapter = new KhachSanAdapter(this, R.layout.activity_khach_san, arrayKhachSan);
        lvKhachSan.setAdapter(adapter);
    }

    private void  AnhXa() {
        lvKhachSan = (ListView) findViewById(R.id.ListviewKhachSan);
        arrayKhachSan = new ArrayList<>();

        arrayKhachSan.add(new KhachSan("Khach san Hung Vuong", "3 sao", R.drawable.khach_san));
        arrayKhachSan.add(new KhachSan("Khach san Le Loi", "4 sao", R.drawable.khach_san));
        arrayKhachSan.add(new KhachSan("Khach san Le Trung Dinh", "2 sao", R.drawable.khach_san));
        arrayKhachSan.add(new KhachSan("Khach san Duc Manh", "5 sao", R.drawable.khach_san));
        arrayKhachSan.add(new KhachSan("Khach san Thuy Tram", "3 sao", R.drawable.khach_san));

    }



}