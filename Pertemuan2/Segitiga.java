// NO.5 & 6
package Pertemuan2;

public class Segitiga {
    public static void main(String[] args) {
        double a = 6; // tinggi
        double b = 8; // alas
        double luas = 0.5 * b * a;
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;
        
        System.out.println("Diketahui hasil dari perhitungan segitiga berikut:");
        System.out.println("Sisi tinggi (a) = " + a);
        System.out.println("Sisi alas (b) = " + b);
        System.out.println("-----------------------------------");
        System.out.println("Luas Segitiga = " + luas);
        System.out.println("Sisi miring (c)atau [Pythagoras] = " + c);
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
