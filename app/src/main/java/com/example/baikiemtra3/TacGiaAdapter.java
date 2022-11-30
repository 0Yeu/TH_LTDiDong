package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TacGiaAdapter extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<TacGiaActivity> TacGiaList;

    public TacGiaAdapter(Context context, int layout, List<TacGiaActivity> tacGiaList) {
        this.context = context;
        this.layout = layout;
        TacGiaList = tacGiaList;
    }
    @Override
    public int getCount() {
        return TacGiaList.size();
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

        TacGiaActivity tacGiaActivity = TacGiaList.get(i);

        txtTen.setText(tacGiaActivity.getTen());
        txtMoTa.setText(tacGiaActivity.getMoTa());
        imgHinh.setImageResource(tacGiaActivity.getHinh());
        star.setText(tacGiaActivity.getSao());

        return view;
    }

}


