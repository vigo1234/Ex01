import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ui extends JFrame{
    ui(){
        setFrame();
    }
    private void setFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(500,500);
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        new ui().setVisible(true);
    }
}
