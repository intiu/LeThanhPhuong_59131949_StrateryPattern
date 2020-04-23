/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author ltpnt
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HangHoa hangHoa1 = new HangHoa("Áo Thun", 445000, "Áo thun Polo Nam IS19-03084 BLACK");
        HangHoa hangHoa2 = new HangHoa("Quần Jean", 530000, "Quần Jean Nam A21 2019 R492126066");
        
        GioHang gh1 = new GioHang();
        gh1.themHH(hangHoa1);
        gh1.themHH(hangHoa2);
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên COD: "+gh1.getThanhToan(gh1.getTienHang())+"\n");
        
        GioHang gh2 = new GioHang();
        gh2.themHH(hangHoa1);
        gh2.themHH(hangHoa2);
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.inDSHH();
        System.out.println("Tiền khách phải thanh toán trên Online: "+gh2.getThanhToan(gh2.getTienHang())+"\n");
    }
    
}
