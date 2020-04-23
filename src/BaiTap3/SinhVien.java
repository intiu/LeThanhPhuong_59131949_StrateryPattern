/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ltpnt
 */
public class SinhVien {
    private String Hoten;
    private String ngaySinh;
    private float diemTB;
    public SinhVien(String Hoten, String ngaySinh, float diemTB) {        
        this.Hoten = Hoten;       
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }
    
    public String getTen() {
        return Hoten;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public String inTT() {
        return "Họ và Tên:"+Hoten+"\n"+"Ngày sinh:"+ngaySinh+"\n"+"Điểm Trung Bình:"+diemTB;
    }
}
