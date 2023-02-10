import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Monster extends Person{

    public Monster(){
        super(500);
    }

    public int basicAttack(){
        int attack = 0;
        Random random = new Random();
        int index = random.nextInt(3);
        switch (index){
            case 0:
                attack = super.basicAttack();
                break;
            case 1:
                attack = clawAttack();
                break;
            case 2:
                attack = swipe();
                break;
        }
        return attack;
    }

    private int swipe(){
        return 75;
    }

    private int clawAttack(){
        return 100;
    }
}
