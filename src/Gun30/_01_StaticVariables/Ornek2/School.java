package Gun30._01_StaticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1, "Nur Şevval");
        Student ogr2=new Student(2, "Hande Çavuş");
        Student ogr3=new Student(3, "Çağla Çavuş");
        //problem:  hem id yi takip etmek zorundayım,
        //hem de hata olasılığı yüksek

        Student ogr10=new Student("Merve Bahar");
        Student ogr11=new Student("Simge Aydın");
        Student ogr12=new Student("Gizem Akıl");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);





    }
}
