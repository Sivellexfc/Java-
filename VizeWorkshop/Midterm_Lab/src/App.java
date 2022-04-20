import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter word  : ");       
        String decrypted = scanner.nextLine();
        System.out.print("Enter key   : ");
        int key = scanner.nextInt();

        scanner.close();
        System.out.println(Sezar.Encrypted(decrypted,key));


    }
}
