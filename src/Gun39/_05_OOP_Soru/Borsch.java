package Gun39._05_OOP_Soru;

public class Borsch implements IFood{
    void boil(){
        System.out.println("Kısık ateşte kaynatılıyor");
    }
    void eatTomorrow(){
        System.out.println("Bir gün sonra servis edilir");
    }


    @Override
    public void taste() {
        System.out.println("Sıcak sebze çorbası");
    }

    @Override
    public double ucret() {
        return 40;
    }
}
