package test;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

public class test7 extends JFrame {
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    test7 frame = new test7();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public test7() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 365, 650);
        getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 350,610);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        getContentPane().add(scrollPane);

        /*JPanel borderlaoutpanel = new JPanel();
        borderlaoutpanel.setLayout(new BorderLayout(0,0));*/
       
       // scrollPane.setViewportView(borderlaoutpanel);

        JPanel columnpanel = new JPanel();
        scrollPane.setViewportView(columnpanel);
        //borderlaoutpanel.add(columnpanel, BorderLayout.NORTH);
        columnpanel.setLayout(new GridLayout(0, 1, 0, 10));
        columnpanel.setBackground(SystemColor.inactiveCaptionBorder);

        for(int i=0;i<10;i++) {
            JPanel rowPanel = new JPanel();
            rowPanel.setPreferredSize(new Dimension(350,260));
            rowPanel.setLayout(null);
            rowPanel.setBackground(Color.PINK);
            rowPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            
            JButton button = new JButton("New button");
            button.setBounds(20, 5, 89, 23);
            rowPanel.add(button);
            
            columnpanel.add(rowPanel);
            

            if(i%2==0)
                rowPanel.setBackground(Color.CYAN);
        }
    }
}