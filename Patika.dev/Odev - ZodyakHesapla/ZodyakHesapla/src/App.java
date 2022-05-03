import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        

        String[] zodiac = {"Maymun","Horoz","Kopek","Domuz","Fare","Okuz","Kaplan","Tavsan","Ejderha","Yilan","At","Koyun"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz  : ");
        int birthYear = scanner.nextInt();

        scanner.close();
        
        System.out.print("Cin zodyagi yiliniz -----> " + zodiac[birthYear%12]);

    }
}
