//NO.2
package pertemuan3;
import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.print("Masukkan Nama       : ");
        String nama = dis.readLine();

        System.out.print("Masukkan Total Belanja : ");
        double totalBelanja = Double.parseDouble(dis.readLine());

        System.out.print("Masukkan Diskon (%) : ");
        double diskonPersen = Double.parseDouble(dis.readLine());

        double diskon = (diskonPersen / 100) * totalBelanja;
        double total = totalBelanja - diskon;

        System.out.print("Masukkan Bayar      : ");
        double bayar = Double.parseDouble(dis.readLine());

        double kembalian = bayar - total;

        System.out.println("\n--- STRUK PEMBELANJAAN ---");
        System.out.println("Nama      : " + nama);
        System.out.println("Total     : " + total);
        System.out.println("Bayar     : " + bayar);
        System.out.println("Kembalian : " + kembalian);
    }
}
