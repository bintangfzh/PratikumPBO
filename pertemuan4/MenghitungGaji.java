 package pertemuan4;
// NO.3
import java.util.Scanner;
 
public class MenghitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = input.nextInt();
        
        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();
        
        double gajiPokok = 0;
        
        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000; // Menikah
                break;
            case 2:
                gajiPokok = 1500000; // Belum menikah
                break;
            case 3:
                gajiPokok = 1750000; // Cerai
                break;
            case 4:
                gajiPokok = 2000000; // Menikah dan punya anak
                break;
            default:
                System.out.println("Kode golongan tidak valid!");
                System.exit(0);
        }
        double tunjanganPasangan = 0.10 * gajiPokok;
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;
        
        System.out.println("\n--- STRUK GAJI KARYAWAN ---");
        System.out.println("NIK          : " + nik);
        System.out.println("Nama         : " + nama);
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
    }
   
}
