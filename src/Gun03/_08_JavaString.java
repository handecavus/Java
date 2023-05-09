package Gun03;

public class _08_JavaString {
    public static void main(String[] args) {

        String ad="Hande"; // String: kelime veya kelimeleri saklamak için kullanılır
        // sınırlarını " " ile belirlenir.
        String soyad="Çavuş";
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("ad ve soyad = " + ad + "\t" + soyad);
        // +lar burada stringler arasında olduğu birleştirir

        String tamAd= "Hande" + " " + "Çavuş";
        System.out.println("tamAd = " + tamAd);



    }
}
