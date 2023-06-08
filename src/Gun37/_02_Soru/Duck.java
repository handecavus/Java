package Gun37._02_Soru;

public class Duck extends Animal implements ISailing,IFlying{
    @Override
    public String food() {
        return "Yılda 50-60 kg yem tüketir";
    }

    @Override
    public String flying() {
        return "2 aydan sonra uçabilir";
    }

    @Override
    public String sailing() {
        return "Çok iyi yüzer";
    }
}
