package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava b=new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();

        System.out.println();

        CheeseCake c=new CheeseCake();
        c.setName("Cheesecake");
        c.madeIn();
        c.taste();

        System.out.println();

        GreekSalad gs=new GreekSalad();
        gs.setName("Greek Salad");
        gs.madeIn();
        gs.taste();

        System.out.println();

        SezarSalad ss=new SezarSalad();
        ss.setName("Sezar Salad");
        ss.madeIn();
        ss.taste();

    }
}
