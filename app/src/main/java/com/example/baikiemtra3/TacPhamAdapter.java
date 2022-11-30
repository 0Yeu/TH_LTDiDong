package com.example.baikiemtra3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TacPhamAdapter extends BaseAdapter{
    private Context context;
    private  int layout;
    private List<TacPham> TacPhamList;

    public TacPhamAdapter(Context context, int layout, List<TacPham> TacPhamList) {
        this.context = context;
        this.layout = layout;
        TacPhamList = TacPhamList;
    }

    @Override
    public int getCount() {
        return TacPhamList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewmota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        TextView star = (TextView) view.findViewById(R.id.star);

        TacPham tacPham = TacPhamList.get(i);

        txtTen.setText(tacPham.getTen());
        txtMoTa.setText(tacPham.getMoTa());
        imgHinh.setImageResource(tacPham.getHinh());
        star.setText(tacPham.getSao());

        return view;
    }
}
