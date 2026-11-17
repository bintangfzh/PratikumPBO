package pertemuan7;

import java.util.Scanner;

public class PersegiPanjang {
    public static void hitungKeliling(double panjang, double lebar) {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang adalah: " + keliling);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();

        hitungKeliling(p, l);
    }
}