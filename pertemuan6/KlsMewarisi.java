package pertemuan6;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread baru sedang berjalan: " + Thread.currentThread().getName());
    }
}
public class KlsMewarisi {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Thread utama (main) berjalan.");
    }
}
