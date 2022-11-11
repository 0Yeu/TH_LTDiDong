package com.example.qlsv_sqlite.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.qlsv_sqlite.R;
import com.example.qlsv_sqlite.model.Classes;
import com.example.qlsv_sqlite.sqlite.ClassesDao;

public class NewClassDialog extends Dialog implements View.OnClickListener {

    private Context context;
    private EditText edtClassId, edtName;

    public NewClassDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_new_class);

        edtClassId = (EditText) findViewById(R.id.edtClassId);
        edtName = (EditText) findViewById(R.id.edtName);

        findViewById(R.id.btnSave).setOnClickListener(this);
        findViewById(R.id.btnClose).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnSave:
                Classes cls = new Classes();
                cls.setName(edtName.getText().toString());
                ClassesDao dao = new ClassesDao(context);
                dao.insert(cls);
                Toast.makeText(context, "Lớp đã được lưu !", Toast.LENGTH_SHORT).show();
                dismiss();
                break;
            case R.id.btnClose:
                dismiss();
                break;
        }
    }
}
