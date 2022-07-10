import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

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


        FileOutputStream fOut = new FileOutputStream("src/file_1.txt",true);

        String newStr = "\nI have been free since the beginning and forever shall be so.\n" +
                        "What madman shall put me in chains! I defy the very idea!\n" +
                        "I'm like the roaring flood; trampling my banks and overcoming my body,\n" +
                        "I'll tear apart mountains, exceed the Expanses and still gush out!";

        byte[] byteStr = newStr.getBytes(StandardCharsets.UTF_8);
        fOut.write(byteStr);
        fOut.close();

        FileInputStream fInput = new FileInputStream("src/file_1.txt");
        System.out.println("Dosyadaki yeni veriler   : ");
        System.out.println();

        int i = fInput.read();

        while(i != -1){
            System.out.print((char)i);
            i = fInput.read();
        }
        fInput.close();


    }
}