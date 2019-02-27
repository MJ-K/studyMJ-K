package Client;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame.JDesktopIcon;

import Database.Payer_Verification_Server;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Payer_Verification extends JFrame{
	
	private String input = null;
	private JLabel warn_m;
	private JComboBox<Integer> memberNo;
	
	private JDialog dialog;
	
	private ArrayList<Integer> arr;
	
	private JPanel panel;
	private JPanel label;
	private JPanel controls;
	
	private JPasswordField password;

	
	public Payer_Verification(int cuisineNo, String[] meal_No, String[] mealName, int[] menuCount, String[] menuPrice) {
		
		panel = new JPanel(new BorderLayout(5,5));
		
		label = new JPanel(new GridLayout(0, 1, 2, 2));
		label.add(new JLabel("사원번호",SwingConstants.LEFT));
		label.add(new JLabel("패스워드",SwingConstants.LEFT));
		panel.add(label, BorderLayout.WEST);
		
		arr = new Payer_Verification_Server().GetMemberNo();
		
		///////////////
		
		int i = 0;//arr숫자만큼 돌린다.(index of arr)
		
		memberNo = new JComboBox<Integer>();
		memberNo.setBounds(20, 20, 50, 20);
		
		while(i<arr.size()) {
			memberNo.addItem(arr.get(i));
			i++;
		}
		
		///////////////
	
		controls = new JPanel(new GridLayout(0, 1, 2, 2));
		controls.add(memberNo);
		
		password = new JPasswordField();
		password.setEchoChar('●');
		controls.add(password);
		
		panel.add(controls,BorderLayout.CENTER);
		
		int result = JOptionPane.showConfirmDialog(getContentPane(), panel,"결제자 인증",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
	
		if(result == JOptionPane.CLOSED_OPTION) {
			dispose();
		}
		else if (result == JOptionPane.YES_OPTION) {
			
			String passwd=String.valueOf(password.getPassword());
			boolean check=new Payer_Verification_Server().check_passwd(memberNo.getSelectedItem().toString(), passwd);
			
			System.out.println(check);
			
			if(check) {
				//결제
				SimpleDateFormat sdateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.KOREA);
				Date date= new Date();
				String currenttime = sdateformat.format(date);
				
				SimpleDateFormat ticektformat = new  SimpleDateFormat("yyyyMMddHHmmss");
				String ticket = ticektformat.format(date);
				
				new Payer_Verification_Server().correct_passwd(cuisineNo, meal_No, memberNo.getSelectedItem().toString() ,menuCount , menuPrice, currenttime);
				JOptionPane.showMessageDialog(null,"결제가 완료되었습니다.\n 식권을 출력합니다.","Message",JOptionPane.INFORMATION_MESSAGE);
				
				new Ticket(cuisineNo, mealName ,memberNo.getSelectedItem().toString(), menuCount,menuPrice,ticket);
				
			}else {
				showMessage("Message", "패스워드가 일치하지 않습니다.");
				new Client_Main_Home_Grid();
			}
			
		}else {
				new Settlement_Menu(cuisineNo);
		}
		
	}
	/*public static void main(String[] args) {
		new Payer_Verification(1);
	}*/
	private void showMessage(String title, String message) 
	{
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, title, JOptionPane.ERROR_MESSAGE);
	}
}
