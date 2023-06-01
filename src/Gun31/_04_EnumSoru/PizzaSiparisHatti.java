package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            menu();
            secim=scan.nextInt();
            switch (secim){
                case 1: //small ekle
                    Pizza sp=new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2: //medium ekle
                    Pizza mp=new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3: //large ekle
                    Pizza lp=new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4: siparisYazdir(siparisler);
                    break;
            }
            //menu
            //scannerla secimi alalım
            //secilen pizzayı arrayliste ekleyelim
            //eğer 4 ü seçerse arraylisti bir metoda gönder ve orada
            //hangi pizzadan kaç sipariş verdiğini göster
        }while (secim<=4);

    }
    public static void menu(){
        System.out.println("****** Pizza menü *****");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Sipariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seçiminiz:");
    }

    public static void siparisYazdir(ArrayList<Pizza> siparisler){
        int s=0, m=0, l=0;
        int toplamFiyat=0;
        for (Pizza p: siparisler){
            if (p.size==PizzaSize.SMALL){
                s++;
                toplamFiyat += PizzaSize.SMALL.fiyat;
            }
            else
            if (p.size==PizzaSize.MEDIUM){
                m++;
                toplamFiyat += PizzaSize.MEDIUM.fiyat;
            }
            else
            if (p.size==PizzaSize.LARGE){
                l++;
                toplamFiyat += PizzaSize.LARGE.fiyat;
            }
        }
        System.out.println("***** Siparişleriniz *****");
        System.out.println("Small Pizza Count: "+ s);
        System.out.println("Medium Pizza Count: "+ m);
        System.out.println("Large Pizza Count: "+ l);
        System.out.println("toplamFiyat = " + toplamFiyat);
    }

}
