
package smartcity.traveller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton button,button2;
    JTextField text1,text2,text3,text4;
    Choice options;
    Signup(){
        setBounds(200,150,800,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
 
        
        JPanel jp = new JPanel();
        jp.setBackground(new Color(116, 100, 188));
        jp.setBounds(0,0,400,400);
        jp.setLayout(null);
        add(jp);
        
        JLabel jl = new JLabel("UserName");
        jl.setBounds(60,50,100,25);
        jl.setFont(new Font("Serif",Font.BOLD,18));
        jl.setForeground(Color.WHITE);
        jp.add(jl);
        
        text1 = new JTextField();
        text1.setBounds(180,50,130,25);
        text1.setBorder(BorderFactory.createEmptyBorder());
        jp.add(text1);
        
        JLabel j2 = new JLabel("Name");
        j2.setBounds(60,100,100,25);
        j2.setFont(new Font("Serif",Font.BOLD,18));
        j2.setForeground(Color.WHITE);
        jp.add(j2);
        
        text2 = new JTextField();
        text2.setBounds(180,100,130,25);
        text2.setBorder(BorderFactory.createEmptyBorder());
        jp.add(text2);
        
        JLabel j3 = new JLabel("Password");
        j3.setBounds(60,150,100,25);
        j3.setFont(new Font("Serif",Font.BOLD,18));
        j3.setForeground(Color.WHITE);
        jp.add(j3);
        
        text3 = new JTextField();
        text3.setBounds(180,150,130,25);
        text3.setBorder(BorderFactory.createEmptyBorder());
        jp.add(text3);
        
        JLabel security = new JLabel("Security");
        security.setBounds(60,200,100,25);
        security.setFont(new Font("Serif",Font.BOLD,18));
        security.setForeground(Color.WHITE);
        jp.add(security);
        
        options = new Choice();
        options.add("What is your Nickname");
        options.add("What is your Age");
        options.add("Who is your best friend");
        options.setBounds(180,200,130,25);
        jp.add(options);
        
        JLabel j4 = new JLabel("Answer");
        j4.setBounds(60,250,100,25);
        j4.setFont(new Font("Serif",Font.BOLD,18));
        j4.setForeground(Color.WHITE);
        jp.add(j4);
        
        text4 = new JTextField();
        text4.setBounds(180,250,130,25);
        text4.setBorder(BorderFactory.createEmptyBorder());
        jp.add(text4);
        
        button = new JButton("Create Account");
        button.setBounds(80,305,100,20);
        button.setForeground(new Color(116, 100, 188));
        button.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(this);
        jp.add(button);
        
        button2 = new JButton("Go Back");
        button2.setBounds(210,305,100,20);
        button2.setForeground(new Color(116, 100, 188));
        button2.setBackground(Color.WHITE);
        button2.setBorder(BorderFactory.createEmptyBorder());
        button2.addActionListener(this);
        jp.add(button2);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image image = icon.getImage().getScaledInstance(230, 230, Image.SCALE_DEFAULT);
        ImageIcon icon1 = new ImageIcon(image);
        JLabel jlabel = new JLabel(icon1);
        jlabel.setBounds(480,80,230,230);
        add(jlabel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            String username = text1.getText();
            String name = text2.getText();
            String password = text3.getText();
            String option = options.getSelectedItem();
            String ans = text4.getText();
            
            String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+option+"','"+ans+"')";
            try{
                Database d = new Database();
                d.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new Login();
            }
            catch(Exception d){
             d.printStackTrace();
            }
        }
        else if(e.getSource() == button2){
            setVisible(false);
            new Login();
        }
    } 
    public static void main(String[] args){
        new Signup();
    }
}
