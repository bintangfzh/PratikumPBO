package pertemuan6;

import java.util.Scanner;

public class NilaiMhs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = scanner.nextInt();
        scanner.nextLine(); 

        String[] nama = new String[jumlahMhs];
        double[] nilai = new double[jumlahMhs];
        String[] status = new String[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            nama[i] = scanner.nextLine();
            System.out.print("Nilai  : ");
            nilai[i] = scanner.nextDouble();
            scanner.nextLine(); 

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("\n\t\tDaftar Nilai Mahasiswa");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-8s | %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.printf("%-5d | %-20s | %-8.0f | %-15s\n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("--------------------------------------------------");
    }
}
