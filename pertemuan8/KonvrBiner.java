package pertemuan8;

import java.util.Scanner;

public class KonvrBiner {
    int desimal;

    KonvrBiner(int desimal) {
        this.desimal = desimal;
    }

    public void keBiner() {
        int temp = desimal;
        String biner = "";

        if (temp == 0) {
            biner = "0";
        } else {
            while (temp > 0) {
                biner = (temp % 2) + biner;
                temp = temp / 2;
            }
        }
        System.out.println("Biner: " + biner);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int angka = input.nextInt();

        KonvrBiner kb = new KonvrBiner(angka);
        kb.keBiner();
    }
}
