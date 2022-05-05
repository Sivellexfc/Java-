import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz   : ");
        int boyut = scanner.nextInt();

        int[] array = new int[boyut];
        
        for (int i = 0; i < boyut; i++) {

            System.out.print(i+1 + ". Eleman  : ");
            array[i] = scanner.nextInt();

        }
        scanner.close();

        System.out.println(Arrays.toString(siraliArray(array)));

    }

    public static int[] siraliArray(int[] array) {

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {

                if(array[i] > array[j]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        return array;
        
    }
}
