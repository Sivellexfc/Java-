import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*
        Character[] arrayChar = {'J','A','V','A'};
        DatabaseManager dbManager = new DatabaseManager("Değişken");
        DatabaseManager dbManagerArray = new DatabaseManager(arrayChar);

        dbManager.add(3);
        dbManager.update('c');
        dbManager.select();
        System.out.println(dbManager.list());

        System.out.println(dbManagerArray.list());
        */

        List<Integer> list = new List<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(1);
        list.remove(3);
        list.remove(5);
        list.remove(0);
        list.toString();
        System.out.println();
        System.out.println(list.getIndex(1));
        System.out.println(list.indexOf(9));
        System.out.println(list.lastIndexOf(1));
        list.clear();
        list.toString();




    }
}