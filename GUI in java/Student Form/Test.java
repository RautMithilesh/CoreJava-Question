import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;

class LoginPage 
{
    JFrame jf;
    void createFrame()
     {
        jf = new JFrame();
        jf.setVisible(true);
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(600, 200);
        jf.setTitle("Student Information");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(new Color(192, 192, 192));
        Image icon = Toolkit.getDefaultToolkit().getImage("student.png");
        jf.setIconImage(icon);
    }

    void setLabels()
     {
        JLabel nameLabel = new JLabel("Name: ");
        jf.add(nameLabel);
        nameLabel.setBounds(100, 100, 100, 30);

        JLabel genderLabel = new JLabel("Gender: ");
        jf.add(genderLabel);
        genderLabel.setBounds(100, 150, 100, 30);


        JLabel mobileLabel = new JLabel("Mobile: ");
        jf.add(mobileLabel);
        mobileLabel.setBounds(100, 200, 100, 30);

        JLabel emailLabel = new JLabel("Email: ");
        jf.add(emailLabel);
        emailLabel.setBounds(100, 250, 100, 30);

        JLabel dobLabel = new JLabel("DOB: ");
        jf.add(dobLabel);
        dobLabel.setBounds(100, 300, 100, 30);

        JLabel bloodGrLabel = new JLabel("Blood Group: ");
        jf.add(bloodGrLabel);
        bloodGrLabel.setBounds(100, 350, 100, 30);

        JLabel addressLabel = new JLabel("Address: ");
        jf.add(addressLabel);
        addressLabel.setBounds(100, 400, 100, 30);
    }

    void setFields() 
    {
        JTextField nameField = new JTextField();
        jf.add(nameField);
        nameField.setBounds(180, 100, 300, 30);

        JRadioButton maleButton = new JRadioButton("Male");
        jf.add(maleButton);
        maleButton.setBounds(180,150,140,30);

        JRadioButton femaleButton = new JRadioButton("Female");
        jf.add(femaleButton);
        femaleButton.setBounds(350,150,130,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(maleButton);
        bg.add(femaleButton);

        JTextField mobileField = new JTextField();
        jf.add(mobileField);
        mobileField.setBounds(180, 200, 300, 30);

        JTextField emailField = new JTextField();
        jf.add(emailField);
        emailField.setBounds(180, 250, 300, 30);

        JTextField dobField = new JTextField(6);
        jf.add(dobField);
        dobField.setBounds(180, 300, 300, 30);
   
        JTextArea addressTextArea = new JTextArea();
        jf.add(addressTextArea);
        addressTextArea.setBounds(180, 400, 300, 30);
    }

    void setButtons()
     {
        JButton SubmitButton = new JButton("Submit");
        jf.add(SubmitButton);
        SubmitButton.setBounds(170, 500, 100, 40);

        JButton clearButton = new JButton("Clear");
        jf.add(clearButton);
        clearButton.setBounds(300, 500, 100, 40);
    }
    
    void setDropdown() 
    {
        String[] choices = { "Select", "    A+", "    B+", "    O+", "    AB+", "    A-" , "    B-","    AB-","    O-"};
        JComboBox<String> cb = new JComboBox<String>(choices);
        cb.setVisible(true);
        jf.add(cb);
        cb.setBounds(180, 350, 150, 30);
    }
}

class Test
 {
    public static void main (String args[])
    {
        LoginPage lp = new LoginPage();
        lp.createFrame();
        lp.setLabels();
        lp.setFields();
        lp.setButtons();
        lp.setDropdown();
    }
}