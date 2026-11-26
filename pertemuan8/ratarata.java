package pertemuan8;


public class ratarata {
    double hasil;
    ratarata() {
    }

    ratarata(double hasil) {
        this.hasil = hasil;
    }

    ratarata prosesRata(int[] data) {
        int jumlah = 0;
        for (int i = 0; i < data.length; i++) {
            jumlah += data[i];
        }
        double rata = (double) jumlah / data.length;
        return new ratarata(rata);
    }

    public void tampilkan() {
        System.out.println("Rata-rata: " + hasil);
    }

    public static void main(String[] args) {
        int[] nilai = {80, 90, 70, 85};
        ratarata r = new ratarata();
        ratarata objekHasil = r.prosesRata(nilai);
        objekHasil.tampilkan();
    }
}
