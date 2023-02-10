import java.awt.*;
import java.awt.event.*;


public class goodEnding extends Frame{

    private static TextArea infoArea = new TextArea();

    public goodEnding(){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);

        Ending good = new Ending(true);
        infoArea.setText(good.getEnd());

        Button restart = new Button("Restart?");
        this.add(restart);
        restart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new mainText();
                dispose(); //closes current window
            }
        });

        WindowCloser wc = new WindowCloser();
        this.addWindowListener(wc);

        this.setSize(500,500);// Self explanatory
        this.setLocationRelativeTo(null); // Centers the window on the screen
        this.setVisible(true);// Self explanatory
    }
}
