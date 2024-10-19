import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;


class LoginPage 
 {
    JFrame jf ;
    void createFrame()
    {
        jf = new JFrame();
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(600,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("Login Page");
        jf.getContentPane().setBackground(new Color(192,192,192));
        Image icon = Toolkit.getDefaultToolkit().getImage("apps.png");
        jf.setIconImage(icon);    
    }
    void setComponent(){
        JLabel userlbl = new JLabel("Username: ");    
        userlbl.setBounds(100,50,100,30);
        jf.add(userlbl);

        JLabel passlbl = new JLabel("Password: ");    
        passlbl.setBounds(100,140,100,30);
        jf.add(passlbl);

        JTextField usertxt = new JTextField();
        usertxt.setBounds(200,50,170,30);
        jf.add(usertxt);

        JPasswordField passtxt = new JPasswordField();
        passtxt.setBounds(200,140,170,30);
        jf.add(passtxt);

        JButton btn1 = new JButton("Login");
        btn1.setBounds(150,250,100,40);
        jf.add(btn1);

        JButton btn2 = new JButton("Clear");
        btn2.setBounds(300,250,100,40);
        jf.add(btn2);


    }

}

class Test 
{
public static void main (String args[])
{
        LoginPage lp = new LoginPage();
        lp.createFrame();
        lp.setComponent();
    }
}