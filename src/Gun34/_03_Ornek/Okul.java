package Gun34._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("Hande Çavuş", OgrTip.LISE,"SAY");
        LiseOgrencisi lo2=new LiseOgrencisi("Çağla Çavuş", OgrTip.LISE,"SÖZ");
        ilkOgrencisi io=new ilkOgrencisi("Simge Aydın", OgrTip.ILK,"Satranç");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);
    }
}
