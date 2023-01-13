
import java.util.Scanner;


public class main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, column;
        System.out.println("Mayin Tarlası Oyununa Hoşgeldiniz");
        System.out.print("Satır Sayısını Giriniz :");
        row = scan.nextInt();
        System.out.print("Sütun Sayısını Giriniz :");
        column = scan.nextInt();
    
        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();
    }
    
}
