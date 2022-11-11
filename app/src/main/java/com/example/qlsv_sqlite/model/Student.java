package com.example.qlsv_sqlite.model;

import java.util.Date;

public class Student {
    private String Id;
    private String Name;
    private Date Date;
    private int classId;

    public Student() {
    }

    public Student(String id, String name, java.util.Date date, int classId) {
        Id = id;
        Name = name;
        Date = date;
        this.classId = classId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
