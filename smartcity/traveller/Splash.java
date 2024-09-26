
package smartcity.traveller;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    
    public Splash(){
        Thread thread;
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i1 = i.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel j = new JLabel(i2);
        add(j);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }
    
    public void run(){
        try{
            Thread.sleep(6000);
            setVisible(false);
        }
        catch(Exception e){
        }
    }
    public static void main(String[] args) {
        Splash s = new Splash();
        int x = 1;
        for(int i=1;i<500;x+=7,i+=6){
            s.setSize(x + i, i);
            s.setLocation(650 - (x+i)/2,350 - i/2);
            try{
            Thread.sleep(10);
            }
            catch(Exception e){
            
            }
        }
    }
    
}
