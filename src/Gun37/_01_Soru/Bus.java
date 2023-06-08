package Gun37._01_Soru;

public class Bus extends Vehicle implements IDeisel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
       return "En fazla 90 km gider";
    }

    @Override
    public String changeDeisel() {
        return "Bir depo ile 1000km gider";
    }


}
