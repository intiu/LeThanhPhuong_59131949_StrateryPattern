/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author ltpnt
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {    

        SimpleDateFormat ns = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("Lê Thành Phương", ns.parse("04/02/1999"), 6.5f);
        SinhVien sv2 = new SinhVien("Nguyễn Hoàng Anh Tiến", ns.parse("01/07/1999"), 8.0f);
        SinhVien sv3 = new SinhVien("Nguyễn Minh Hoàng", ns.parse("14/10/1999"), 8.3f);
        SinhVien sv4 = new SinhVien("Nguyễn Tấn Vĩnh", ns.parse("21/03/1999"), 7.6f);
        SinhVien sv5 = new SinhVien("Hồ Lê Thanh Thiện", ns.parse("05/01/1999"), 9.2f);
        
        QLSV dssv = new QLSV();
        dssv.themSV(sv1);
        dssv.themSV(sv2);
        dssv.themSV(sv3);
        dssv.themSV(sv4);
        dssv.themSV(sv5);
        
        dssv.setSoSanh(new SoSanhTheoTen());
        dssv.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo tên:"+"\n");
        dssv.inDS();
        
        dssv.setSoSanh(new SoSanhTheoDiem());
        dssv.sapXep();
        System.out.println("Sắp xếp danh sách sinh viên theo điểm:"+"\n");
        dssv.inDS();
    }   
}
