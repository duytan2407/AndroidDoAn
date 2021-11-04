package com.example.androiddoan.models;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.DiffUtil;

import com.bumptech.glide.Glide;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String idmien;
    private String TenMonAn;
    private String Gia;
    private String SoLuong;
    private String HinhAnh;
    private String TTChiTiet;

    public Product() {
    }

    public Product(String id, String idmien, String tenMonAn, String gia, String soLuong, String hinhAnh, String TTChiTiet) {
        this.id = id;
        this.idmien = idmien;
        this.TenMonAn = tenMonAn;
        this.Gia = gia;
        this.SoLuong = soLuong;
        this.HinhAnh = hinhAnh;
        this.TTChiTiet = TTChiTiet;
    }

    public String getIdmien ()
    {
        return idmien;
    }

    public void setIdmien (String idmien)
    {
        this.idmien = idmien;
    }

    public String getTenMonAn ()
    {
        return TenMonAn;
    }

    public void setTenMonAn (String TenMonAn)
    {
        this.TenMonAn = TenMonAn;
    }

    public String getSoLuong ()
    {
        return SoLuong;
    }

    public void setSoLuong (String SoLuong)
    {
        this.SoLuong = SoLuong;
    }

    public String getTTChiTiet ()
    {
        return TTChiTiet;
    }

    public void setTTChiTiet (String TTChiTiet)
    {
        this.TTChiTiet = TTChiTiet;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getHinhAnh ()
    {
        return HinhAnh;
    }

    public void setHinhAnh (String HinhAnh) { this.HinhAnh = HinhAnh; }

    public String getGia () { return Gia; }

    public void setGia (String Gia)
    {
        this.Gia = Gia;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [idmien = "+idmien+", TenMonAn = "+TenMonAn+", SoLuong = "+SoLuong+", TTChiTiet = "+TTChiTiet+", id = "+id+", HinhAnh = "+HinhAnh+", Gia = "+Gia+"]";
    }
    @BindingAdapter("android:productImage")
    public static  void loadImage(ImageView imageView, String imageURL ){
        Glide.with(imageView)
                .load(imageURL)
                .fitCenter()
                .into(imageView);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getId().equals(product.getId()) && getTenMonAn().equals(product.getTenMonAn());
    }

    public static DiffUtil.ItemCallback<Product> itemCallback = new DiffUtil.ItemCallback<Product>() {
        @Override
        public boolean areItemsTheSame(@NonNull Product oldItem, @NonNull Product newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Product oldItem, @NonNull Product newItem) {
            return oldItem.equals(newItem);
        }
    };
}
