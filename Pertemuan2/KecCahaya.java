// No.8
package Pertemuan2;

public class KecCahaya {
    public static void main(String[] args) {
        double jarakBulan = 384400; // km
        double jarakMatahari = 152.1 * 1000000; // 152.1 juta km
        double kecepatanCahaya = 300000; // km/s
        
        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;
        
        System.out.println("Waktu tempuh Bumi ke Bulan: " + 
                waktuBulan + " detik (" + (waktuBulan / 60) + " menit)");
        System.out.println("Waktu tempuh Bumi ke Matahari: " + 
                waktuMatahari + " detik (" + (waktuMatahari / 60) + " menit / " + 
                (waktuMatahari / 3600) + " jam)");
    }
}
