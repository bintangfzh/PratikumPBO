package pertemuan8;

import java.util.Scanner;

public class NilaiFak {
    int n;

    NilaiFak(int n) {
        this.n = n;
    }

    public void hitung() {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        System.out.println("Hasil " + n + "! = " + hasil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        NilaiFak f = new NilaiFak(angka);
        f.hitung();
    }
}
