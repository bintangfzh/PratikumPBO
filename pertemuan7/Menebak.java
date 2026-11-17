package pertemuan7;


public class Menebak {
    public static int prosesTanggalLahir(int bulan, int tanggal) {
        int hasilAkhir = (bulan * 100) + tanggal;
        return hasilAkhir;
    }
    
    public static void main(String[] args) {
        int bulanLahir = 1; 
        int tanggalLahir = 14;

        int hasil = prosesTanggalLahir(bulanLahir, tanggalLahir);

        System.out.println("Bulan lahir: " + bulanLahir);
        System.out.println("Tanggal lahir: " + tanggalLahir);
        System.out.println("Hasil akhir format angka = " + hasil);
    }
}
