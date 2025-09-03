import java.awt.*;
import javax.swing.*;

class MyJComponent extends JComponent {
    private Image image;

    public MyJComponent() {
        // Load the image once during initialization
        image = new ImageIcon("E:/spiderman.jpg").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call super first
        Graphics2D g2 = (Graphics2D) g;

        // Draw the image centered in the component
        int x = (getWidth() - image.getWidth(this)) / 2;
        int y = (getHeight() - image.getHeight(this)) / 2;
        g2.drawImage(image, x, y, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 600);
    }
}

public class spiderman extends JFrame {
    public spiderman() {
        EventQueue.invokeLater(() -> {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            add(new MyJComponent());
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        });
    }

    public static void main(String[] args) {
        new spiderman();
    }
}
