package pertemuan8;

public class BarisanAngka {
    int angka;

    BarisanAngka(int angka) {
        this.angka = angka;
    }
}
class Barisan {
    public void kaliDua(BarisanAngka n) {
        n.angka = n.angka * 2;
    }

    public void cetakBarisan() {
        BarisanAngka x = new BarisanAngka(6);
        for (int i = 1; i <= 5; i++) {
            System.out.print(x.angka + " ");
            kaliDua(x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Barisan b = new Barisan();
        b.cetakBarisan();
    }
}
