package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        double oran=3.2;
        int sayi=5;

        sayi= (int) oran; // büyük bir alanı küçük bir alana atıyorsun
        // tehlikeli işlem yapıyorsun, bundan dolayı challenger patladı.
        // değerlere bak, eğer oluşan veri kaybını anladıysan ve kabulünse
        // bana bunu bilerek yaptığını göster.

        System.out.println("sayi = " + sayi);

        /*******************************************/
        byte kisaKenar=5;
        byte uzunKenar=7;

        byte cevre= (byte) (kisaKenar + kisaKenar + uzunKenar + uzunKenar);
        // sen eşitliğin 2.tarafı rakamlar toplandı, benim için toplam burada INT durumunda
        // byte cevre= 5+7+5+7;  // int i -> byte atmaya çalışıyorsun.
        // eğer veri kaybı olmayacağınan eminsen, veya veri kaybı önemli değilse
        // bana bunu yazarak göster.
        System.out.println("cevre = " + cevre);

        int cevre2= kisaKenar + kisaKenar + uzunKenar + uzunKenar; //böyle olursa veri kaybı olmaz (alternatif çözüm)
        System.out.println("cevre2 = " + cevre2);


    }
}
