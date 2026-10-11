//NO.9
package Pertemuan2;

public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;
        //Celcius ke Fahrenheit & sebaliknya
        double cToF = (C * 9/5) + 32;
        double fToC = (F - 32) * 5/9;
        //Celcius ke Reamur & sebaliknya
        double cToR = C * 4/5;
        double rToC = R * 5/4;
        //Fahrenheit ke Reamur & sebaliknya
        double fToR = (F - 32) * 4/9;
        double rToF = (R * 9/4) + 32;
        
        System.out.println("=== A. Celcius <-> Fahrenheit ===");
        System.out.println(C + " C = " + cToF + " F");
        System.out.println(F + " F = " + fToC + " C");
        
        System.out.println("\n=== B. Celcius <-> Reamur ===");
        System.out.println(C + " C = " + cToR + " R");
        System.out.println(R + " R = " + rToC + " C");
        
        System.out.println("\n=== C. Fahrenheit <-> Reamur ===");
        System.out.println(F + " F = " + fToR + " R");
        System.out.println(R + " R = " + rToF + " F");
    }
}
