package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {

        // JavaNestedLoop

        // 2 lerin çarpım tablosunu sormuştuk.
        // 2 x 1 =2
        // 2 x 2 =4
        // ...
        // 5(dahil) lere kadar yapınız.

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println( i + "x" + j + "=" + (i * j) );
            }
            System.out.println();
        }

    }
}
