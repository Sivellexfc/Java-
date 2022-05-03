import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int year;

        while(true) {

            System.out.print("Yil giriniz :");
            year = scanner.nextInt();

            if(year > 0){
                break;
            }
        }

        scanner.close();
        System.out.println(year + " " + artikYilHesapla(year));

    }

    public static String artikYilHesapla(int year) {

        if(year%100 == 0) {

            if(year%400 == 0){
                return "Artik yildir";
            }
            
        }
        if (year%4 == 0){

            return "Artik Yildir";
        }

        else return "Artik Yil Degildir";
        
    }
}
