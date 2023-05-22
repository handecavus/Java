package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        System.out.println();
        merhabaYaz(); // giden yok, dönen yok
        toplamYaz(4,5); // giden var, dönen yok (fonksiyonu bir şeye eşitleyebiliyor musun)
        int enb= Math.max(4,5); // giden var, döneni var (fonksiyonu bir şeye eşitleyebiliyor musun)
        double sayi=Math.random(); // gideni yok, döneni var

        enbYaz(4,5);
        enb=enbBul(4,5);
        System.out.println("enb = " + enb);
        // fonksiyonda return olduğu için main de yazdırabiliyoruz,
        // yani fonksiyonun sonucunu alabiliyoruz

    }
    public static int enbBul(int a, int b){ // dönecek tip
        int donecek=0;
        if (a>b){
            donecek=a;
        }
        else {
            donecek = b;
        }
        return donecek; // dönecek değer
    }

    public static void enbYaz(int a, int b){
        if (a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }

    public static void toplamYaz(int a, int b){
        System.out.println(a+b);
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya");
    }

}
