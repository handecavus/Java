package Gun28._02_Constructor;

public class Kitapci {
    // Book class yazınız.fields: name,publishYear(yayın yılı),author(yazar).
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {

        Book kit1=new Book();
        kit1.name="Harry Potter";
        kit1.author="JK Rowling";
        kit1.publishYear=1997;

        Book kit2=new Book("Yüzükler",1954,"JRR Tolkien");

        Book kit3=new Book("Üzüm ve Çay");

        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);



    }
}
