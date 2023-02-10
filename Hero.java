
import java.util.*;


public class Hero extends Person{

    public Hero(){
        super(500);
    }

    public int randomAttack(){
        ArrayList<Integer> attackNumbers = new ArrayList<Integer>();
        Integer[] A = {3,10,50,150,200};
        attackNumbers.addAll(Arrays.asList(A));
        Random random = new Random();
        int index = random.nextInt(attackNumbers.size());

        return attackNumbers.get(index);
    }

    public int superAttack(){
        return 100;
    }

}
