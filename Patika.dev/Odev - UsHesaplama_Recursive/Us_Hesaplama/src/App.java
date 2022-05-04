import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban degeri giriniz    : ");
        int taban = scanner.nextInt();

        System.out.print("Us degeri giriniz   : ");
        int usDegeri = scanner.nextInt();
        scanner.close();
        
        System.out.print(pow(taban,usDegeri));

    }

    public static double pow(int taban,int us) {

        if(us == 1) {

            return taban;        
        }

        else {

            us -= 1;
            return taban * pow(taban,us);
        }
        
        
    }
}
