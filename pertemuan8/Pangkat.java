package pertemuan8;

import java.util.Scanner;

public class Pangkat {
    double basis;
    int eksponen;

    Pangkat(double basis, int eksponen) {
        this.basis = basis;
        this.eksponen = eksponen;
    }

    public void hitung() {
        double hasil = 1;
        for (int i = 1; i <= eksponen; i++) {
            hasil *= basis;
        }
        System.out.println("Hasil: " + hasil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan basis: ");
        double b = input.nextDouble();
        System.out.print("Masukkan pangkat: ");
        int e = input.nextInt();

        Pangkat p = new Pangkat(b, e);
        p.hitung();
    }
}
