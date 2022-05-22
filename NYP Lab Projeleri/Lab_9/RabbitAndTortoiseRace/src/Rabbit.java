
public class Rabbit extends Tortoise {

    public boolean isWon = false;

    public Rabbit(int i) {
        super(i);
        this.name = "R" + i;
    }

    public void move(){

        int dice = (int)(Math.random()*100) + 1;

        if(dice <= 10){
            updatePosition(-12);
        }
        else if(dice <= 30){
            //sleep
        }
        else if(dice <= 50){
            updatePosition(9);
        }
        else if(dice <= 70){
            updatePosition(-2);
        }
        else if(dice <= 100){
            updatePosition(1);
        }

    }

    public void updatePosition(int step){
        if(this.position + step < 1){
            this.position = 0;
        }
        else if(this.position + step > 69){
            this.isWon = true;
            this.position = 69;
        }
        else{
            this.position = this.position + step;
        }
    }
    
}
