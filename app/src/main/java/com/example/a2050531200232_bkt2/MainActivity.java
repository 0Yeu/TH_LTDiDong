package com.example.a2050531200232_bkt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView ListviewCTN;
    ArrayList<CTN> arrayCTN;
    CTNAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new CTNAdapter(this, R.layout.activity_ctn, arrayCTN);
        ListviewCTN.setAdapter(adapter);
    }

    private void  AnhXa() {
        ListviewCTN = (ListView) findViewById(R.id.ListviewCTN);
        arrayCTN = new ArrayList<>();

        arrayCTN.add(new CTN("Cay Bo Cong Anh", "Thanh nhiệt giải độc, tiêu viêm tán kết. Chữa mụn nhọt sang lở, tắc tia sữa, viêm tuyến vú, nhiễm trùng đường tiết niệu", R.drawable.boconganh));
        arrayCTN.add(new CTN("Cay Bo Cong Anh", "Thanh nhiệt giải độc, tiêu viêm tán kết. Chữa mụn nhọt sang lở, tắc tia sữa, viêm tuyến vú, nhiễm trùng đường tiết niệu", R.drawable.boconganh));
        arrayCTN.add(new CTN("Cay Bo Cong Anh", "Thanh nhiệt giải độc, tiêu viêm tán kết. Chữa mụn nhọt sang lở, tắc tia sữa, viêm tuyến vú, nhiễm trùng đường tiết niệu", R.drawable.boconganh));
        arrayCTN.add(new CTN("Cay Bo Cong Anh", "Thanh nhiệt giải độc, tiêu viêm tán kết. Chữa mụn nhọt sang lở, tắc tia sữa, viêm tuyến vú, nhiễm trùng đường tiết niệu", R.drawable.boconganh));
        arrayCTN.add(new CTN("Cay Bo Cong Anh", "Thanh nhiệt giải độc, tiêu viêm tán kết. Chữa mụn nhọt sang lở, tắc tia sữa, viêm tuyến vú, nhiễm trùng đường tiết niệu", R.drawable.boconganh));


    }

}