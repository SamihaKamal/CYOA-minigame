import java.awt.*;
import java.awt.event.*;


public class page2 extends Frame{
    private static TextArea infoArea = new TextArea();

    public page2(){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);

        infoArea.setText("You have taken the second path and have now come across a puzzle." +
                "\n" + "A riddle is written:  I possess a halo of water, walls of stone, and" +
                "\n" + "a tongue of wood. Long I have stood; what am I?");

        Button Option1 = new Button("Castle");
        this.add(Option1);

        Option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new goodEnding();
                dispose();
            }
        });

        Button Option2 = new Button("Well");
        this.add(Option2);
        Option2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new badEnding();
                dispose();
            }
        });

        Button Option3 = new Button("Ship");
        this.add(Option3);
        Option3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new badEnding();
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
