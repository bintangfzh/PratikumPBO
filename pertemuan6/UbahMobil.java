package pertemuan6;

public class UbahMobil {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        
        mobil[1] = "Rubicon"; 

        System.out.println("Nilai indeks yang telah diubah: " + mobil[1]);
    }
}
