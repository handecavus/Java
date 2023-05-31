package Gun30._01_StaticVariables.Ornek1;

public class Okul {
    public static void main(String[] args) {

//        Ogrenci ogr1=new Ogrenci("Hande","Çavuş","Karamehmet İlkokulu");
//        Ogrenci ogr2=new Ogrenci("Çağla","Çavuş","Karamehmet İlkokulu");
//        Ogrenci ogr3=new Ogrenci("Burhan","Altıntop","Tokat İlkokulu");
//
//        //...
//        //...
//        Ogrenci ogr499=new Ogrenci("İsmet","Temur","Yıldırım İlkokulu");
//        Ogrenci ogr500=new Ogrenci("Ali","Onbaşı","Emir-Koop");


        Ogrenci ogr1=new Ogrenci("Hande","Çavuş");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Emir-Koop İlkokulu";
        System.out.println("ogr1 tekrar = " + ogr1);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

        Ogrenci ogr2=new Ogrenci("Nazlı","Baklavacıoğlu Angelopoulos");
        System.out.println("ogr2 = " + ogr2);


    }
}
