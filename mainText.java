import java.awt.*;
import java.awt.event.*;

// COMBAT
// LOGIN AND SAVE
public class mainText extends Frame{
    private static TextArea infoArea = new TextArea("You are now lost in a random forest with three " +
            "paths ahead of you." + "\n" + "The first path is clean with pavement snaking into the distance." +
            "\n"+ "The second path is a beaten road with brambles everywhere, " +
             "\n" + "whilst the last path is just a normal dirt road. Which do you choose.");

    public mainText(){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);


        Button Option1 = new Button("Take the first path");
        this.add(Option1);
        Button Option2 = new Button("Take the center path");
        this.add(Option2);
        Button Option3 = new Button("Take the furthest path");
        this.add(Option3);

        Option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new page1();
                dispose();
            }
        });

        Option3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new badEnding();
                dispose(); //closes current window
            }
        });

        Option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new page2();
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
