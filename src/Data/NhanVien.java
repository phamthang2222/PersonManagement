/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Data;

/**
 *
 * @author PhamThang

 */
public class NhanVien {
    String hoTen;
    String namSinh;
    String gioiTinh;
    String viTri;
    String sDT;
    String queQuan;
    String Cccd;
    String doiVS;
    

    public NhanVien(String hoTen, String namSinh, String gioiTinh, String viTri, String sDT, String queQuan, String Cccd) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.viTri = viTri;
        this.sDT = sDT;
        this.queQuan = queQuan;
        this.Cccd = Cccd;
    }

    public NhanVien(String hoTen, String namSinh, String gioiTinh, String viTri, String sDT, String doiVS) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.viTri = viTri;
        this.sDT = sDT;
        this.doiVS = doiVS;
    }
    
    public NhanVien(String hoTen, String viTri, String sDT, String queQuan) {
        this.hoTen = hoTen;
        this.viTri = viTri;
        this.sDT = sDT;
        this.queQuan = queQuan;
    }
    
    public NhanVien(){
        
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public String getCccd() {
        return Cccd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getViTri() {
        return viTri;
    }

    public String getsDT() {
        return sDT;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getDoiVS() {
        return doiVS;
    }

    public void setDoiVS(String doiVS) {
        this.doiVS = doiVS;
    }
    
    
}
