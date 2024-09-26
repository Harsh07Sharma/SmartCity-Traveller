package smartcity.traveller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton details,update,view,packages,bookPackages,viewPackages,about;
    JButton viewHotel,destination,bookHotel,seeYourHotel,payment,calculator,notepad;
    Dashboard(String username){
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.setBackground(new Color(0,0,102));
        jp.setBounds(0,0,1920,60);
        add(jp);
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i1 = icon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon icon2 = new ImageIcon(i1);
        JLabel jl = new JLabel(icon2);
        jl.setBounds(10,0,70,70);
        jp.add(jl);
        
        JLabel text = new JLabel("Dashboard");
        text.setBounds(100,6,200,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("SANS_SERIF",Font.BOLD,22));
        jp.add(text);
        
        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.setBackground(new Color(0,0,102));
        jp2.setBounds(0,60,250,1080);
        add(jp2);
        
        details = new JButton("Add Details");
        details.setBounds(0,0,250,40);
        details.setBackground(new Color(0,0,102));
        details.setFont(new Font("Tahoma",Font.PLAIN,15));
        details.setForeground(Color.WHITE);
        details.setMargin(new Insets(0,0,0,99));
        details.addActionListener(this);
        jp2.add(details);
        
        update = new JButton("Update");
        update.setBounds(0,40,250,40);
        update.setBackground(new Color(0,0,102));
        update.setFont(new Font("Tahoma",Font.PLAIN,15));
        update.setForeground(Color.WHITE);
        update.setMargin(new Insets(0,0,0,130));
        update.addActionListener(this);
        jp2.add(update);
        
        view = new JButton("View");
        view.setBounds(0,80,250,40);
        view.setBackground(new Color(0,0,102));
        view.setFont(new Font("Tahoma",Font.PLAIN,15));
        view.setForeground(Color.WHITE);
        view.setMargin(new Insets(0,0,0,142));
        view.addActionListener(this);
        jp2.add(view);
        
        JButton remove = new JButton("Remove");
        remove.setBounds(0,120,250,40);
        remove.setBackground(new Color(0,0,102));
        remove.setFont(new Font("Tahoma",Font.PLAIN,15));
        remove.setForeground(Color.WHITE);
        remove.setMargin(new Insets(0,0,0,124));
        jp2.add(remove);
        
        packages = new JButton("Available Packages");
        packages.setBounds(0,160,250,40);
        packages.setBackground(new Color(0,0,102));
        packages.setFont(new Font("Tahoma",Font.PLAIN,15));
        packages.setForeground(Color.WHITE);
        packages.setMargin(new Insets(0,0,0,53));
        packages.addActionListener(this);
        jp2.add(packages);
        
        bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,200,250,40);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setMargin(new Insets(0,0,0,84));
        bookPackages.addActionListener(this);
        jp2.add(bookPackages);
        
        viewPackages = new JButton("View Packages");
        viewPackages.setBounds(0,240,250,40);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setMargin(new Insets(0,0,0,82));
        viewPackages.addActionListener(this);
        jp2.add(viewPackages);
        
        viewHotel = new JButton("Hotels");
        viewHotel.setBounds(0,280,250,40);
        viewHotel.setBackground(new Color(0,0,102));
        viewHotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        viewHotel.setForeground(Color.WHITE);
        viewHotel.setMargin(new Insets(0,0,0,133));
        viewHotel.addActionListener(this);
        jp2.add(viewHotel);
        
        bookHotel = new JButton("Book a Hotel");
        bookHotel.setBounds(0,320,250,40);
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setMargin(new Insets(0,0,0,92));
        jp2.add(bookHotel);
        
        seeYourHotel = new JButton("View your Hotel");
        seeYourHotel.setBounds(0,360,250,40);
        seeYourHotel.setBackground(new Color(0,0,102));
        seeYourHotel.setFont(new Font("Tahoma",Font.PLAIN,15));
        seeYourHotel.setForeground(Color.WHITE);
        seeYourHotel.setMargin(new Insets(0,0,0,70));
        seeYourHotel.addActionListener(this);
        jp2.add(seeYourHotel);
        
        destination = new JButton("Destination");
        destination.setBounds(0,400,250,40);
        destination.setBackground(new Color(0,0,102));
        destination.setFont(new Font("Tahoma",Font.PLAIN,15));
        destination.setForeground(Color.WHITE);
        destination.setMargin(new Insets(0,0,0,98));
        destination.addActionListener(this);
        jp2.add(destination);
        
        payment = new JButton("Payment");
        payment.setBounds(0,440,250,40);
        payment.setBackground(new Color(0,0,102));
        payment.setFont(new Font("Tahoma",Font.PLAIN,15));
        payment.setForeground(Color.WHITE);
        payment.setMargin(new Insets(0,0,0,108));
        payment.addActionListener(this);
        jp2.add(payment);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0,480,250,40);
        calculator.setBackground(new Color(0,0,102));
        calculator.setFont(new Font("Tahoma",Font.PLAIN,15));
        calculator.setForeground(Color.WHITE);
        calculator.setMargin(new Insets(0,0,0,108));
        calculator.addActionListener(this);
        jp2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,520,250,40);
        notepad.setBackground(new Color(0,0,102));
        notepad.setFont(new Font("Tahoma",Font.PLAIN,15));
        notepad.setForeground(Color.WHITE);
        notepad.setMargin(new Insets(0,0,0,108));
        notepad.addActionListener(this);
        jp2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,560,250,40);
        about.setBackground(new Color(0,0,102));
        about.setFont(new Font("Tahoma",Font.PLAIN,15));
        about.setForeground(Color.WHITE);
        about.setMargin(new Insets(0,0,0,108));
        about.addActionListener(this);
        jp2.add(about);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image image = i.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT);
        ImageIcon ic = new ImageIcon(image);
        JLabel j2 = new JLabel(ic);
        j2.setBounds(0,0,1920,1000);
        add(j2);
        
        JLabel title = new JLabel("Smartcity Traveller");
        title.setBounds(500,70,900,60);
        title.setFont(new Font("Serif",Font.BOLD,50));
        title.setForeground(Color.WHITE);
        j2.add(title);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == details){
            new CustomerDetails(username);
        }
        else if(ae.getSource() == update){
            new UpdateDetails(username);
        }
        else if(ae.getSource() == view){
            new ViewDetails(username);
        }
        else if(ae.getSource() == packages){
            new AvailablePackages(username);
        }
        else if(ae.getSource() == bookPackages){
            new BookPackage(username).setVisible(true);
        }
        else if(ae.getSource() == viewPackages){
            new ViewPackage(username).setVisible(true);
        }
        else if(ae.getSource() == viewHotel){
            new CheckHotels().setVisible(true);
        }
        else if(ae.getSource() == destination){
            new Destinations().setVisible(true);
        }
        else if(ae.getSource() == bookHotel){
            new BookHotel(username).setVisible(true);
        }
        else if(ae.getSource() == seeYourHotel){
            new ViewHotel(username).setVisible(true);
        }
        else if(ae.getSource() == payment){
            new Payment().setVisible(true);
        }
        else if(ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == about){
          new About().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}
