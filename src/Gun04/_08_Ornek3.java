package Gun04;

public class _08_Ornek3 {
    public static void main(String[] args) {

        // String olarak verilen 2 adet bağış parasının toplamını yazdırınız.

        String bagis1= "50000";
        String bagis2= "75000";
        System.out.println(bagis1+bagis2); // 5000075000 yazar

        int sayiBagis1= Integer.parseInt(bagis1);
        int sayiBagis2= Integer.parseInt(bagis2);

        int toplamBagis= sayiBagis1+sayiBagis2;
        System.out.println("toplamBagis = " + toplamBagis);


    }
}
