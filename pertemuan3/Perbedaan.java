//NO.3
package pertemuan3;

import java.util.Scanner;
import java.io.*;

public class Perbedaan {
    public static void main(String[] args) throws IOException {
        // Contoh Scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur (Scanner): ");
        int umur = scanner.nextInt(); // Langsung integer
        System.out.println("Umur Anda: " + umur);

        // Contoh BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan tahun lahir (BufferedReader): ");
        String temp = br.readLine();
        int tahunLahir = Integer.parseInt(temp); // Konversi manual
        System.out.println("Tahun Lahir Anda: " + tahunLahir);
    }
}

// Penjelasan
//1. Package: Scanner berada di package java.util, sedangkan BufferedReader berada di package java.io.
//2. Konversi Tipe Data: Scanner dapat langsung membaca tipe data tertentu secara langsung (seperti nextInt(),
//nextDouble()) tanpa perlu konversi manual.Sementara BufferedReader membaca semua inputan sebagai String,
//sehingga membutuhkan konversi tipe data (misal: Integer.parseInt()) jika ingin memasukkan data angka
//3.BufferedReader menggunakan penyangga (buffer) teks sehingga proses pembacaan data dari stream 
//karakter lebih efisien untuk teks panjang.
