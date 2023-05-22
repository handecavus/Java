package Gun16;

import java.util.HashSet;

public class _05_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazdırınız.
        // {"foxtv","kanald"}...

        String[] tvler= {"foxtv","startv","cnn","habertürk","kanald"};

        int rastgele= (int) (Math.random()* tvler.length); //5e kadar 5 dahil değil

        System.out.println("Rastgele seçilen TV: " + tvler[rastgele]);

        HashSet<String> kanallar =new HashSet<>();
        for (int i = 0; i <= 5; i++) {
            int random= (int) (Math.random()* tvler.length);
            System.out.println(tvler[random]);
        }

    }
}
