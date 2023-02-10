public class Ending {
    public String End ;

    public Ending(Boolean a){
        if (a==true){
            this.End = goodEnd();
        }
        else
        {
            this.End = badEnd();
        }

    }

    public String getEnd(){
        return this.End;
    }
    private String goodEnd(){
        End = "WellDone! You have successfully escaped the forest and earned " +
                "\n" + "many treasures! ";
        return End;
    }

    private String badEnd(){
        End = "How unfortunate! You got lost in the forest and may very well die soon! " +
                "\n" + "Oh well!!";
        return End;
    }
}
