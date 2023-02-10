import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class monsterAttack extends Frame {
    private static TextArea infoArea = new TextArea();

    public monsterAttack(Monster a, Hero b){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);

        int attack = a.basicAttack();
        b.decreaseHealth(attack);

        infoArea.setText("The monster has attacked! Oh no! The player has lost " +
                attack + " health." + "\n" + " There is now " + b.getHealth() + " player health left.");


        Button next = new Button("Continue");
        this.add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b.getHealth() <= 0){
                    new badEnding();
                }
                else {
                    new heroAttack(a,b);
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
