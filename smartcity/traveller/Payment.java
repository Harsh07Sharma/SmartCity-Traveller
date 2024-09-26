package smartcity.traveller;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    JButton pay,back;
    Payment(){
        setBounds(300, 70, 800, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i = icon.getImage().getScaledInstance(480, 500, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(i);
        JLabel jl = new JLabel(icon2);
        jl.setBounds(150,30,480,500);
        add(jl);
        
        pay = new JButton("Pay");
        pay.setBounds(250, 540, 100, 20);
        pay.setFont(new Font("Tahoma",Font.BOLD,10));
        pay.setForeground(Color.WHITE);
        pay.setBackground(Color.RED);
        pay.addActionListener(this);
        add(pay);
        
        back = new JButton("Go Back");
        back.setBounds(380, 540, 100, 20);
        back.setFont(new Font("Tahoma",Font.BOLD,10));
        back.setForeground(Color.WHITE);
        back.setBackground(Color.RED);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == pay){
            new Paytm().setVisible(true);
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Payment();
    }
}
