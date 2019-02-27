package problem04;

import java.awt.Point;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.sun.glass.events.KeyEvent;

public class Main {
	
	
	public static void main(String[] args) {
		
		JFrame jf =new JFrame();
		jf.setSize(10,10);
				
		class key implements KeyListener{
	
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				// TODO Auto-generated method stub
				Point p = jf.getLocation();
				
				if(e.getKeyCode()==32||e.getKeyCode()==13) {
					String[] str = {"0","#"};
					String map = "";
					
					int num1=(int)(Math.random()*9)+10;
					int num2=(int)(Math.random()*9)+10;
					
					if(num1<10||num2<10) {
							System.out.println("시스템오류");
					}else {
						
						for(int i = 0;i<(num1+num2);i++) {
							map.concat(str[(int) (Math.random()*1)]);
						}
						
						System.out.println(map);
					}
				}
			}

			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
       /* class key implements KeyListener{
            
            public void keyPressed(KeyEvent e) {

                Point p = f.getLocation();
                
                if( e.getKeyCode() == 37 ) f.setLocation( p.x-20, p.y);
                if( e.getKeyCode() == 38 ) f.setLocation( p.x, p.y-20);
                if( e.getKeyCode() == 39 ) f.setLocation( p.x+20, p.y);
                if( e.getKeyCode() == 40 ) f.setLocation( p.x, p.y+20);             
            }

            public void keyReleased(KeyEvent e){ }          
            public void keyTyped(KeyEvent e) { }        */     
                        
	
		jf.setVisible(true);
		jf.addKeyListener(new key());
	}
	
}

