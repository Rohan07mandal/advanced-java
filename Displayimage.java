import java.awt.*;
import javax.swing.*;

class MyJComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Image img = new ImageIcon("E:/submit.jpg").getImage();
        g2.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }
}

public class Displayimage extends JFrame {
    public Displayimage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyJComponent());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Displayimage());
    }
}
