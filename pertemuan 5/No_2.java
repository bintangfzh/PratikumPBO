package pertemuan5;

import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang diinput: ");
        int n = input.nextInt();
        
        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double angka = input.nextDouble();
            total += angka;
        }

        double rata2 = total / n;
        System.out.println("\nTotal jumlah bilangan: " + total);
        System.out.println("Rata-rata bilangan: " + rata2);
    }
}
