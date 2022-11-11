package com.example.qlsv_sqlite.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.qlsv_sqlite.R;
import com.example.qlsv_sqlite.adapter.ClassesAdapter;
import com.example.qlsv_sqlite.model.Classes;
import com.example.qlsv_sqlite.sqlite.ClassesDao;

import java.util.List;

public class ListClassesActivity extends AppCompatActivity {
    private ListView lvClasses;
    private List<Classes> list;
    private ClassesAdapter clsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_classes);

        lvClasses = findViewById(R.id.lvClasses);

        fillClassesListView();

        lvClasses.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                ClassesDao dao = new ClassesDao(ListClassesActivity.this);
                Classes cls = list.get(i);
                dao.delete("" + cls.getId());

                fillClassesListView();

                return false;
            }
        });
    }

    private void fillClassesListView() {
        ClassesDao dao = new ClassesDao(this);
        list = dao.getAll();

        clsAdapter = new ClassesAdapter(this, list);
        lvClasses.setAdapter(clsAdapter);
    }
}