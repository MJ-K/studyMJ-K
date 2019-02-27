package test;
 
/*
 * SimpleTableDemo.java requires no other files.
 */
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class test4 extends JFrame {
    private boolean DEBUG = false;
 
    public test4() {
    	setBounds(10,10,500,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel j = new JPanel(new GridLayout(1,0));
 
        String[] columnNames = {"First Name",
                                "Last Name",
                                "Sport",
                                "# of Years",
                                "Vegetarian"};
 
        Object[][] data = {
      /*  {"Kathy", "Smith",
         "Snowboarding", new Integer(5), new Boolean(false)},
        {"John", "Doe",
         "Rowing", new Integer(3), new Boolean(true)},
        {"Sue", "Black",
         "Knitting", new Integer(2), new Boolean(false)},
        {"Jane", "White",
         "Speed reading", new Integer(20), new Boolean(true)},
        {"Joe", "Brown",
         "Pool", new Integer(10), new Boolean(false)}*/
        };
 
        final JTable table = new JTable(data, columnNames);
        /*table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);*/
 
      /*  if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }*/
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
 
        //Add the scroll pane to this panel.
        j.add(scrollPane);
        add(j);
        setVisible(true);
    }
 
   /* private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }*/
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
  /*  private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        test4 newContentPane = new test4();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }*/
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        /*//creating and showing this application's GUI.
         * 
         * 
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }*/
    	
    	new test4();
    }
}