import java.awt.*; 
import javax.swing.*; 
class MyJComponent extends JComponent { 
@Override 
protected void paintComponent(Graphics g) { 
// Cast Graphics to Graphics2D  
  Graphics2D g2d = (Graphics2D) g; 
 
        // Set the drawing color 
        g2d.setColor(Color.BLUE); 
 
        // Draw a rectangle 
        g2d.fillRect(10, 10, 100, 50); 
 
        // Draw an oval 
        g2d.setColor(Color.RED); 
        g2d.fillOval(130, 10, 100, 50); 
 
        // Draw a line 
        g2d.setColor(Color.GREEN); 
        g2d.drawLine(10, 80, 240, 80); 
 
        // Draw a rounded rectangle 
        g2d.setColor(Color.MAGENTA); 
        g2d.fillRoundRect(10, 100, 100, 50, 20, 20); 
 
        // Draw an arc 
        g2d.setColor(Color.ORANGE); 
        g2d.fillArc(130, 100, 100, 50, 0, 180); 
 
        // Draw a polygon 
        int[] xPoints = { 10, 30, 50}; 
        int[] yPoints = { 180, 160, 180}; 
        g2d.setColor(Color.CYAN); 
        g2d.fillPolygon(xPoints, yPoints, xPoints.length); 
         
    } 
 
    @Override 
    public Dimension getPreferredSize() { 
        return new Dimension(400, 400);  
        // Set preferred size of the component 
    } 
 
} 
 
public class MyJFrame extends JFrame { 
    public MyJFrame() { 
 EventQueue.invokeLater(()->{ 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         
        MyJComponent mComponent = new MyJComponent(); 
        add(mComponent); 
         
        pack(); 
        setLocationRelativeTo(null); 
        setVisible(true); 
 }); 
    } 
    public static void main(String[] args){ 
        new MyJFrame(); 
    }     
}