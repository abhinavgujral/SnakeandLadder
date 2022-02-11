import java.util.Random;

public class Dice {
    private int max_value=6;
Dice(){

}    Dice(int max_value){
        this.max_value=max_value;

    }
    public int rollDice(){
        Random random= new Random();
        return 1+random.nextInt(this.max_value);
    }
}
