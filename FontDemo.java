import java.awt.*;
import java.io.*;
import javax.swing.*;

class MyJComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Draw with default Serif font
        Font serifFont = new Font("Serif", Font.PLAIN, 24);
        g2d.setColor(Color.BLACK);
        g2d.setFont(serifFont);
        g2d.drawString("Serif Plain 24", 10, 40);

        // Try loading custom font
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("E:\\Fonts\\BLKCHCRY.ttf")).deriveFont(24f);
            g2d.setFont(customFont);
            g2d.setColor(Color.BLUE);
            g2d.drawString("Custom Font", 10, 80);
        } catch (FontFormatException | IOException e) {
            g2d.setColor(Color.RED);
            g2d.drawString("Font load failed", 10, 80);
            e.printStackTrace();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 150);
    }
}

public class FontDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Font Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new MyJComponent());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
