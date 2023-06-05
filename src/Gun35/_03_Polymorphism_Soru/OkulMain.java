package Gun35._03_Polymorphism_Soru;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci ogr=new Ogrenci("Çağla","Çavuş","Öğrenci","5A");
        Calisan cal=new Calisan("Hande","Çavuş","Yazılım","BIM");

//        System.out.println("ogr = " + ogr);
//        System.out.println("cal = " + cal);
//        her bir class kendi toStringini kullanıyor bu yüzden tek metod değil

        Kisi.kimlikYaz(ogr);
        Kisi.kimlikYaz(cal);


    }
}
