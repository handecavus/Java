package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {

        // Bir kartvizit uygulamasını iki kişi için yapınız

        HashMap<String,String> hKartvizit=new HashMap<>();
        hKartvizit.put("isim","Hande Çavuş");
        hKartvizit.put("email","handeecavus@gmail.com");
        hKartvizit.put("adres","Nilüfer/Bursa");
        hKartvizit.put("telefon","05350000000");

        System.out.println("hkartvizit.get(isim) = " + hKartvizit.get("isim"));
        System.out.println("hkartvizit.get(tel) = " + hKartvizit.get("telefon"));

        HashMap<String,String> cKartvizit=new HashMap<>();
        cKartvizit.put("isim","Çağla Çavuş");
        cKartvizit.put("email","caglaacavus@gmail.com");
        cKartvizit.put("adres","Nilüfer/Bursa");
        cKartvizit.put("telefon","05350000000");

        HashMap<String, HashMap<String,String> > kartvizitler=new HashMap<>();
        kartvizitler.put("hande",hKartvizit);
        kartvizitler.put("çağla",cKartvizit);

        System.out.println("kartvizitler.get(hande) = " + kartvizitler.get("hande"));
        System.out.println("kartvizitler.get(çağla) = " + kartvizitler.get("çağla"));

        // Hande'nin adresi
        System.out.println("Hande'nin adresi = " + kartvizitler.get("hande").get("adres"));

        // sadece emailler
        for (Map.Entry<String, HashMap<String,String> > kv: kartvizitler.entrySet()){
            System.out.println("emailler = " + kv.getValue().get("email"));
        }






    }
}
