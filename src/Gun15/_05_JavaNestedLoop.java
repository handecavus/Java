package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *


        for (int i = 1; i <=5 ; i++) { //1,2,3,4,5

            for (int j = 0; j <i ; j++) { // her bir satırdaki sınır 5
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i >0 ; i--) { //1,2,3,4,5

            for (int j = 0; j < i; j++) { // her bir satırdaki sınır 5
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
