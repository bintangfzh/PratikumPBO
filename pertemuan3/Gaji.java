// NO. 1
package pertemuan3;
import java.util.Scanner;
public class Gaji {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String npm = "5520125064";
        String nama = "Bintang Fauziah"; 
        String alamat = "Cianjur"; 
        String jabatan = "Manajer";

        double gajiPokok = 2000000;      // P1
        double tunjanganJabatan = 300000; // P2
        double tunjanganIstri = 200000;   // P3
        double tunjanganAnak = 150000;    // P4

        double totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
        double pajak = 0.10 * (gajiPokok + tunjanganJabatan + tunjanganAnak);
        double gajiBersih = totalGaji - pajak;

        System.out.println("=== DATA KARYAWAN ===");
        System.out.println("Nomor Induk Karyawan : " + npm);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok (P1)      : " + gajiPokok);
        System.out.println("Tunjangan Jabatan(P2): " + tunjanganJabatan);
        System.out.println("Tunjangan Istri (P3) : " + tunjanganIstri);
        System.out.println("Tunjangan Anak (P4)  : " + tunjanganAnak);
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak Penghasilan    : " + pajak);
        System.out.println("Gaji Bersih          : " + gajiBersih);
    } 
}
