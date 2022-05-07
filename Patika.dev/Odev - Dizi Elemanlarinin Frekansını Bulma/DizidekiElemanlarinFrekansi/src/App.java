import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz    : ");
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {

            System.out.print(i+1 + ". Elemani giriniz   : ");
            array[i] = scanner.nextInt();
            
        }

        for (int i = 0; i < number; i++) {            
            if(!arrayList.contains(array[i])) {
                arrayList.add(array[i]);
            }
        }

        for (int items : arrayList) {
            System.out.println(items + " Elemani " + frekans(array, items) + " kere tekrar etti.");
        }
        scanner.close();
               
    }

    public static int frekans(int[] array , int eleman) {

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            
            if(eleman == array[i]) counter++;

        }
        return counter;
        
    }

    
}
