import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Area level (2-10)   : ");
        int areaSize = scanner.nextInt();
        MineSweeper mine = new MineSweeper(areaSize);
        mine.playGame();

    }
}