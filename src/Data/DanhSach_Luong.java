/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author tranq
 */
public class DanhSach_Luong extends NhanVien {
    float luongCb, soNgay, heSo, luong;

    public DanhSach_Luong( String hoTen, String viTri, String sDT, String queQuan,float luongCb, float soNgay, float heSo) {
        super(hoTen, viTri, sDT, queQuan);
        this.luongCb = luongCb;
        this.soNgay = soNgay;
        this.heSo = heSo;
        this.luong = tinhluong();
    }
     
    
    public DanhSach_Luong() {
    }

    public float getLuongCb() {
        return luongCb;
    }

    public void setLuongCb(float luongCb) {
        this.luongCb = luongCb;
    }

    public float getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(float soNgay) {
        this.soNgay = soNgay;
    }

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public float tinhluong() {
        return luongCb * soNgay * heSo;
    }
}