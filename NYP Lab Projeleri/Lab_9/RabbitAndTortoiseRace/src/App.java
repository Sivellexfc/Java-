import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        Rabbit[] rabbits;
        Tortoise[] tortoises;
        boolean state = true;
        String winnerName = "";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert rabbit count: ");
        int rabbitCount = scanner.nextInt();
        System.out.print("Insert tortoise count: ");
        int tortoiseCount = scanner.nextInt();

        scanner.close();

        rabbits = rabbitGenerator(rabbitCount);
        tortoises = tortoiseGenerator(tortoiseCount);
        int lap = 0;
        statementArray(tortoises, rabbits, lap);
        
        while(state){

            for (int i = 0; i < tortoises.length; i++) {
                tortoises[i].move();
                if(tortoises[i].isWon){
                    winnerName = tortoises[i].name;
                    //System.out.println(winnerName);
                    state = false;
                }
            }
            for (int i = 0; i < rabbits.length; i++) {
                rabbits[i].move();
                if(rabbits[i].isWon){
                    winnerName = rabbits[i].name;
                    //System.out.println(winnerName);
                    state = false;
                }
            }           
            
            statementArray(tortoises, rabbits, lap);
            
            lap = lap + 1;
        }
        System.out.println("The winner is " + winnerName);

    }

    public static void toString(String[] tortoises,String[] rabbits, int lap) {

        System.out.print("\033[H\033[2J");  
        System.out.flush();
        //System.out.println("**************************************************************************************************************************");
        System.out.println("Level of Race :"+lap);
        
        for (String rabbit : rabbits) {
            System.out.print(rabbit);
        }
        System.out.println();
        for (String tortoise : tortoises) {
            System.out.print(tortoise);
        }
        System.out.println();
        System.out.println();
        try
        {
            Thread.sleep(300);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        
    }
    
    public static void statementArray(Tortoise[] tortoises , Rabbit[] rabbits, int lap) {

        String[] arrayTortoises = new String[70];
        String[] arrayRabbits = new String[70];
        Arrays.fill(arrayTortoises, "_");
        Arrays.fill(arrayRabbits, "_");

        for (int i = 0; i < tortoises.length; i++) {
            if(arrayTortoises[tortoises[i].position] == "_"){
                arrayTortoises[tortoises[i].position] = tortoises[i].name;
            }
            else{
                arrayTortoises[tortoises[i].position] = arrayTortoises[tortoises[i].position] + tortoises[i].name.charAt(1);
            }
            
        }
        for (int i = 0; i < rabbits.length; i++) {
            if(arrayRabbits[rabbits[i].position] == "_"){
                arrayRabbits[rabbits[i].position] = rabbits[i].name;
            }
            else{
                arrayRabbits[rabbits[i].position] = arrayRabbits[rabbits[i].position] + rabbits[i].name.charAt(1);
            }

        }
        toString(arrayTortoises,arrayRabbits,lap);
        return;
    }

    public static Rabbit[] rabbitGenerator(int rabbitCount) {
        Rabbit[] rabbits = new Rabbit[rabbitCount];
        for (int i = 0; i < rabbitCount; i++) {
            rabbits[i] = new Rabbit(i+1);           
        } 
        return rabbits;
    }

    public static Tortoise[] tortoiseGenerator(int tortoiseCount) {
        Tortoise[] tortoises = new Tortoise[tortoiseCount];
        for (int i = 0; i < tortoiseCount; i++) {
            tortoises[i] = new Tortoise(i+1);
             
        } 
        return tortoises;
    }
}
