import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public int areaSize;
    public int deneme = 10;
    public char area[][];
    public char areaBackup[][];
    public int mineCount;
    public int foundMine = 0;
    // 0 oyun devam ediyor // 1 oyun kazanıldı // 2 oyun kaybedildi
    private int gameStatus = 0;

    public MineSweeper(int areaSize) {
        this.area = new char[areaSize][areaSize];
        this.areaSize = areaSize;
        this.mineCount = (areaSize * areaSize) / 4;

    }

    public void filledArea() {
        for (int i = 0; i < this.areaSize; i++) {
            for (int j = 0; j < this.areaSize; j++) {
                if (this.area[i][j] != '*') {
                    this.area[i][j] = '0';
                }
            }
        }

        for (int i = 0; i < this.areaSize; i++) {
            for (int j = 0; j < this.areaSize; j++) {
                if (this.area[i][j] != '*') {
                    char temp = (char) mineCounter(i,j);
                    this.area[i][j] = temp;
                }
            }
        }
    }

    public void randomizer() {
        Random randLocation = new Random();

        for (int i = 0; i < (areaSize * areaSize) / 4; i++) {
            int randomLocationX = randLocation.nextInt(areaSize);
            int randomLocationY = randLocation.nextInt(areaSize);
            if (this.area[randomLocationX][randomLocationY] != '*') {
                this.area[randomLocationX][randomLocationY] = '*';
            }
        }
    }

    public void printArea(){
        for (int i = 0; i < this.areaSize; i++) {
            for (int j = 0; j < this.areaSize; j++) {
                System.out.print(this.area[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int mineCounter(int positionX,int positionY){
        int counter = 0;

        try {
            if(this.area[positionX-1][positionY-1] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX-1][positionY] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX-1][positionY+1] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX][positionY-1] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX][positionY+1] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX+1][positionY-1] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX+1][positionY] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}
        try {
            if(this.area[positionX+1][positionY+1] == '*'){ counter += 1;} }
        catch (ArrayIndexOutOfBoundsException e){}

        return Character.forDigit(counter,16);
    }

    public void makeBackupArea(){
        for (int i = 0; i < areaSize; i++) {
            for (int j = 0; j < areaSize; j++) {
                this.areaBackup[i][j] = '_';
            }
        }
    }

    public void playGame(){
        int satir;
        int sutun;
        int statement;

        this.areaBackup = new char[areaSize][areaSize];
        makeBackupArea();
        randomizer();
        filledArea();

        while(gameStatus == 0){
            System.out.printf("\n_________________M I N E S W E E P E R_________________ \n\n");
            Scanner scanner = new Scanner(System.in);
            printGameArea();
            if(gameStatus == 0){
                System.out.printf("\n1) Mayın işaretleme \n2) Kutu açma   \n\nSeçiminiz   : ");
                statement = scanner.nextInt();
                if(statement == 1){
                    System.out.print("Satır numarası  : ");
                    satir = scanner.nextInt();
                    System.out.print("Sutun numarası  : ");
                    sutun = scanner.nextInt();
                    isThereMine(satir,sutun);

                }
                if(statement == 2){
                    System.out.print("Satır numarası  : ");
                    satir = scanner.nextInt();
                    System.out.print("Sutun numarası  : ");
                    sutun = scanner.nextInt();
                    refreshArea(satir,sutun);
                }
                checker();
                System.out.printf("\nOyun devam ediyor\n");
            }
            if(gameStatus == 1){
                System.out.printf("\n\ncongratulations you won !!!!!!!!!!!!!!!!!!");
            }
            if(gameStatus == 2){
                System.out.println("Kaybettiniz..............");
                printArea();
            }
        }
    }

    public void printGameArea(){
        System.out.print("  ");
        for (int j = 0; j < areaSize; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        //System.out.println("_____");
        for (int i = 0; i < areaSize; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < areaSize; j++) {
                System.out.print(this.areaBackup[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean checker(){
        if(this.foundMine >= this.mineCount){
            gameStatus = 1;
        }
        return false;
    }

    public void refreshArea(int x,int y){
        if(this.area[x][y] != '*'){
            char tempChar;
            tempChar = this.area[x][y];
            this.areaBackup[x][y] = tempChar;
        }
        else this.gameStatus = 2;
    }

    public void isThereMine(int x , int y){

        if(this.area[x][y] == '*'){
            this.foundMine = this.foundMine + 1;
        }
        this.areaBackup[x][y] = '*';
    }





















}