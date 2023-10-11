
import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.SwingUtilities;

public class HelloWorldGUI {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("Hello, World!");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(300, 100);

            frame.add(new JLabel("Hello, World!", JLabel.CENTER));

            frame.setVisible(true);

        });

    }

}