package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {

        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz... ve kilonuz... şeklinde yazınız.
        // vücut kitle indeksini de bularak yazdırınız kg/(boy*boy)

        double kgH= 48.0;
        int boyH= 166;
        double kitleIndex= kgH / (boyH*boyH);
        System.out.println("kitleIndex = " + kitleIndex);
        System.out.println("boyunuz="+boyH+", kilonuz="+kgH);

        /********************************/
        double boyH2= 1.66;
        double kitleIndex2= kgH / (boyH2*boyH2);
        System.out.println("kitleIndex2 = " + kitleIndex2);

    }
}
