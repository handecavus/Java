package Gun30._01_StaticVariables.Ornek2;

public class Student {
    int id;
    String fullName;

    static int sayac=1; //sen birtanesin
    //static olamdan her zaman o ile başlıyordu
    //static olduğunda artık bir tane olduğundan
    //değerini korudu ve hep 1 tane arttı
    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    } //maindeki ilk 3 satır için gerekli
    //static değişkenden sonra gerek kalmadı

    public Student(String fullName) {
        this.id = sayac++;  //önce var olan değer veriliyor, sonra artırıyor
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
