import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]) {


        JFrame frame = new JFrame("Restaurant Manager");
        frame.setContentPane(new Welcome().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(900, 800));
        frame.setMinimumSize(new Dimension(200, 800));
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible(true);

    }

}

