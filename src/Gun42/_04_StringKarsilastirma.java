package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {

        //Stringlerde neden == yerine equal kullanılıyor?

        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        //İLKEL tipleri karşılaştırdığından 2sinde de DEĞERLERİ karşılaştırır
        //çünkü başka bir şeyi yok
        if (cumle1 == cumle2){
            System.out.println("cümle 1 cümle 2ye eşit");
        }
        else
            System.out.println("cümle 1 cümle 2ye eşit DEĞİL");

        if (cumle1.equals(cumle2)){
            System.out.println("cümle 1 cümle 2ye eşit");
        }
        else
            System.out.println("cümle 1 cümle 2ye eşit DEĞİL");

        /******** Referans TİPLERDE ise durum ********/
        //scanner ile ekrandan okunduğunda aşağıdaki gibi oluyor
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if (cumle3 == cumle4){ //adresleri karşıalştırır
            System.out.println("cümle 3 cümle 4e eşit");
        }
        else
            System.out.println("cümle 3 cümle 4e eşit DEĞİL");

        if (cumle3.equals(cumle4)){ //değerleri aynı mı
            System.out.println("cümle 3 cümle 4e eşit");
        }
        else
            System.out.println("cümle 3 cümle 4e eşit DEĞİL");



    }
}
