package pertemuan7;
//Kelas (Class) bertindak sebagai blueprint,
// yang mendefinisikan atribut dan perilaku yang akan dimiliki oleh suatu entitas.
    
//Objek (Object) adalah hasil instansiasi 
//(wujud nyata atau instance) dari sebuah kelas.

//Contoh
class Mobil {
    // Atribut 
    String merk;
    String warna;
    int tahun;

    // Method 
    void infoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
}
public class SoalNo1 {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        
        mobilku.merk = "Honda Civic";
        mobilku.warna = "Hitam";
        mobilku.tahun = 2023;

        mobilku.infoMobil();
    }
}
