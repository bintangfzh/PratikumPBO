package pertemuan8;

public class LuasBdng {
    int panjang;
    int lebar;

    LuasBdng(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    int luas() {
        return panjang * lebar;
    }
}

class HitungBidangHitam {
    public void hitungSelisih(LuasBdng luar, LuasBdng dalam) {
        int luasHitam = luar.luas() - dalam.luas();
        System.out.println("Luas bidang hitam: " + luasHitam);
    }

    public static void main(String[] args) {
        LuasBdng luar = new LuasBdng(10, 5);
        LuasBdng dalam = new LuasBdng(8, 4);

        HitungBidangHitam hb = new HitungBidangHitam();
        hb.hitungSelisih(luar, dalam);
    }
}
