import java.awt.*;
import java.awt.event.*;


public class badEnding extends Frame{

    private static TextArea infoArea = new TextArea();

    public badEnding(){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);

        Ending bad = new Ending(false);
        infoArea.setText(bad.getEnd());

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
