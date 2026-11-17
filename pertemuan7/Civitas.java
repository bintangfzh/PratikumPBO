package pertemuan7;

import java.util.Scanner;

class CivitasAkademik {
    String nama;

    public CivitasAkademik(String nama) {
        this.nama = nama;
    }
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
    }
}
class Dosen extends CivitasAkademik {
    String nidn;
    public Dosen(String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
    }
    void tampilkanStatus() {
        super.tampilkanInfo();
        System.out.println("Status: Dosen Fakultas Teknik (NIDN: " + nidn + ")");
        System.out.println("-----------------------------------");
    }
}
class Mahasiswa extends CivitasAkademik {
    String npm;

    public Mahasiswa(String nama, String npm) {
        super(nama);
        this.npm = npm;
    }
    void tampilkanStatus() {
        super.tampilkanInfo();
        System.out.println("Status: Mahasiswa Fakultas Teknik (NPM: " + npm + ")");
        System.out.println("-----------------------------------");
    }
}
class Staff extends CivitasAkademik {
    String bagian;

    public Staff(String nama, String bagian) {
        super(nama);
        this.bagian = bagian;
    }
    void tampilkanStatus() {
        super.tampilkanInfo();
        System.out.println("Status: Staff Fakultas Teknik (Bagian: " + bagian + ")");
        System.out.println("-----------------------------------");
    }
}

public class Civitas {
    public static void main(String[] args) {
        Dosen dsn = new Dosen("Dr. Budi, M.T.", "00123456");
        Mahasiswa mhs = new Mahasiswa("Bintang", "5520125064");
        Staff stf = new Staff("Siti, S.Kom.", "Administrasi Akademik");

        dsn.tampilkanStatus();
        mhs.tampilkanStatus();
        stf.tampilkanStatus();
    }
}