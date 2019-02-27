package Client;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Database.GetMenu;
import Database.Modify_Menu_Server;

public class Menu_Manager extends JFrame{
	
	private JButton all_select;
	private JButton search;
	private JButton modify;
	private JButton delete;
	private JButton todayMenu;
	private JButton exit;
	
	private JLabel typelabel;
	private JComboBox<String> type;
	private String[] cuisinetype = {"한식","중식","일식","양식"};
	private String[] table_title = {"","mealName", "price","maxCount","todayMeal"};
	
	private JPanel buttonpanel;
	private JPanel tablepanel;

	private JCheckBox checkbox;
	
	private Object[][] data = {};
	private DefaultTableModel model;
	
	private JScrollPane scrollpane;
	private JTable table;
	
	private GridBagConstraints c;
	
	private String[] check_menucount;
	private String[] check_menuName;
	private String[] check_todayMeal;
	private String[] check_menuprice;

	private int cuisineNo = 1;
	
	private int arrsize = 0;
	
	private DefaultTableCellRenderer dt;
	private DefaultTableCellRenderer checkboxrender;
	
	public Menu_Manager(int getcuisinNo) {
		
		if(getcuisinNo != 0 ) {
			cuisineNo = getcuisinNo;
		}
		
		setBounds(50, 50, 615, 538);
		setResizable(false);
		setTitle("메뉴 관리");
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				new Manager();
				dispose();
			}
		});
		
		setLayout(null);
		
		buttonpanel = new JPanel(new GridBagLayout());
		buttonpanel.setBounds(0,0,600,50);
		//buttonpanel.setBackground(Color.BLACK);
		tablepanel = new JPanel(new GridLayout(1, 1));
		tablepanel.setBounds(0,50,600,450);

		c= new GridBagConstraints();
		
		//Object [][] datas = {{false,"홍길동","20","남"},{true,"김말자","18","여"}};
		
		///데이터 받기
		model = new DefaultTableModel(data,table_title){ 
			public boolean isCellEditable(int row, int column)
			{ 
				return column == 0; 
			} 
		}; 
		
		menuData(cuisineNo);
		
		
		setModel_bycuisine();
		
		
		//////버튼과 라벨
		
		
		all_select = new JButton("모두 선택");
		all_select.setFont(buttonFont());
		all_select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0;i<model.getRowCount();i++) {					
					model.setValueAt(true, i, 0);
				}
				all_select.setEnabled(false);
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 0, 5);
		buttonpanel.add(all_select,c);
		
		typelabel = new JLabel("종류:");
		typelabel.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		buttonpanel.add(typelabel,c);
		
		type = new JComboBox<String>(cuisinetype);
		type.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		/*type.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				switch(type.getSelectedItem().toString()) {
				case "한식":
					cuisineNo = 1;
					break;
				case "중식" :
					cuisineNo = 2;
					break;
				case "일식" : 
					cuisineNo = 3;
					break;
				case "양식":
					cuisineNo = 3;
					break;
				}
				menuData(cuisineNo);
				model.setRowCount(0);
				setModel_bycuisine();
				table.repaint();
				//System.out.println("종류 : "+type.getSelectedItem());
				
			}
		});*/
		buttonpanel.add(type,c);
		
		search = new JButton("검색");
		search.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 0;
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(type.getSelectedItem().toString()) {
				case "한식":
					cuisineNo = 1;
					break;
				case "중식" :
					cuisineNo = 2;
					break;
				case "일식" : 
					cuisineNo = 3;
					break;
				case "양식":
					cuisineNo = 3;
					break;
				}
				menuData(cuisineNo);
				model.setRowCount(0);
				setModel_bycuisine();
				table.repaint();
				//System.out.println("종류 : "+type.getSelectedItem());
			}
		});
		buttonpanel.add(search,c);
		
		modify = new JButton("수정");
		modify.setFont(buttonFont());
		modify.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
				if(countTrue() == 0) {
					JOptionPane.showMessageDialog(null, "수정할 메뉴를 선택해주세요.","Message",JOptionPane.ERROR_MESSAGE);
				}else if(countTrue()>1) {
					JOptionPane.showMessageDialog(null, "하나씩 수정 가능합니다.","Message",JOptionPane.ERROR_MESSAGE);
				}else {
					//수정창 뜨기
					int index = findTrue_index();
					dispose();
					new Modify_Menu(cuisineNo, check_menuName[index],check_menuprice[index],check_menucount[index]);
				}
			}
		});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		buttonpanel.add(modify,c);
		
		delete = new JButton("삭제");
		delete.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 0;
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				if(countTrue()==0) {
					showErrorMessage("삭제할 메뉴를 선택해주세요.");
				}else {
					int res= JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?","Message",JOptionPane.YES_NO_OPTION);
					
					if(res == JOptionPane.YES_OPTION) {
						//DB및 TABLE 업뎃  해당 레코드 삭제
						int[] index = findTrue_index(countTrue());
						String[] deleteName= new String[index.length];
						for(int i= 0; i<index.length;i++) {
							deleteName[i]=check_menuName[index[i]];
						}
						new Modify_Menu_Server().delete(deleteName);
						menuData(cuisineNo);
						model.setRowCount(0);
						setModel_bycuisine();
						table.repaint();
					}
				}
				
			}
		});
		buttonpanel.add(delete,c);
		
		todayMenu = new JButton("오늘의메뉴선정");
		todayMenu.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 0;
		todayMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(countTrue()>25) {
					showErrorMessage("25개를 초과할 수 없습니다.");
				}else if(countTrue() <1) {
					showErrorMessage("오늘의 메뉴를 선택해 주세요.");
				}
				else
				{
					//DB및 TABLE 업뎃 TODAYMEAL 0->1
					int[] index = findTrue_index(countTrue());
					String[] mealName = new String[index.length];
					
					for(int i= 0; i<index.length;i++) {
						mealName[i]=check_menuName[index[i]];
						//System.out.println(mealName[i]=check_menuName[index[i]]);
					}
					new Modify_Menu_Server().todaymenu(mealName);
					
					showMessage("변경되었습니다.");
					
					menuData(cuisineNo);
					model.setRowCount(0);
					setModel_bycuisine();
					table.repaint();
				}
				
			}
		});
		buttonpanel.add(todayMenu,c);
		
		exit = new JButton("닫기");
		exit.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 7;
		c.gridy = 0;
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				dispose();
			}
		});
		buttonpanel.add(exit,c);
		
		///////////////테이블 패널
		
		 checkboxrender = new DefaultTableCellRenderer()
		 {
		  public Component getTableCellRendererComponent  // 셀렌더러
		   (JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
		  {
		   JCheckBox box= new JCheckBox();
		   box.setSelected(((Boolean)value).booleanValue());  
		   box.setHorizontalAlignment(JLabel.CENTER);
		   return box;
		  }
		 };
		 
		
		table = new JTable(model);
		//셀 간격 맞춤
		table.getColumnModel().getColumn(0).setPreferredWidth(5); 
		
		dt =  new DefaultTableCellRenderer();
		dt.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i= 1 ;i<table.getColumnCount();i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(dt);
		}
		table.getColumn("").setCellRenderer(checkboxrender);
		checkbox = new JCheckBox();
		checkbox.setHorizontalAlignment(JLabel.CENTER);
		checkbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				all_select.setEnabled(true);
				
				if(countTrue()== model.getRowCount()) {
					all_select.setEnabled(false);
				}
			}
		});
		
		table.getColumn("").setCellEditor(new DefaultCellEditor(checkbox));
		
		scrollpane = new JScrollPane(table);
		//scrollpane.setPreferredSize(new Dimension(width, height));
		//scrollpane.setBounds(0, 0, 600, 550);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		tablepanel.add(scrollpane);
		
		
		add(tablepanel);
		add(buttonpanel);
		setVisible(true);
	}
	
	private void showErrorMessage(String message) {
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, message,"Message",JOptionPane.ERROR_MESSAGE);
	}
	
	private void showMessage(String message) 
	{
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private Font buttonFont() {
		return new Font("돋움", Font.BOLD, 13);
	}
	
	private int countTrue() {
		int counttrue = 0;
		
		for(int i = 0;i<model.getRowCount();i++) {
			if(model.getValueAt(i, 0).toString().equals("true")) {
				counttrue++;
			}
		}
		//System.out.println(counttrue);
		return counttrue;
	}
	
	private int findTrue_index() {
		int i;
		for(i=0;i<model.getRowCount();i++) {
			if(model.getValueAt(i, 0).toString().equals("true")) {
				break;
			}
		}
		//System.out.println(i);
		return i;
	}
	private int[] findTrue_index(int howmany) {
		int[] count = new int[howmany];
		int j =0;
		for(int i=0;i<model.getRowCount();i++) {
			if(model.getValueAt(i, 0).toString().equals("true")) {
				count[j] = i;
				j++;
			}
		}
		//System.out.println(i);
		return count;
	}
	
	
	private void menuData(int cuisineNo) {
		
		int i = 0;
		int j = 0;
	
		ArrayList<String >arr=new ArrayList<String>();
		arr = new GetMenu().GetMenu_arr_formanager(cuisineNo);	
		arrsize = arr.size()/4;
		
		check_menucount = new String[arrsize];
		check_menuName = new String[arrsize];
		check_todayMeal = new String[arrsize];
		check_menuprice = new String[arrsize];
		
		while(i<arr.size()) {
			
			check_menuName[j] = arr.get(i);
			check_menuprice[j] = arr.get(i+1);
			check_menucount[j]= arr.get(i+2);
			if(arr.get(i+3).equals("1")) {
				check_todayMeal[j] = "Y";
			}else {
				check_todayMeal[j] = "N";
			}
			
		
			//System.out.println(check_menuName[j] +""+check_menuprice[j]+""+check_menucount[j]
			//		+""+check_todayMeal[j]);
			
			j++;
			i+=4;
		}
	}
	private void setModel_bycuisine() {
		Object [][] ob = new Object[arrsize][5];
	
		
		for(int i=0;i<arrsize;i++) {
			ob[i][0] = false;
			ob[i][1] = check_menuName[i];
			ob[i][2] = check_menuprice[i];
			ob[i][3] = check_menucount[i];
			ob[i][4] = check_todayMeal[i];
			model.addRow(ob[i]);
		}	
	}
	
	
	public static void main(String[] args) {
		new Menu_Manager(0);
	}
}
