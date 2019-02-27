package test;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.print.PrinterException;
   
   public class mine extends JTable {
   
         public mine() {
           super(data, columnNames);
           setUpJFrame();
           try {
			print();
		} catch (PrinterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         }
   
         public static void main(String[] args) {
           SwingUtilities.invokeLater(new Runnable() {
             public void run() {
               new mine();
             }
           });
         }
   
         // Table Frame common to all examples in this tip
   
          private void setUpJFrame() {
          JFrame frame = new JFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add( getTablePanel());
           frame.pack();
           frame.setVisible(true);
         }
   
        private JPanel getTablePanel(){
           JPanel jPanel = new JPanel(new GridLayout(1,0));
           jPanel.setOpaque(true);
          setPreferredScrollableViewportSize(
                                 new Dimension(500, 70));
           jPanel.add(new JScrollPane(this));
           return jPanel;
         }
   
         // Table Data common to all examples in this tip
   
         private static final String[] columnNames =
           {"First Name", "Last Name", "Sport",
            "# of Years", "Vegetarian"};
   
         private static final Object[][] data = {
           {"Mary", "Campione", "Snowboarding",
            new Integer(5), new Boolean(false)},
           {"Alison", "Huml", "Rowing",
            new Integer(3), new Boolean(true)},
           {"Kathy", "Walrath", "Knitting",
            new Integer(2), new Boolean(false)},
           {"Sharon", "Zakhour", "Speed reading",
            new Integer(20), new Boolean(true)},
           {"Philip", "Milne", "Pool",
            new Integer(10), new Boolean(false)}
         };
       
   
   }
