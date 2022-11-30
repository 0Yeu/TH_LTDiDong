package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListviewTacPham extends AppCompatActivity {
    ListView lvTacPham;
    ArrayList<TacPham> arrayTacPham;
    TacPhamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_tac_pham);

        AnhXa();

        adapter = new TacPhamAdapter(this, R.layout.activity_tac_pham, arrayTacPham);
        lvTacPham.setAdapter(adapter);
    }

    private void  AnhXa() {
        lvTacPham = (ListView) findViewById(R.id.ListviewTacGia);
        arrayTacPham = new ArrayList<>();

        arrayTacPham.add(new TacPham("Xuân Diệu", "sinh ngày 2 – 2 – 1916. Quê ở Bình Định. " +
                "Ông là một nhà thơ nổi lên từ phong trào Thơ Mới, " +
                "và được mệnh danh là “Nhà thơ mới nhất trong những nhà thơ Mới”" , R.drawable.nhatho_xuandieu, "5"));
        arrayTacPham.add(new TacPham("Xuân Diệu", "sinh ngày 2 – 2 – 1916. Quê ở Bình Định. " +
                "Ông là một nhà thơ nổi lên từ phong trào Thơ Mới, " +
                "và được mệnh danh là “Nhà thơ mới nhất trong những nhà thơ Mới”" , R.drawable.nhatho_xuandieu, "5"));
        arrayTacPham.add(new TacPham("Xuân Diệu", "sinh ngày 2 – 2 – 1916. Quê ở Bình Định. " +
                "Ông là một nhà thơ nổi lên từ phong trào Thơ Mới, " +
                "và được mệnh danh là “Nhà thơ mới nhất trong những nhà thơ Mới”" , R.drawable.nhatho_xuandieu, "5"));
        arrayTacPham.add(new TacPham("Xuân Diệu", "sinh ngày 2 – 2 – 1916. Quê ở Bình Định. " +
                "Ông là một nhà thơ nổi lên từ phong trào Thơ Mới, " +
                "và được mệnh danh là “Nhà thơ mới nhất trong những nhà thơ Mới”" , R.drawable.nhatho_xuandieu, "5"));
        arrayTacPham.add(new TacPham("Xuân Diệu", "sinh ngày 2 – 2 – 1916. Quê ở Bình Định. " +
                "Ông là một nhà thơ nổi lên từ phong trào Thơ Mới, " +
                "và được mệnh danh là “Nhà thơ mới nhất trong những nhà thơ Mới”" , R.drawable.nhatho_xuandieu, "5"));
    }
}