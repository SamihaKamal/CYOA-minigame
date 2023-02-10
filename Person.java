public abstract class Person {
    private int health;

    public Person(int a){
        this.health = a;
    }

    public int basicAttack(){
        return 20;
    }

    public void decreaseHealth(int a){
        this.health = this.health - a;
    }

    public int getHealth(){
        return health;
    }

}
