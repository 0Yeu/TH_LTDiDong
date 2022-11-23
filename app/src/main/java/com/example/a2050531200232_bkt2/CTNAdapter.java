package com.example.a2050531200232_bkt2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CTNAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private List<CTN> CTNList;

    public CTNAdapter(Context context, int layout, List<CTN> CTNList) {

        this.context = context;
        this.layout = layout;
        this.CTNList = CTNList;
    }

    @Override
    public int getCount() {
        return CTNList.size();
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
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);

        CTN ctn = CTNList.get(i);

        txtTen.setText(ctn.getTen());
        txtMoTa.setText(ctn.getMoTa());
        imgHinh.setImageResource(ctn.getHinh());

        return view;
    }

}
