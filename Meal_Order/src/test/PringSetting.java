package test;
 
import javax.swing.JTextPane;
import java.awt.print.PrinterException;

public class PringSetting {


    public static void main(String[] args) throws PrinterException {

        JTextPane textPane = new JTextPane();

       // textPane.setText("test text string - Hello World! Are you there?");

        textPane.print();

    }
}