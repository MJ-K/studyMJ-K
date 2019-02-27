package test;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class test5_jdialog extends JFrame{

	test5_jdialog() {
       /* JFrame f = new JFrame("Login Required");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f.setSize(400, 300);
        f.setResizable(false);
        f.setLocationByPlatform(true);*/
        //f.setVisible(true);

        //showLogin();
		
		JPanel p = new JPanel(new BorderLayout(5,5));

        JPanel labels = new JPanel(new GridLayout(0,1,2,2));
        labels.add(new JLabel("User Name", SwingConstants.RIGHT));
        labels.add(new JLabel("Password", SwingConstants.RIGHT));
        p.add(labels, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0,1,2,2));
        JTextField username = new JTextField("Joe Blogs");
        controls.add(username);
        JPasswordField password = new JPasswordField();
        password.setEchoChar('●');
        //password.addAncestorListener(new RequestFocusListener(false));
        controls.add(password);
        p.add(controls, BorderLayout.CENTER);

        //LayoutManager l = new GroupLasyout(p);
        //p.setLayout(l);
        JOptionPane.showConfirmDialog(getContentPane(), p, "Log In", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
    }

 /*   private void showLogin() {
    	JFrame frame = new JFrame("");
        JPanel p = new JPanel(new BorderLayout(5,5));

        JPanel labels = new JPanel(new GridLayout(0,1,2,2));
        labels.add(new JLabel("User Name", SwingConstants.RIGHT));
        labels.add(new JLabel("Password", SwingConstants.RIGHT));
        p.add(labels, BorderLayout.WEST);

        JPanel controls = new JPanel(new GridLayout(0,1,2,2));
        JTextField username = new JTextField("Joe Blogs");
        controls.add(username);
        JPasswordField password = new JPasswordField();
        password.addAncestorListener(new RequestFocusListener(false));
        controls.add(password);
        p.add(controls, BorderLayout.CENTER);

        //LayoutManager l = new GroupLayout(p);
        //p.setLayout(l);
        JOptionPane.showConfirmDialog(frame, p, "Log In", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    }

    *//**
     * @param args  none
     *//**/
    public static void main(String[] args) {
        
       
                new test5_jdialog();
          
    }

}

/**
 *  Convenience class to request focus on a component.
 *
 *  When the component is added to a realized Window then component will
 *  request focus immediately, since the ancestorAdded event is fired
 *  immediately.
 *
 *  When the component is added to a non realized Window, then the focus
 *  request will be made once the window is realized, since the
 *  ancestorAdded event will not be fired until then.
 *
 *  Using the default constructor will cause the listener to be removed
 *  from the component once the AncestorEvent is generated. A second constructor
 *  allows you to specify a boolean value of false to prevent the
 *  AncestorListener from being removed when the event is generated. This will
 *  allow you to reuse the listener each time the event is generated.
 */
class RequestFocusListener implements AncestorListener
{
    private boolean removeListener;

    /*
     *  Convenience constructor. The listener is only used once and then it is
     *  removed from the component.
     */
    public RequestFocusListener()
    {
        this(true);
    }

    /*
     *  Constructor that controls whether this listen can be used once or
     *  multiple times.
     *
     *  @param removeListener when true this listener is only invoked once
     *                        otherwise it can be invoked multiple times.
     */
    public RequestFocusListener(boolean removeListener)
    {
        this.removeListener = removeListener;
    }

    @Override
    public void ancestorAdded(AncestorEvent e)
    {
        JComponent component = e.getComponent();
        component.requestFocusInWindow();

        if (removeListener)
            component.removeAncestorListener( this );
    }

    @Override
    public void ancestorMoved(AncestorEvent e) {}

    @Override
    public void ancestorRemoved(AncestorEvent e) {}
}