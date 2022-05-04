import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayisi griniz    :");
        int number = scanner.nextInt();

        fibonacci(number);

        scanner.close();

    }

    public static void fibonacci(int number) {
        
        long first = 0;
        long second = 1;
        long temp;

        int counter = 0;

        while(counter < number) {

            System.out.print(first + " ");
            counter += 1;

            temp = first + second;
            first = second;
            second = temp;

        }       

    }
}
