
package smartcity.traveller;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class CustomerDetails extends JFrame implements ActionListener{
    JLabel username,name;
    JComboBox comboid,combogender;
    JTextField phone,country,address,email;
    JButton add,back;
    CustomerDetails(String cusername){
        setBounds(270,100,850,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel uname = new JLabel("Username");
        uname.setFont(new Font("Serif",Font.PLAIN,15));
        uname.setBounds(30,50,150,25);
        add(uname);
        
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
        
        comboid = new JComboBox(new String[]{"Aadhar Id","Pancard","Voter Id","Passport"});
        comboid.setBounds(210,150,200,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel number = new JLabel("Mobile No.");
        number.setFont(new Font("Serif",Font.PLAIN,15));
        number.setBounds(30,200,150,25);
        add(number);
        
        phone = new JTextField();
        phone.setBounds(210,200,200,25);
        add(phone);
        
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Serif",Font.PLAIN,15));
        gender.setBounds(30,250,150,25);
        add(gender);
        
        combogender = new JComboBox(new String[]{"Male","Female","Others",});
        combogender.setBounds(210,250,200,25);
        combogender.setBackground(Color.WHITE);
        add(combogender);
        
        JLabel ucountry = new JLabel("Country");
        ucountry.setFont(new Font("Serif",Font.PLAIN,15));
        ucountry.setBounds(30,300,150,25);
        add(ucountry);
        
        country = new JTextField();
        country.setBounds(210,300,200,25);
        add(country);
        
        JLabel uaddress = new JLabel("Address");
        uaddress.setFont(new Font("Serif",Font.PLAIN,15));
        uaddress.setBounds(30,350,150,25);
        add(uaddress);
        
        address = new JTextField();
        address.setBounds(210,350,200,25);
        add(address);
        
        JLabel uemail = new JLabel("Email");
        uemail.setFont(new Font("Serif",Font.PLAIN,15));
        uemail.setBounds(30,400,150,25);
        add(uemail);
        
        email = new JTextField();
        email.setBounds(210,400,200,25);
        add(email);
        
        add = new JButton("Add");
        add.setBounds(80,460,100,25);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(Color.RED);
        add.setForeground(Color.WHITE);
        add.setBorder(BorderFactory.createEmptyBorder());
        add.addActionListener(this);
        add(add);
        
        back = new JButton("Delete");
        back.setBounds(220,460,100,25);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        add(back);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image image = icon.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(image);
        JLabel jl = new JLabel(icon1);
        jl.setBounds(430,50,450,420);
        add(jl);
        
        try{
            String query = "select * from account where username = 'Harsh_Sharma'";
            
            Database d = new Database();
            ResultSet rs = d.s.executeQuery(query);
            
            while(rs.next()){
                username.setText(rs.getString("username"));
                name.setText(rs.getString("name"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String userName = username.getText();
            String Name = name.getText();
            String Id = (String)comboid.getSelectedItem();
            String number = phone.getText();
            String gender = (String)combogender.getSelectedItem();
            String Country = country.getText();
            String Email = email.getText();
            String Address = address.getText();
            
            String query1 = "insert into customer values('"+userName+"','"+Name+"','"+Id+"','"+number+"','"+gender+"','"+Country+"','"+Email+"','"+Address+"')";
            try{
                Database d = new Database();
                d.s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null, "Customer details added successfully");
                setVisible(false);
               
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
    new  CustomerDetails("");
    }
}
