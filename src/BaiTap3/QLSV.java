/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ltpnt
 */
public class QLSV {
    List<SinhVien> dsSV = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;
    
    public void themSV(SinhVien sinhVien) {
        dsSV.add(sinhVien);
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }
    
    public void sapXep() {
        SinhVien svTam = new SinhVien();
        for(int i=0; i<dsSV.size(); i++) 
            for(int j=i+1; j<dsSV.size(); j++) {
                if(soSanh.soSanh(dsSV.get(i), dsSV.get(j)) <= 0) {
                    svTam = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, svTam);
                }
            }
    }
    
    public void inDS() {
        for(SinhVien sinhVien: dsSV) {
            System.out.println(sinhVien.inTT()+"\n");
        }
    }

}
