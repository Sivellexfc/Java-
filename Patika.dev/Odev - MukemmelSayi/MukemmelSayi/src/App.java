import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Sayiyi giriniz  : ");
        int number = scanner.nextInt();

        scanner.close();

        for (int i = 1; i < number; i++) {

            if(number%i == 0) {

                sum = sum + i;

            }
            
        }

        System.out.println((sum == number) ? "Mukemmel sayidir." : "Mukemmel sayi degildir.");

    }
}
