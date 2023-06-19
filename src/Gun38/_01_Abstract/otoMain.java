package Gun38._01_Abstract;

public class otoMain {
    public static void main(String[] args) {
        //Referans  //nesne tipi
        Ford fr=new Ford("mustang",1995,4); //ford normal class ve nesne oluşturulabilir, yani new yapılabilir

        //IBinekOto ib=new IBinekOto(); //Interfacelerden NESNE oluşturulamaz sadece REFERANS tip olabilir

        //BinekOto bo=new BinekOto("mustang",1995,4); //abstract classlardan NESNE oluşturulamaz, sadece REFERANS

//        Somut Class        Soyut(abstract) Class      Interface
//        tamamı dolu        kısmi dolu                metodlar bos
//        def const var      const olabilir            const olamaz
//        new yapılabilir    new olamaz                new olamaz
//        access modify var  access modify var         public-def
//        tamamen somut      kısmi somut               tamamen soyut


    }
}
