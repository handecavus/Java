package Gun03;

public class _06_Ornek1 {
    public static void main(String[] args) {

        // iki kenarı tanımlı olarak verilen bir
        // dikdörtgenin çevresini ve alanını bulunuz
        // çarpma: * kullanılıyor, x harf olarak kullanılıyor
        // bir kenarı a ise , diğer kenarı b ise cevre=a+a+b+b, alan=a*b

        int kisaKenar=4;
        int uzunKenar=7;

        int cevre= kisaKenar+kisaKenar+uzunKenar+uzunKenar;
        int alan= kisaKenar*uzunKenar;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }
}
