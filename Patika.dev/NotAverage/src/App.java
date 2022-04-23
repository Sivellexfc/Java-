import java.util.Scanner;

public class App {

    public static double average(int[] notlar) {
        
        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {
            toplam += notlar[i];
        }

        return toplam/notlar.length;
    }

    public static void main(String[] args) throws Exception {
        String[] dersler = {"Matematik" , "Fizik" , "Kimya" ,  "Turkce" , "Tarih" , "Muzik"};
        int i = 0;
        int[] notlar = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (String string : dersler) {

            System.out.printf("%s notu  :",string);
            
            notlar[i] = scanner.nextInt();
            i += 1;
        }

        System.out.println(average(notlar));;
        String result = (average(notlar) < 60) ? "Kaldin" : "Gectin";
        System.out.println(result);
    }
}
