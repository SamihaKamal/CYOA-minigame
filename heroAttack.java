import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class heroAttack extends Frame {
    private static TextArea infoArea = new TextArea();

    public heroAttack(Monster a, Hero b){
        this.setLayout(new FlowLayout());


        infoArea.setEditable(false);
        this.add(infoArea);

        int attack = a.basicAttack();
        b.decreaseHealth(attack);

        infoArea.setText("The monster's current health is " + a.getHealth() + ". What will you do?");

        Button Attack1 = new Button("Basic Attack");
        this.add(Attack1);
        Attack1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int attack  = b.basicAttack();
                a.decreaseHealth((attack));
                infoArea.setText("Success! The monsters health is now: " + a.getHealth());
                if (a.getHealth() <= 0){
                    new goodEnding();
                }
                else{
                    new monsterAttack(a,b);
                }
                dispose();
            }
        });

        Button Attack2 = new Button("Big attack");
        this.add(Attack2);
        Attack2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int attack  = b.randomAttack();
                a.decreaseHealth((attack));

                infoArea.setText("Success! The monsters health is now: " + a.getHealth());
                if (a.getHealth() <= 0){
                    new goodEnding();
                }
                else {
                    new monsterAttack(a,b);
                }
                dispose();
            }
        });

        Button Attack3 = new Button("Super attack");
        this.add(Attack3);
        Attack3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int attack  = b.superAttack();
                a.decreaseHealth((attack));
                infoArea.setText("Success! The monsters health is now: " + a.getHealth());
                if (a.getHealth() <= 0){
                    new goodEnding();
                }
                else {
                    new monsterAttack(a,b);
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