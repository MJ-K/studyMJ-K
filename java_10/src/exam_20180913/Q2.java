package exam_20180913;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ID, PASSWORD(LABEL+TEXT) LOGIN , EXIT(SYSTEM.EXIT)
//LOGIN 하면 (LOGIN)~~~님 로그인하셨습니다. (PASSWORD)~~~입력했습니다.(콘솔에)
//JAVA, 1234하면 위처럼뜨고 아니면
//회원가입하세요 라고 뜬다.(플러스알파+)

public class Q2 extends Frame implements ActionListener{
	
	private Button login_Btn;
	private Button exit_Btn;
	private Label id_L;
	private Label pw_L;
	private TextField id_T;
	private TextField pw_T;
	private String id;
	private String pw;
	
	
	Q2() {
		setBounds(600, 300, 400, 300);
		setLayout(null);
		setVisible(true);
		
		login_Btn = new Button("LOGIN");
		exit_Btn = new Button("EXIT");
		
		id_L = new Label("ID");
		pw_L = new Label("PW");
		
		id_T = new TextField();
		pw_T = new TextField();
		
		id = new String();
		pw = new String();
		
		//id,pw 라벨 위치+ 사이즈 
		id_L.setBounds(100,80,20,20);
		pw_L.setBounds(100,140,20,20);
		//id, pw text 위치 + 사이즈
		id_T.setBounds(150,80,150,30);
		pw_T.setBounds(150,140,150,30);
		//버튼 사이즈+위치
		login_Btn.setBounds(100,200,50,50);
		exit_Btn.setBounds(250,200,50,50);
		
		//텍스트 받아오기
		
		//pw 비밀번호
		pw_T.setEchoChar('*');
		
		//버튼 action
		Handler_exit hd_ex = new Handler_exit();
		exit_Btn.addActionListener(hd_ex);
		
		login_Btn.addActionListener(this);
		
		//add
		add(exit_Btn);
		add(login_Btn);
		add(id_L);
		add(id_T);
		add(pw_L);
		add(pw_T);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//LOGIN 하면 (LOGIN)~~~님 로그인하셨습니다. (PASSWORD)~~~입력했습니다.(콘솔에)
		//JAVA, 1234하면 위처럼뜨고 아니면
		//회원가입하세요 라고 뜬다.(플러스알파+)
		
		id = id_T.getText();
		pw = pw_T.getText();
		
		//System.out.println("id : "+id+"pw : "+pw);
		
		if(id.equals("JAVA")&& pw.equals("1234")) {			
			System.out.println(id+" 님 로그인 하셨습니다."+pw+" 라고 입력했습니다.");
		}else {
			System.out.println("회원가입하세요.");
		}
		
		
	}
	public static void main(String[] args) {
		new Q2();
	}
}

class Handler_exit implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

