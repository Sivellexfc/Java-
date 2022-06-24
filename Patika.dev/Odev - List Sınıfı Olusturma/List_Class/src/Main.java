public class Main {
    public static void main(String[] args) {

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

        System.out.println(list.toString());
        System.out.println(list.sublist(2,5).toString());

        list.remove(1);
        System.out.println(list.toString());

        System.out.println(list.contains(5));
        list.add(55);
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.toString());
        list.add(41);
        list.add(78);
        System.out.println(list.toString());
    }
}