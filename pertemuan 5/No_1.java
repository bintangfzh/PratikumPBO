// bilangan besar bilangan kecil
package pertemuan5;

import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10 ;
        int angka, terbesar = 0, terkecil = 0;
        
        System.out.println("Masukkan 10 buah bilangan:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            angka = input.nextInt();

            if (i == 1) {
                terbesar = angka;
                terkecil = angka;
            } else {
                if (angka > terbesar) terbesar = angka;
                if (angka < terkecil) terkecil = angka;
            }
        }

        System.out.println("\nBilangan terbesar adalah: " + terbesar);
        System.out.println("Bilangan terkecil adalah: " + terkecil);
    }
}
