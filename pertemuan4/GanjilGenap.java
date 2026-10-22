package pertemuan4;
//NO 1
import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        int bilangan = input.nextInt();
        
        if (bilangan % 2 == 0){
            System.out.println(bilangan + " adalah bilangan Genap ");
        }else{
            System.out.println(bilangan + " adalah bilangan Ganjil ");
        }
    }
}
