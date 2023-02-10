import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Load extends Frame {
    private static TextArea infoArea = new TextArea();
    private TextField name = new TextField();

    public Load(){
        this.setLayout(new FlowLayout());

        infoArea.setEditable(false);
        this.add(infoArea);



        infoArea.setText("Welcome to my game!");

        Button Login = new Button("Continue Game");
        this.add(Login);
        Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {infoArea.setText(continueData()); }
                catch (IOException o){
                }
                try {
                    Thread.sleep(2000);                 //1000 milliseconds is one second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                new mainText();
                dispose();

            }
        });

        Button Signup = new Button("New Game");
        this.add(Signup);
        Signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoArea.setText("Please enter your name into the text field and then Click submit: ");
            }
        });

        this.add(name);
        name.setSize(500,250);
        Button submit = new Button("Submit");
        this.add(submit);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = name.getText();
                try {storeData(userName);}
                catch (IOException o){
                }//stores data in files
                infoArea.setText("Welcome to the game " + userName);
                try {
                    Thread.sleep(2000);                 //1000 milliseconds is one second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                new mainText();
                dispose();
            }
        });

        WindowCloser wc = new WindowCloser();
        this.addWindowListener(wc);

        this.setSize(500,500);// Self explanatory
        this.setLocationRelativeTo(null); // Centers the window on the screen
        this.setVisible(true);// Self explanatory
    }

    public static void main(String[] args) {
        new Load();
    }

    //Method for file input
//
    public static void storeData(String a) throws IOException
    {
        PrintWriter saving = new PrintWriter(new FileWriter("Data.txt")); //new PrintWriter variable

        saving.println(a); //Write a on file
        saving.close(); //Close file writer
    }

    public static String continueData() throws IOException //file output for continuing game
    {
        BufferedReader retrieving = new BufferedReader(new FileReader("Data.txt")); //retrieves data from text file
        String userName = retrieving.readLine();

        String sentence = "Welcome back " + userName + "! "; //outputs string
        retrieving.close();
        return sentence;
    }
}
