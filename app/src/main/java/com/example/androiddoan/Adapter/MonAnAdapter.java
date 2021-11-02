package com.example.androiddoan.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lib.Model.MonAnModel;
import com.example.androiddoan.R;
import com.squareup.picasso.Picasso;

public class MonAnAdapter extends ArrayAdapter<MonAnModel> {
    Activity context;
    int resource;

    public MonAnAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resource= resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View monanView = layoutInflater.inflate(this.resource, null);
        ImageView img = monanView.findViewById(R.id.imageView);
        TextView ten = monanView.findViewById(R.id.txt1);
        TextView gia = monanView.findViewById(R.id.txt2);
        MonAnModel monan = getItem(position);
        ten.setText("Ten Mon An: " + monan.getTenMonAn());
        gia.setText("Gia: " + monan.getGia());

        Picasso.get().load(monan.getHinhAnh()).into(img);
        return monanView;
    }
}
