package Client_not_use;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.print.PrinterException;



public class Show_Menu_Orderlist_1 extends JFrame {
	RowSorter<TableModel> sorter;
	public Show_Menu_Orderlist_1() {

		setBounds(100,100,300,200);
		

		String[] tabletitle = {"종류","갯수"};
		
		Object[][] data = {{"한식",25},{"중식",9},{"일식",9},{"양식",8}};
		


		
		
		  TableModel model = new DefaultTableModel(data, tabletitle) {
		      public Class getColumnClass(int column) {
		        if (column >= 0 && column <= getColumnCount())
		          return getValueAt(0, column).getClass();
		        else
		          return Object.class;
		      }
		    };

		JTable table = new JTable(model) {
			  public Component prepareRenderer(
                      TableCellRenderer renderer,
                      int row, int col) {
				  Component c = super.prepareRenderer(renderer,
                            row, col);
				  if (row % 2 == 0 && !isCellSelected(row,col)) {
					  c.setBackground(Color.LIGHT_GRAY);
				  } else {
					  c.setBackground(getBackground());
				  }
				  return c;
			  }
		};	
		
		
		sorter = new TableRowSorter<TableModel>(model);	
		table.setRowSorter(sorter); 
	
		JScrollPane jsp = new JScrollPane(table);
		//jsp.print();
		
		 getContentPane().add(new JScrollPane(table));
		
		//getContentPane().print();
		setVisible(true);
		
		try {
			
			table.print();
		} catch (PrinterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		new Show_Menu_Orderlist_1();
	}
}
