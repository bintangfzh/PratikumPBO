// NO. 6
package pertemuan4;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String statusMember = input.next();
        
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();
        
        double diskon = 0;
        
        if (statusMember.equalsIgnoreCase("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        
        double totalBayar = totalBelanja - diskon;
        
        System.out.print("Masukkan uang yang diberikan pembeli (Rp): ");
        double uangDiberikan = input.nextDouble();
        
        double kembalian = uangDiberikan - totalBayar;
        
        System.out.println("\n====== STRUK PEMBELANJAAN ======");
        System.out.println("Total Belanja  : Rp " + totalBelanja);
        System.out.println("Diskon         : Rp " + diskon);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("Uang Diberikan : Rp " + uangDiberikan);
        System.out.println("Uang Kembalian : Rp " + kembalian);
    }
}
