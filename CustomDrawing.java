import java.awt.*;
import javax.swing.*;

class MyJComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Solid blue rectangle
        g2d.setColor(Color.BLUE);
        g2d.fillRect(10, 10, 100, 50);

        // Purple rectangle
        Color cc1 = new Color(128, 0, 128);
        g2d.setColor(cc1);
        g2d.fillRect(10, 70, 100, 50);

        // Semi-transparent green oval
        Color cc2 = new Color(0, 128, 0, 50);
        g2d.setColor(cc2);
        g2d.fillOval(130, 10, 100, 50);
    }
}

public class CustomDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        MyJComponent component = new MyJComponent();
        frame.add(component);

        frame.setVisible(true);
    }
}
