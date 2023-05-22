package Gun13;


public class _05_WhileLoop {
    public static void main(String[] args) {

        // 100e kadar olan sayıların toplamını bulunuz

        // sayı girişi, sayı okuma var mı YOK
        // 1+2+3+4+5+6+7+8+9........+99+100
        // sayac=i

        int i=1;
        int toplam=0;

        while (i<=100)
        {
            toplam=toplam+i;

            i++;
        }
        System.out.println("toplam = " + toplam);

    }
}