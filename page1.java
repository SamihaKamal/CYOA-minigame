import java.awt.*;
import java.awt.event.*;

public class page1 extends Frame {
    private static TextArea infoArea = new TextArea();


    public page1(){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);

        Monster enemy = new Monster();
        Hero player = new Hero();
        //COMBAT SYSTEM
        infoArea.setText("You've met a monster! Its health is " + enemy.getHealth() + ". What will you" +
                " do?");

        Button Attack1 = new Button("Basic Attack");
        this.add(Attack1);
        Attack1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int attack  = player.basicAttack();
                enemy.decreaseHealth((attack));
                infoArea.setText("Success! The monsters health is now: " + enemy.getHealth());
                if (enemy.getHealth() <= 0){
                    new goodEnding();
                }
                else{
                    new monsterAttack(enemy,player);
                }
                dispose();
            }
        });

        Button Attack2 = new Button("Big attack");
        this.add(Attack2);
        Attack2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int attack  = player.randomAttack();
                enemy.decreaseHealth((attack));

                infoArea.setText("Success! The monsters health is now: " + enemy.getHealth());
                if (enemy.getHealth() <= 0){
                    new goodEnding();
                }
                else {
                    new monsterAttack(enemy,player);
                }
                dispose();
            }
        });

        Button Attack3 = new Button("Super attack");
        this.add(Attack3);
        Attack3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int attack  = player.superAttack();
                enemy.decreaseHealth((attack));
                infoArea.setText("Success! The monsters health is now: " + enemy.getHealth());
                if (enemy.getHealth() <= 0){
                    new goodEnding();
                }
                else {
                    new monsterAttack(enemy,player);
                }
                dispose();
            }
        });




        WindowCloser wc = new WindowCloser();
        this.addWindowListener(wc);

        this.setSize(500,500);// Self explanatory
        this.setLocationRelativeTo(null); // Centers the window on the screen
        this.setVisible(true);// Self explanatory
    }
}
