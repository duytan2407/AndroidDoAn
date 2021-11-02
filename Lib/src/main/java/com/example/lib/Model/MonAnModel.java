package com.example.lib.Model;

import java.io.Serializable;

public class MonAnModel implements Serializable
{
    private String id;
    private String idmien;
    private String TenMonAn;
    private String Gia;
    private String SoLuong;
    private String HinhAnh;
    private String TTChiTiet;

    public MonAnModel() {
    }

    public MonAnModel(String id, String idmien, String tenMonAn, String gia, String soLuong, String hinhAnh, String TTChiTiet) {
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
}