package com.example.androiddoan.Api.Model;

import java.io.Serializable;

public class NguoiDungModel implements Serializable {
    private int id;
    private String HoTen;
    private String Email;
    private String password;
    private String SĐT;
    private String DiaChi;
    private String Vaitro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getVaitro() {
        return Vaitro;
    }

    public void setVaitro(String vaitro) {
        Vaitro = vaitro;
    }

    @Override
    public String toString() {
        return "NguoiDungModel{" +
                "id=" + id +
                ", HoTen='" + HoTen + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                ", SĐT='" + SĐT + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", Vaitro='" + Vaitro + '\'' +
                '}';
    }
}
