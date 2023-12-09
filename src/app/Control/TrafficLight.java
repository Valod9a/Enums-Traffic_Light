package app.Control;

import app.Model.Colors;
import app.View.MainView;
import app.util.ScanAnswer;

public class TrafficLight {

    MainView massages = new MainView();
    ScanAnswer ScAnswer = new ScanAnswer();

    public void Runner(){
        System.out.println(massages.Menu());
        ScAnswer.setAnswer();

        switch (ScAnswer.getAnswer()) {
            case 1 -> {
                System.out.println(Colors.RED.getDescription());
                Timer();
                System.out.println(Colors.YELLOW.getDescription());
                Timer();
                System.out.println(Colors.GREEN.getDescription());
            }
            case 2 -> {
                System.out.println(massages.Exit());
                System.exit(0);
            }
            default -> {
                System.out.println(massages.Incorrect());
                System.exit(0);
            }
        }
    }

    public static void Timer(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}