/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author huyng
 */
public class TuyenDung implements Serializable{
    private String tieuDe, viTri, noiDung, mucLuong, thoiGian;

    public TuyenDung() {
        tieuDe = viTri = noiDung = mucLuong = thoiGian = "";
    }

    public TuyenDung(String tieuDe, String viTri, String noiDung, String mucLuong, String thoiGian) {
        this.tieuDe = tieuDe;
        this.viTri = viTri;
        this.noiDung = noiDung;
        this.mucLuong = mucLuong;
        this.thoiGian = thoiGian;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getViTri() {
        return viTri;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public String getMucLuong() {
        return mucLuong;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public void setMucLuong(String mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
    
}
