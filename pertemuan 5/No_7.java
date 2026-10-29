package pertemuan5;

public class No_7 {
    public static void main(String[] args) {
        System.out.println("Menggunakan i++");
        int i = 0;
        while (i < 3) {
            System.out.println("Nilai i: " + i++); 
        }

        System.out.println("\nMenggunakan ++i");
        int j = 0;
        while (j < 3) {
            System.out.println("Nilai j: " + ++j); 
        }
    }
}
