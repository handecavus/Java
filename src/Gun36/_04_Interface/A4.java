package Gun36._04_Interface;

//bir class birden fazla Interface implement edebilir
public class A4 implements IGosterir,IYazdirir{
    //hem karasal hem uydu
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdırdı");
    }
}
