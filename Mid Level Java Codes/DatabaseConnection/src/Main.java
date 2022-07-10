import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        final String DB_URL = "jdbc:mysql://localhost:3306/users";
        final String DB_USER = "admin";
        final String DB_PASSWORD = "pass";

        Connection connect = null;
        Statement statement = null;
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        String userName;
        String surname;
        int age;
        String date;

        String pSQL = "INSERT INTO userıd VALUES (?,?,?,?)";

            try {

                connect = DriverManager.getConnection(DB_URL,"root","Mhc572572*");
                System.out.println("Connected to database succesfully");
                statement = connect.createStatement();

                System.out.print("Born Date    : ");
                date = scanner.nextLine();

                System.out.print("Username    : ");
                userName = scanner.nextLine();

                System.out.print("Surname    : ");
                surname = scanner.nextLine();

                System.out.print("Age    : ");
                age = scanner.nextInt();

                ResultSet data = statement.executeQuery("SELECT * FROM USERS ORDER BY NAME ASC");

                ResultSet userData = statement.executeQuery(pSQL);
                PreparedStatement pSt = connect.prepareStatement(pSQL);

                pSt.setString(1,userName);
                pSt.setString(2,surname);
                pSt.setInt(3,age);
                pSt.setString(4,date);
                pSt.executeUpdate();

                while(data.next()){
                    System.out.println("Name " + count +" : "+ data.getString("Name"));
                    count++;
                }

            } catch (SQLException e) {
                System.out.println("error");
                System.out.println(e.getMessage());
            }




    }
}