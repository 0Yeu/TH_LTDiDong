package com.example.qlsv_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.qlsv_sqlite.activity.ListClassesActivity;
import com.example.qlsv_sqlite.activity.ManageStudentsActivity;
import com.example.qlsv_sqlite.dialog.NewClassDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnNewClass).setOnClickListener(this);
        findViewById(R.id.btnListClasses).setOnClickListener(this);
        findViewById(R.id.btnManageStudents).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnNewClass:
                NewClassDialog dialog = new NewClassDialog(this);
                dialog.show();
//                Toast.makeText(this, "New class", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnListClasses:
                Intent intent = new Intent(this, ListClassesActivity.class);
                startActivity(intent);
                break;
            case R.id.btnManageStudents:
                Intent mngIntent = new Intent(this, ManageStudentsActivity.class);
                startActivity(mngIntent);
                break;
        }
    }
}