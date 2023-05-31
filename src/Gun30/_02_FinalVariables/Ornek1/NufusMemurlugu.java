package Gun30._02_FinalVariables.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1=new Vatandas("hande");
        Vatandas v2=new Vatandas("çağla");
        Vatandas v3=new Vatandas("gizem");

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

        //v1.tcNo=456;
        //final değişkenlerin esadece bir kez veri atanabilir
        //o da ya tanımlanırken, ya da Constructor da

        final double pi=3.14; //tanımlarken
        //pi=5; sonradan değiştirilemez
        //Math.PI; javanın nasıl yaptığına baktım, o da bizim gibi yapmış
    }
}
//final: değer atandıktan sonra değiştirilmeyi engelliyor
//       bu sebeple hem sabit değerler için hem de sonradan değişmesini
//       istemediğimiz değerler için kullanılır
//static sayac ise: her yeni nesne oluşturulduğunda yeni
//                  artan değer almasını sağlıyor