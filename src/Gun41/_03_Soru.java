package Gun41;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_Soru {
    public static void main(String[] args) {

        //Alınan saati geriye doğru saniye saniye saydırınız.

        LocalTime geri = LocalTime.now();
        DateTimeFormatter of1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        while(true) {
            geri=geri.minusSeconds(1);
            MyFunc.Bekle(1);
            System.out.print("\r"+geri.format(of1));
        }
    }
}
