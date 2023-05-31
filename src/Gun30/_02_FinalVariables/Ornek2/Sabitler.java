package Gun30._02_FinalVariables.Ornek2;

public class Sabitler {
    final static int gunSaat=24;
    final static int saatDk=60;
    final static int dkSaniye=60;


    public static int hesapla(int gun, int saat, int dakika){
        int toplamSaniye=(gun*Sabitler.gunSaat*Sabitler.saatDk*Sabitler.dkSaniye)+
                         (saat*Sabitler.saatDk*Sabitler.dkSaniye)+
                         (dakika*Sabitler.dkSaniye);
        return toplamSaniye;
    }
}
