/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Data;

/**
 *
 * @author PhamThang

 */
public class PhanCongLD {
    String ngay;
    String Toa;
    String Tang;
    String doiVS;

    public PhanCongLD() {
    }

    public PhanCongLD(String ngay, String Toa, String Tang, String doiVS) {
        this.ngay = ngay;
        this.Toa = Toa;
        this.Tang = Tang;
        this.doiVS = doiVS;
    }

    public String getNgay() {
        return ngay;
    }

    public String getToa() {
        return Toa;
    }

    public String getTang() {
        return Tang;
    }

    public String getDoiVS() {
        return doiVS;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public void setToa(String Toa) {
        this.Toa = Toa;
    }

    public void setTang(String Tang) {
        this.Tang = Tang;
    }

    public void setDoiVS(String doiVS) {
        this.doiVS = doiVS;
    }
    
    
}
