package Gun39._01_OOP_Soru;

public class Kedi extends Hayvan{
    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Mama ve balık");
    }

    @Override
    void yemekMiktari() {
        System.out.println("Günde 100 gr yemek yer");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Günde 16 saat uyur");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
