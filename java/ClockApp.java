import java.io.IOException;
import java.time.LocalTime;

import java.util.Scanner;

class Clock {

    public void displayTime() {

        LocalTime now = LocalTime.now();

        System.out.print(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond() + "\r");

    }

}

public class ClockApp {
    public static void main(String[] args) {

        Clock clock = new Clock();

        new Thread(() -> {

            try {
                while (System.in.available() == 0) {

                    clock.displayTime();

                    Thread.sleep(1000);
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Scanner(System.in).nextLine();
    }

}
