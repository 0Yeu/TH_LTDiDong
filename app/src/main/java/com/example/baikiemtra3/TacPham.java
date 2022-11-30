package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TacPham extends AppCompatActivity {
    private String MoTa;
    private int Hinh;
    private String Ten;
    private String Sao;

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSao() {
        return Sao;
    }

    public void setSao(String sao) {
        Sao = sao;
    }

    public TacPham(String ten, String moTa, int hinh, String sao) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
        Sao = sao;
    }
}