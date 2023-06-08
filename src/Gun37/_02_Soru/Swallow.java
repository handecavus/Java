package Gun37._02_Soru;

public class Swallow extends Animal implements IFlying{
    @Override
    public String food() {
        return "Küçük ve uçan böceklerden beslenir";
    }

    @Override
    public String flying() {
        return "Hiç durmadan uçar";
    }
}
