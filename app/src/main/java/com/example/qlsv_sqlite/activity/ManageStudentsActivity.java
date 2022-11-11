package com.example.qlsv_sqlite.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.qlsv_sqlite.R;
import com.example.qlsv_sqlite.adapter.ClassesAdapter;
import com.example.qlsv_sqlite.adapter.StudentsAdapter;
import com.example.qlsv_sqlite.helper.DataTimeHelper;
import com.example.qlsv_sqlite.model.Classes;
import com.example.qlsv_sqlite.model.Student;
import com.example.qlsv_sqlite.sqlite.ClassesDao;
import com.example.qlsv_sqlite.sqlite.StudentDao;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ManageStudentsActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtStudentId, edtName, edtDate;
    private Spinner spClasses;
    private List<Classes> classesList;

    private  List<Student> studentList;
    private ListView lvStudents;
    private StudentsAdapter studentsAdapter;
    private  boolean isEdit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_students);
        edtStudentId = findViewById(R.id.edtStudentId);
        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        spClasses = findViewById(R.id.spClasses);

        lvStudents = findViewById(R.id.lvStudents);
        lvStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Student std = studentList.get(i);
                edtStudentId.setText(std.getId());
                edtName.setText(std.getName());
                edtDate.setText(DataTimeHelper.toString(std.getDate()));
                isEdit = true;
            }
        });

        fillClassesToSpinner();

        findViewById(R.id.btnSave).setOnClickListener(this);
        findViewById(R.id.btnDelete).setOnClickListener(this);
    }

    private void fillClassesToSpinner(){
        ClassesDao dao = new ClassesDao(this);
        classesList = dao.getAll();
        ClassesAdapter classesAdapter = new ClassesAdapter(this, classesList);
        spClasses.setAdapter(classesAdapter);
        spClasses.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                fillStudentsToListView();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void fillStudentsToListView(){
        StudentDao dao = new StudentDao(this);
        try{
            Classes cls = (Classes) spClasses.getSelectedItem();
            studentList = dao.getAllByClass(cls.getId());

            studentsAdapter = new StudentsAdapter(this, studentList);
            lvStudents.setAdapter(studentsAdapter);
        } catch (Exception ex){
            ex.printStackTrace();
            Toast.makeText(this, "ERROR: " + ex.getMessage()
                    , Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View view) {
        StudentDao dao = new StudentDao(this);
        switch (view.getId()){
            case R.id.btnSave:
                try {
                    Student std = new Student();
                    std.setId(edtStudentId.getText().toString());
                    std.setName(edtName.getText().toString());
                    std.setDate(DataTimeHelper.toDate(edtDate.getText().toString()));

                    Classes cls = (Classes) spClasses.getSelectedItem();
                    std.setClassId(cls.getId());
                    String msg;
                    if (!isEdit) {
                        dao.insert(std);
                        msg = "Sinh viên đã được lưu!";
                    }else {
                        dao.update(std);
                        msg = "Sinh viên đã được cập nhật";
                    }
                    Snackbar snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG);
                    snackbar.show();
                    clearInputFields();

                    isEdit = false;
                    fillStudentsToListView();

                } catch (Exception ex){
                    ex.printStackTrace();
                    Toast.makeText(this, "ERROR: " + ex.getMessage()
                            , Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnDelete:
                if (isEdit && !edtStudentId.getText().toString().equals("")){
                    String id = edtStudentId.getText().toString();
                    dao.delete(id);

                    fillStudentsToListView();
                    Snackbar.make(view, "Sinh viên đã được xóa!"
                            , Snackbar.LENGTH_LONG).show();
                    clearInputFields();
                }
                break;
        }
    }

    private void clearInputFields() {
        edtStudentId.setText("");
        edtName.setText("");
        edtDate.setText("");
    }
}