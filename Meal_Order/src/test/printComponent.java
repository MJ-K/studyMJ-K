package test;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import javax.swing.*;

public class printComponent extends JFrame{
 public static void main(String[] args){
	 printComponent pc = new printComponent();
  pc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  pc.setSize(400, 300);
  pc.setVisible(true);
 }

 public printComponent(){
  super("Print Compnents");
  JLabel label;
  JTextField textField;

  Container pane = getContentPane();
  pane.setLayout(new GridBagLayout());
  GridBagConstraints gbc = new GridBagConstraints();
  gbc.anchor = GridBagConstraints.WEST;
  gbc.fill = GridBagConstraints.HORIZONTAL;
  gbc.insets = new Insets(5, 10, 5, 10);
  gbc.gridy = 0;
  label = new JLabel("last Name: " , JLabel.LEFT);
  pane.add(label, gbc);
  textField = new JTextField(8);
  pane.add(textField, gbc);
  label = new JLabel("First Name:", JLabel.LEFT);
  pane.add(label, gbc);
  textField = new JTextField(8);
  pane.add(textField, gbc);
  gbc.gridy++;
  label = new JLabel("Address:", JLabel.LEFT);
  pane.add(label, gbc);
  textField = new JTextField(8);
  gbc.gridwidth = GridBagConstraints.REMAINDER;
  pane.add(textField, gbc);
  gbc.gridy++;
  gbc.gridwidth = 1;
  label = new JLabel("Phone:", JLabel.LEFT);
  pane.add(label, gbc);
  textField = new JTextField(8);
  pane.add(textField, gbc);
  label = new JLabel("Postal Code:", JLabel.LEFT);
  pane.add(label, gbc);
  textField = new JTextField(8);
  pane.add(textField, gbc);
  gbc.gridy++;
  gbc.fill = GridBagConstraints.NONE;
  gbc.anchor = GridBagConstraints.CENTER;
  gbc.gridwidth = GridBagConstraints.REMAINDER;
  JButton btn = new JButton("Print");
  btn.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent event){
    performPrint();
   }
  });
  pane.add(btn, gbc);
 }

 protected void performPrint(){
  PrinterJob job = PrinterJob.getPrinterJob();
  job.setPrintable(new MyPrintable());
  try{
   job.print();
  }catch(PrinterException pe){};
 }
 class MyPrintable implements Printable{
  public int print(Graphics g, PageFormat pf, int index){
   if(index == 0){
    g.translate((int)(pf.getImageableX()), (int)(pf.getImageableY()));
    Container pane = getContentPane();
    pane.paint(g);
    return Printable.PAGE_EXISTS;
   }
   return Printable.NO_SUCH_PAGE;
  }
 }
}

