package Gun37._02_Soru;

public class Shark extends Animal implements ISailing{
    @Override
    public String food() {
        return "Diğer deniz canlılarından beslenir";
    }

    @Override
    public String sailing() {
        return "Sürekli yüzer";
    }
}
