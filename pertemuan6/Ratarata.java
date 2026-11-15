package pertemuan6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ratarata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang ingin dirata-rata: ");
        try {
            int n = scanner.nextInt();
            double[] bilangan = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                bilangan[i] = scanner.nextDouble(); 
                total += bilangan[i];
            }

            double rataRata = total / n;
            System.out.println("Nilai rata-rata dari bilangan tersebut adalah: " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("Penanganan Kesalahan: Anda memasukkan karakter bukan angka! Program dihentikan.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Penanganan Kesalahan: Jumlah elemen array tidak boleh negatif.");
        } finally {
        }
    }
}
