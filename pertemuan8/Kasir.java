package pertemuan8;

public class Kasir {
    double harga;
    int jumlah;
    double diskon;

    Kasir(double harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    Kasir(double harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    Kasir(double harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    public void hitungTotal() {
        double total = harga * jumlah;
        double potongan = total * (diskon / 100);
        double bayar = total - potongan;
        System.out.println("Total bayar: Rp" + bayar);
    }

    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        k1.hitungTotal();

        Kasir k2 = new Kasir(10000, 3);
        k2.hitungTotal();

        Kasir k3 = new Kasir(10000, 3, 10);
        k3.hitungTotal();
    }
}
