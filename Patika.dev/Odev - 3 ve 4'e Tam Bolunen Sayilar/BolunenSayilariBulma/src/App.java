import java.util.Scanner;

public class App {

    /*
    
    Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

    Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. 
    
    */

    public static void main(String[] args) throws Exception {

        int sum = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deger giriniz   : ");
        int number = scanner.nextInt();

        scanner.close();
        
        for (int i = 1; i < number; i++) {

            if(i%3 == 0 && i%4 == 0) {
                counter = counter + 1;
                sum = sum + i;
            }
            
        }

        System.out.print(sum/counter);

    }
}
