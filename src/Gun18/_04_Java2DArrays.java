package Gun18;

import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[2][3];

        //burası okuma işlemi
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print("Sayı giriniz:");
                tablo[satir][sutun]= oku.nextInt();
            }
        }
        //burası yazma işlemi
        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo[satir][sutun]+"\t");
            }
            System.out.println();
        }
        //en büyük bulma işlemi
        int enBuyuk=tablo[0][0];

        for (int satir = 0; satir < 2; satir++) {
            for (int sutun = 0; sutun < 3; sutun++) {
                if (tablo[satir][sutun]>enBuyuk){
                    enBuyuk=tablo[satir][sutun];
                }
            }
        }

        System.out.println("enBuyuk = " + enBuyuk);

    }
}
