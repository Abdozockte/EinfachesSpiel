import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class GewinnView extends JFrame {
    JFrame frame = new JFrame("Spiel");
    JPanel panel = new JPanel();
    public GewinnView(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setVisible(true);
        frame.add(panel);
    }
    public static void main(String[] args){
        new GewinnView();
    }
}