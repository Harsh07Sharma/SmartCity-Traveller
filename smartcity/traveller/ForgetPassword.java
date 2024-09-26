package smartcity.traveller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener {
    JTextField text1,text2,text3,text4,text5;
    JButton button,button2,button3;
    ForgetPassword(){
       setBounds(200,150,800,400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
       Image i = icon.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT);
       ImageIcon icon2 = new ImageIcon(i);
       JLabel jl = new JLabel(icon2);
       jl.setBounds(520,70,220,220);
       add(jl);
       
       JPanel jp = new JPanel();
       jp.setLayout(null);
       jp.setBounds(30,30,450,300);
       add(jp);
       
       JLabel jl1 = new JLabel("Username");
       jl1.setBounds(40,40,100,25);
       jl1.setForeground(Color.BLACK);
       jl1.setFont(new Font("Tahoma",Font.BOLD,15));
       jp.add(jl1);
       
       text1 = new JTextField();
       text1.setBounds(160,40,150,25);
       text1.setBorder(BorderFactory.createEmptyBorder());
       jp.add(text1);
       
       button = new JButton("Search Account");
       button.setBounds(330,40,100,25);
       button.setForeground(Color.WHITE);
       button.setBackground(Color.RED);
       button.setBorder(BorderFactory.createEmptyBorder());
       button.addActionListener(this);
       jp.add(button);
       
       JLabel jl2 = new JLabel("Name");
       jl2.setBounds(40,80,100,25);
       jl2.setForeground(Color.BLACK);
       jl2.setFont(new Font("Tahoma",Font.BOLD,15));
       jp.add(jl2);
       
       text2 = new JTextField();
       text2.setBounds(160,80,150,25);
       text2.setBorder(BorderFactory.createEmptyBorder());
       jp.add(text2);
       
       JLabel jl3 = new JLabel("Security");
       jl3.setBounds(40,120,100,25);
       jl3.setForeground(Color.BLACK);
       jl3.setFont(new Font("Tahoma",Font.BOLD,15));
       jp.add(jl3);
       
       text3 = new JTextField();
       text3.setBounds(160,120,150,25);
       text3.setBorder(BorderFactory.createEmptyBorder());
       jp.add(text3);
       
       JLabel jl4 = new JLabel("Answer");
       jl4.setBounds(40,160,100,25);
       jl4.setForeground(Color.BLACK);
       jl4.setFont(new Font("Tahoma",Font.BOLD,15));
       jp.add(jl4);
       
       text4 = new JTextField();
       text4.setBounds(160,160,150,25);
       text4.setBorder(BorderFactory.createEmptyBorder());
       jp.add(text4);
       
       button2 = new JButton("Retrieve Pass");
       button2.setBounds(330,160,100,25);
       button2.setForeground(Color.WHITE);
       button2.setBackground(Color.RED);
       button2.setBorder(BorderFactory.createEmptyBorder());
       button2.addActionListener(this);
       jp.add(button2);
       
       JLabel jl5 = new JLabel("Password");
       jl5.setBounds(40,200,100,25);
       jl5.setForeground(Color.BLACK);
       jl5.setFont(new Font("Tahoma",Font.BOLD,15));
       jp.add(jl5);
       
       text5 = new JTextField();
       text5.setBounds(160,200,150,25);
       text5.setBorder(BorderFactory.createEmptyBorder());
       jp.add(text5);
       
       button3 = new JButton("Go Home");
       button3.setBounds(160,250,100,25);
       button3.setForeground(Color.WHITE);
       button3.setBackground(Color.RED);
       button3.setBorder(BorderFactory.createEmptyBorder());
       button3.addActionListener(this);
       jp.add(button3);
               
       setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == button){
                try{
                   String query = "select * from account where username = '"+text1.getText()+"'";
                   Database d = new Database();
                   
                   ResultSet rs = d.s.executeQuery(query);
                   while(rs.next()){
                       text2.setText(rs.getString("name"));
                       text3.setText(rs.getString("options"));
                   }
                }
                catch(Exception e){
                e.printStackTrace();
                }
            }
            else if(ae.getSource() == button2){
                try{
                   String query = "select * from account where answer = '"+text4.getText()+"'";
                   Database d = new Database();
                   
                   ResultSet rs = d.s.executeQuery(query);
                   while(rs.next()){
                       text5.setText(rs.getString("password"));
                   }
                }
                catch(Exception e){
                e.printStackTrace();
                }
            }
            else{
                setVisible(false);
                new Login();
            }
    }
    public static void main(String[] args){
        new ForgetPassword();
    
    }
}
