package Gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1

        for (int i = 5; i >0 ; i--) { // 1,2,3,4,5

            for (int j = 0; j <i ; j++) { // her bir satırdaki sınır 5
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
