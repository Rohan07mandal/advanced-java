import javax.swing.JFrame;

public class MyJFrames extends JFrame {
    public MyJFrames() {
        setTitle("My JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyJFrames();
    }
}
