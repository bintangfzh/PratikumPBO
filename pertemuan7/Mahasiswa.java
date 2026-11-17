package pertemuan7;

import java.util.Scanner;

class MahasiswaKampus {
    String nama;
    String npm;
    String kelas;

    public MahasiswaKampus(String nama, String npm, String kelas) {
        this.nama = nama;  
        this.npm = npm;
        this.kelas = kelas;
    }
    void cetakData() {
        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}
public class Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();

        MahasiswaKampus mhs = new MahasiswaKampus(nama, npm, kelas);

        mhs.cetakData();

    }
}
