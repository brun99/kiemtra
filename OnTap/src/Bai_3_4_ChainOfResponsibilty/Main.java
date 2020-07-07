
package Bai_3_4_ChainOfResponsibilty;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.err.println("nhập số tiền cần vay: ");
        int soTien = 0;
        soTien = scanner.nextInt();
        
        PhoTruongPhong ptp = new PhoTruongPhong(soTien, 300, "cường",
                             new TruongPhong(soTien, 400, "A", 
                             new GiamDoc(soTien, 500, "B",
                             new ChuTich(soTien, 700, "C"))));
        ptp.duyet();
    }
}
