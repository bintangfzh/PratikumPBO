package pertemuan6;

import java.util.Arrays;
import java.util.Scanner;

public class VariableArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. 
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // b. 
        System.out.println("Masukkan nilai untuk " + n + " elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // c. 
        int max = arr[0], min = arr[0];
        int idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idxMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                idxMin = i;
            }
        }
        System.out.println("\n--- Poin C ---");
        System.out.println("Nilai terbesar: " + max + " pada indeks ke-" + idxMax);
        System.out.println("Nilai terkecil: " + min + " pada indeks ke-" + idxMin);

        // d. 
        double jumlah = 0;
        for (int val : arr) {
            jumlah += val;
        }
        double rataRata = jumlah / n;
        System.out.println("\n--- Poin D ---");
        System.out.println("Jumlah total data: " + jumlah);
        System.out.println("Nilai rata-rata: " + rataRata);

        // e. 
        int jumlahIndeksGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahIndeksGanjil += arr[i];
        }
        System.out.println("\n--- Poin E ---");
        System.out.println("Jumlah elemen berindeks ganjil: " + jumlahIndeksGanjil);

        // f. 
        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahIndeksGenap += arr[i];
        }
        System.out.println("\n--- Poin F ---");
        System.out.println("Jumlah elemen berindeks genap: " + jumlahIndeksGenap);

        // g. 
        System.out.println("\n--- Poin G ---");
        int hasilCheck = jumlahIndeksGenap; 
        if (hasilCheck % 2 == 0) {
            System.out.println("Hasil penjumlahan berindeks genap (" + hasilCheck + ") adalah: GENAP");
        } else {
            System.out.println("Hasil penjumlahan berindeks genap (" + hasilCheck + ") adalah: GANJIL");
        }

        // h. 
        Arrays.sort(arr);
        System.out.println("\n--- Poin H ---");
        System.out.println("Elemen array setelah diurutkan: " + Arrays.toString(arr));

    }
}
