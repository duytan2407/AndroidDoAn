package com.example.androiddoan.Api.Model;

public class User {



    private String HoTen;
    private String Email;
    private String password;
    private String SĐT;
    private String DiaChi;
    private String Vaitro;


    public User(String hoTen, String email, String password, String SĐT, String diaChi, String vaitro) {
        HoTen = hoTen;
        Email = email;
        this.password = password;
        this.SĐT = SĐT;
        DiaChi = diaChi;
        Vaitro = vaitro;
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
        return "User{" +
                "HoTen='" + HoTen + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                ", SĐT='" + SĐT + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", Vaitro='" + Vaitro + '\'' +
                '}';
    }
}
