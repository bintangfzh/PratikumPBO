package pertemuan6;

public class NoSepuluh {
    public static void main(String[] args) {
        Object[] data = {19, 0.2, 'C', "Java", true};

        System.out.println("Menampilkan data campuran:");
        for (Object item : data) {
            System.out.println(item + " (Tipe: " + item.getClass().getSimpleName() + ")");
        }
    }
}
