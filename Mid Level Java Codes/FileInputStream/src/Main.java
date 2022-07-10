import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            FileInputStream fInput = new FileInputStream("src/file_1.txt");
            
            System.out.println("Dosyadaki veriler   : ");

            int i = fInput.read();

            while(i != -1){
                System.out.print((char)i);
                i = fInput.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}