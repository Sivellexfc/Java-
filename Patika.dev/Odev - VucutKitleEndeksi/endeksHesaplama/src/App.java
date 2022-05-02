import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz    : ");
        double weight = scanner.nextDouble();

        System.out.print("Boyunuzu giriniz (cm cinsinden)    : ");
        int height = scanner.nextInt();

        scanner.close();
        
        System.out.printf("Vucut kitle endeksiniz  : %.2f" , endeksHesapla(weight, height));

    }

    public static double endeksHesapla(double weight , int height) {

        return (weight / (double) Math.pow(height, 2)) * 10000;
        
    }
}
