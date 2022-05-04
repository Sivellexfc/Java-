import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz    : ");
        int basamak = scanner.nextInt();

        scanner.close();
        
        tersUcgenCiz(basamak);

    }

    public static void tersUcgenCiz(int basamak) {

        for (int i = basamak; i > 0; i--) {

            for (int j = basamak ; j > i; j--) {

                System.out.print(" ");
            }

            if(i == 1) { System.out.println("O"); }
            else {

                for (int j = 0; j < (i*2)-1 ; j++) {

                    System.out.print("O");
                    
                }

            }
            System.out.println();
            
        }
        
    }
}
