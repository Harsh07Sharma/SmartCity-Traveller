package smartcity.traveller;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class DeleteDetails extends JFrame implements ActionListener{
    JLabel username,name,comboid,combogender,email,address,country,phone;
    JButton back;
    String uusername;
    
    DeleteDetails(String uusername){
        this.uusername = uusername;
        setBounds(270,100,850,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel cusername = new JLabel("Username");
        cusername.setFont(new Font("SERIF",Font.PLAIN,15));
        cusername.setBounds(30,50,150,25);
        add(cusername);
        
        username = new JLabel();
        username.setBounds(210,50,200,25);
        add(username);
        
        JLabel cname = new JLabel("Name");
        cname.setFont(new Font("Serif",Font.PLAIN,15));
        cname.setBounds(30,100,150,25);
        add(cname);
        
        name = new JLabel();
        name.setBounds(210,100,200,25);
        add(name);
        
        JLabel id = new JLabel("Verification Id");
        id.setFont(new Font("Serif",Font.PLAIN,15));
        id.setBounds(30,150,150,25);
        add(id);
        
        comboid = new JLabel();
        comboid.setBounds(210,150,200,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel number = new JLabel("Mobile No.");
        number.setFont(new Font("Serif",Font.PLAIN,15));
        number.setBounds(30,200,150,25);
        add(number);
        
        phone = new JLabel();
        phone.setBounds(210,200,200,25);
        add(phone);
        
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Serif",Font.PLAIN,15));
        gender.setBounds(30,250,150,25);
        add(gender);
        
        combogender = new JLabel();
        combogender.setBounds(210,250,200,25);
        combogender.setBackground(Color.WHITE);
        add(combogender);
        
        JLabel ucountry = new JLabel("Country");
        ucountry.setFont(new Font("Serif",Font.PLAIN,15));
        ucountry.setBounds(440,50,150,25);
        add(ucountry);
        
        country = new JLabel();
        country.setBounds(620,50,200,25);
        add(country);
        
        JLabel uaddress = new JLabel("Address");
        uaddress.setFont(new Font("Serif",Font.PLAIN,15));
        uaddress.setBounds(440,100,150,25);
        add(uaddress);
        
        address = new JLabel();
        address.setBounds(620,100,200,25);
        add(address);
        
        JLabel uemail = new JLabel("Email");
        uemail.setFont(new Font("Serif",Font.PLAIN,15));
        uemail.setBounds(440,150,150,25);
        add(uemail);
        
        email = new JLabel();
        email.setBounds(620,150,200,25);
        add(email);
        
        back = new JButton("Delete");
        back.setFont(new Font("Tahoma",Font.BOLD,12));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setBounds(510,220,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i = icon.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(i);
        JLabel jl = new JLabel(icon1);
        jl.setBounds(100,290,600,200);
        add(jl);
        
        try{
            String query = "select * from customer where username = '"+uusername+"'";
            
            Database d = new Database();
            ResultSet rs = d.s.executeQuery(query);
            while(rs.next()){
                username.setText(rs.getString("username"));
                name.setText(rs.getString("name"));
                comboid.setText(rs.getString("id"));
                combogender.setText(rs.getString("gender"));
                phone.setText(rs.getString("number"));
                country.setText(rs.getString("country"));
                email.setText(rs.getString("email"));
                address.setText(rs.getString("address"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
       
        
        setVisible(true); 

     }
    
    public void actionPerformed(ActionEvent ae){
       try{
           Database d = new Database();
           d.s.executeUpdate("delete from account where username = '"+uusername+"'");
           d.s.executeUpdate("delete from customer where username = '"+uusername+"'");
           d.s.executeUpdate("delete from bookPackage where username = '"+uusername+"'");
           d.s.executeUpdate("delete from bookhotel where username = '"+uusername+"'");
           
           JOptionPane.showMessageDialog(null,"DATA DELETED SUCCESSFULLY");
           setVisible(false);
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    public static void main(String[] args){
    new DeleteDetails("Harsh_Sharma");
    }
}

