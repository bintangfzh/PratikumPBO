package pertemuan7;

class DataSumpahPemuda {
    public DataSumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia,");
    }

    void tampilkanIsiSumpah() {
        System.out.println("1. Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("2. Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("3. Menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class SumpahPemuda {
    public static void main(String[] args) {
        DataSumpahPemuda sp = new DataSumpahPemuda();
        
        sp.tampilkanIsiSumpah();
    }
}