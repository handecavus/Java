package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Etçil beslenir");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Günlük 1 kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Günlük 8 saat");
    }

    @Override
    void sesi() {
        System.out.println("ciyak, fiyuuu");
    }
}
