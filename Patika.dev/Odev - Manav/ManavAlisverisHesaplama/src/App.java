import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        double sum = 0;
        String[] urunler = {"Armut","Elma","Domates","Muz","Patlican"};
        double[] fiyatlar = {2.14 , 3.67 , 1.11 , 0.95 ,5};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < fiyatlar.length; i++) {

            System.out.print(urunler[i] + " Kac kilo alacaksin : ");
            double kilo = scanner.nextDouble();
            sum = sum + (kilo * fiyatlar[i]);
            
        }

        scanner.close();

        System.out.println("Toplam fiyat    : " + sum + " TL");

        
    }
}
