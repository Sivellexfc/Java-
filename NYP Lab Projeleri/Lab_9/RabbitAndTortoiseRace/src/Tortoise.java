public class Tortoise {

    public int position = 0;
    public String name;
    public boolean isWon = false;

    public Tortoise(int i){
        this.name = "T" + i;
    }

    public void move(){
        
        int dice  = (int)(Math.random()*100) + 1;

        if(dice <=20) { //%20
            updatePosition(-6);
        } 
        else if(dice <= 50){
            updatePosition(1);
        }
        else if(dice <= 100){
            updatePosition(3);
        }

    }

    public void updatePosition(int step){

        if(this.position + step < 1){
            this.position = 0;
        }
        else if(this.position + step > 69){
            isWon = true;
            this.position = 69;
        }
        else{
            this.position = this.position + step;
        }

    }
}
