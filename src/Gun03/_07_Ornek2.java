package Gun03;

public class _07_Ornek2 {
    public static void main(String[] args) {

        // Ornek Soru: yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
        // alan=pi*r*r  cevre=2*pi*r    "pi=3.14"

        double yaricap=4.5;
        double pisayisi=3.14;

        double cevre= 2*pisayisi*yaricap;
        double alan= pisayisi*yaricap*yaricap;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
