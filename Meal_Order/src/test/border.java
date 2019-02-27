package test;
import java.awt.BorderLayout;
/*from   w w w .j  a  va 2 s.  com*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class border  extends JPanel {

  public border() {

    JButton btn1 = new JButton("Button1");
    JButton btn2 = new JButton("Button2");
    JButton btn3 = new JButton("Button3");
    JButton btn4 = new JButton("Button4");
    JButton btn5 = new JButton("Button5");
    JButton btn6 = new JButton("Button6");

    BorderLayout borderLayout = new BorderLayout(20,30);
    
    setLayout(borderLayout);

    add("North", btn1);
    add("West", btn2);
    add("Center", btn3);
    add("Center", btn4);
    add("South", btn5);
    add("East", btn6);

    borderLayout.setHgap(30);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new border());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }
}