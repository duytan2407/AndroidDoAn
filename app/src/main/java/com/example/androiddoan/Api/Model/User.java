package com.example.androiddoan.Api.Model;

public class User
{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public User(String id, String email, String password, String SĐT, String diaChi, String hoTen) {
        this.id = id;
        Email = email;
        this.password = password;
        this.SĐT = SĐT;
        DiaChi = diaChi;
        HoTen = hoTen;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", Email='" + Email + '\'' +
                ", password='" + password + '\'' +
                ", SĐT='" + SĐT + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                ", HoTen='" + HoTen + '\'' +
                '}';
    }

    private String id;
    private String Email;
    private String password;
    private String SĐT;
    private String DiaChi;
    private String HoTen;


}
