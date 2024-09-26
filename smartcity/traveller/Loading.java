package smartcity.traveller;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    String username;
    Thread thread;
    JProgressBar progress;
    Loading(String username){
        this.username = username;
        thread = new Thread(this);
        setBounds(350,150,600,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel title = new JLabel("Smartcity Traveller");
        title.setBounds(140,20,750,40);
        title.setForeground(Color.RED);
        title.setFont(new Font("Raleway",Font.BOLD,35));
        add(title);
        
        progress = new JProgressBar();
        progress.setBounds(150,110,300,35);
        progress.setStringPainted(true);
        add(progress);
        
        JLabel loading = new JLabel("Loading your progress,please wait...");
        loading.setBounds(180,150,250,20);
        loading.setForeground(Color.BLUE);
        loading.setFont(new Font("Raleway",Font.BOLD,13));
        add(loading);
        
        JLabel name = new JLabel("Welcome,"+ username + " !");
        name.setBounds(30,300,250,25);
        name.setForeground(Color.RED);
        name.setFont(new Font("Raleway",Font.BOLD,18));
        add(name);
        
        thread.start();
        
        setVisible(true);
    }
    
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int maxValue = progress.getMaximum();
                int curr = progress.getValue();
                
                if(curr < maxValue){
                    progress.setValue(curr + 1);
                }
                else{
                    setVisible(false);
                }
                Thread.sleep(30);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
       new Loading("");
    }
}
