package travel.management.system;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
JButton login, signup, password;
JTextField tfpassword, tfusername;
    Login() {
        super("Login Page");
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(131, 193, 233));
        panel1.setBounds(0, 0, 400, 400);
        panel1.setLayout(null);
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        panel1.add(image);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(400, 30, 450, 300);
        add(panel2);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        panel2.add(lblusername);

         tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        panel2.add(lblpassword);

         tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(tfpassword);

        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133, 193, 233)));
        login.addActionListener(this);
        panel2.add(login);

        signup = new JButton("Signup");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));
       signup.addActionListener(this);
        panel2.add(signup);

        password = new JButton("Forgot Password");
        password.setBounds(130, 250, 130, 30);
        password.setBackground(new Color(133, 193, 233));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(133, 193, 233)));
       password.addActionListener(this);
        panel2.add(password);
        
        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300, 250, 200, 20);
        text.setForeground(Color.RED);
        panel2.add(text);
        
        
        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae) {
         if(ae.getSource() == login){
             
            try { 
                
        String username = tfusername.getText();
            //String name = tfname.getText();
            String pass = tfpassword.getText();
            //String question = security.getSelectedItem();
           // String answer = tfanswer.getText();
           
           String query = "select * from account1 where username = '"+username+"' AND password= '"+pass+"'" ;
             Conn c = new Conn();
              ResultSet rs = c.s.executeQuery(query);
             if(rs.next()){
             setVisible(false);
             new Loading(username);
             
             }
             else {
                 JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
             }
             
         }
            
            catch (Exception e) {
                e.printStackTrace();
            }
            
            
         }
            
         else if (ae.getSource()== signup) {
             setVisible(false);
             new Signup();
         }
         else 
         {
             setVisible(false);
             new ForgotPassword();
         }
     }
             
    
    
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}
