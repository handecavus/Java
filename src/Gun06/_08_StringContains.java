package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {

        // contains: bir stringin içerisinde karakter(lerin) var olup
        // olmadığını boolen cinsinden söyler true veya false

        String cumle="Merhaba Dünya";

        boolean varMi= cumle.contains("a");
        System.out.println("varMi = " + varMi);

        // direkt de yapabilirsiniz
        System.out.println("varMi= " + cumle.contains("a"));

        System.out.println("ya varMi= " + cumle.contains("ya"));
        System.out.println("k varMi = " + cumle.contains("k"));
    }
}
