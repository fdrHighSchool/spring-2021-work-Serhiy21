import java.awt.*;
import javax.swing.*;
  
public class ellipse extends JApplet {
  
    public void init()
    {
        
        setSize(400, 400);
  
        repaint();
    }
  
    
    public void paint(Graphics g)
    {
        
        g.setColor(Color.red);
  
        
        g.drawOval(100, 100, 150, 100);
    }
}
