/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author ltpnt
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        context ct1=new context();
        ct1.setTinhtoan(new Cong());
        System.out.println("Tổng của 75 + 12 là: "+ct1.tinh(75, 12));
        context ct2=new context();
        ct2.setTinhtoan(new Tru());
        System.out.println("Hiệu của 54 - 78 là: "+ct2.tinh(54, 78));
    }
    
}
