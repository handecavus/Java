package Gun32._03_Encapsulation;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;
    private int ID;
    static int IDSayac=1;

    public Ogrenci(String ad, String soyad, int yas) {
        setID(IDSayac++);
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getIDSayac() {
        return IDSayac;
    }

    public static void setIDSayac(int IDSayac) {
        Ogrenci.IDSayac = IDSayac;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", ID=" + ID +
                '}';
    }
}

