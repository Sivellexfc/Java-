import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz  : ");
        int num = scanner.nextInt();
        
        int[] list = new int[num];

        for (int i = 0; i < num; i++) {
            
            System.out.print(i+1 + ". sayiyi giriniz    : ");
            list[i] = scanner.nextInt();

        }

        scanner.close();       
        Arrays.sort(list);

        System.out.println("En kucuk eleman : " + list[0]);
        System.out.println("En buyuk eleman : " + list[list.length-1]);
        

    }
}
