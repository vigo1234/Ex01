import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class ui extends JFrame{
    
    ui(){
        setFrame();
    }

    private void setFrame(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLocationRelativeTo(null);
    }
     public static void main(String[] args) {
        new ui().setVisible(true);
    }
}
