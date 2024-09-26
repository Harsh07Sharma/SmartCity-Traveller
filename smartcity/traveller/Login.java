
package smartcity.traveller;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton jb,signup,forgotPassword;
    JTextField text,text1;
    Login(){
        setSize(800,400);
        setLocation(200,150);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel jp = new JPanel();
        jp.setBackground(new Color(116, 100, 188));
        jp.setBounds(0,0,400,400);
        jp.setLayout(null);
        add(jp);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image image = icon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(image);
        JLabel jl = new JLabel(icon1);
        jl.setBounds(60,60,250,250);
        jp.add(jl);
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.setBounds(400,30,450,300);
        add(jp2);
        
        JLabel j2 = new JLabel("Username");
        j2.setBounds(60,20,100,25);
        j2.setFont(new Font("Serif",Font.BOLD,20));
        jp2.add(j2);
        
        text = new JTextField();
        text.setBounds(60,60,300,40);
        text.setBorder(BorderFactory.createEmptyBorder());
        jp2.add(text);
        
        JLabel j3 = new JLabel("Password");
        j3.setBounds(60,130,100,25);
        j3.setFont(new Font("Serif",Font.BOLD,20));
        jp2.add(j3);
        
        text1 = new JTextField();
        text1.setBounds(60,170,300,40);
        text1.setBorder(BorderFactory.createEmptyBorder());
        jp2.add(text1);
        
        jb = new JButton("Login");
        jb.setBounds(60,240,80,30);
        jb.setBackground(Color.RED);
        jb.setForeground(Color.WHITE);
        jb.setBorder(new LineBorder(Color.RED));
        jb.addActionListener(this);
        jp2.add(jb);
        
        signup = new JButton("Signup");
        signup.setBounds(160,240,80,30);
        signup.setBackground(Color.RED);
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(Color.RED));
        signup.addActionListener(this);
        jp2.add(signup);
        
        forgotPassword = new JButton("Forgot Pass");
        forgotPassword.setBounds(260,240,100,30);
        forgotPassword.setBackground(Color.RED);
        forgotPassword.setForeground(Color.WHITE);
        forgotPassword.setBorder(new LineBorder(Color.RED));
        forgotPassword.addActionListener(this);
        jp2.add(forgotPassword);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == jb){
            try{
            String username =  text.getText();
            String password = text1.getText();
           
            String query1 = "select * from account where username = '"+username+"' and password = '"+password+"'";
            
            Database d = new Database();
            ResultSet rs = d.s.executeQuery(query1);
            if(rs.next()){
                setVisible(false);
                new Loading(username);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Username or Password");
            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == signup){
            setVisible(false);
            new Signup();
        }
        else{
            setVisible(false);
            new ForgetPassword();
        }
    }
    
    public static void main(String[] args){
        Login l1 = new Login();
    }
}
