package com.example.qlsv_sqlite.model;

public class Classes {
    private Integer Id;
    private String Name;

    public Classes() {
    }

    public Classes(Integer id, String name) {
        Id = id;
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
