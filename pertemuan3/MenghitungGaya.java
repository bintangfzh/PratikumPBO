//NO.4
package pertemuan3;

import java.util.Scanner;

public class MenghitungGaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Massa (M): ");
        double m = input.nextDouble();

        System.out.print("Masukkan nilai Kecepatan (V): ");
        double v = input.nextDouble();

        System.out.print("Masukkan nilai Jari-jari (r): ");
        double r = input.nextDouble();

        double fc = (m * (v * v)) / r;

        System.out.println("Hasil Gaya Sentripetal (Fc) = " + fc);
    }
}
