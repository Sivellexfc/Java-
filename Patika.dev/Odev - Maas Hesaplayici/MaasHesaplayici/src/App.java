public class App {

    public static void main(String[] args) throws Exception {

        Employee worker1 = new Employee("musluhan", 8650, 45, 2019);
        worker1.print();

        worker1.setSalary(13000);
        worker1.print();

        worker1.setWorkHours(51);
        worker1.print();

    }
}
