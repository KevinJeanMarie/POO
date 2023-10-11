import javax.swing.*;

import java.awt.*;

import java.util.Calendar;

class ClockPanel extends JPanel {

    @Override

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Calendar now = Calendar.getInstance();

        int seconds = now.get(Calendar.SECOND);

        int minutes = now.get(Calendar.MINUTE);

        int hours = now.get(Calendar.HOUR);

        // Draw clock circle

        g.drawOval(10, 10, 180, 180);

        // Draw date

        g.drawString(now.get(Calendar.DATE) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.YEAR), 70,
                100);

        // Calculate angles for hands

        double secondAngle = Math.toRadians(6 * seconds);

        double minuteAngle = Math.toRadians(6 * minutes);

        double hourAngle = Math.toRadians(30 * hours);

        // Draw hands

        g.drawLine(100, 100, 100 + (int) (80 * Math.sin(secondAngle)), 100 - (int) (80 * Math.cos(secondAngle)));

        g.drawLine(100, 100, 100 + (int) (70 * Math.sin(minuteAngle)), 100 - (int) (70 * Math.cos(minuteAngle)));

        g.drawLine(100, 100, 100 + (int) (50 * Math.sin(hourAngle)), 100 - (int) (50 * Math.cos(hourAngle)));

    }

}

public class ClockFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Clock");

        ClockPanel clockPanel = new ClockPanel();

        frame.add(clockPanel);

        frame.setSize(220, 240);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        new Timer(1000, e -> clockPanel.repaint()).start();

    }

}