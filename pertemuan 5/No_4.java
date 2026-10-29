package pertemuan5;

import java.util.Scanner;

public class No_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();
        int total = 0;

        System.out.print("Deret bilangan ganjil: ");
        for (int i = 1; i <= n; i++) {
            int ganjil = 2 * i - 1;
            System.out.print(ganjil + " ");
            total += ganjil;
        }
        System.out.println("\nTotal penjumlahan : " + total);
    }
}
