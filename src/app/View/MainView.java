package app.View;

public class MainView {

    public String Menu(){
        return """
                What to do?
                1 - Run Traffic Light
                2 - Exit
                """;
    }

    public String Exit(){
        return "Good bye.";
    }

    public String Incorrect(){
        return "Incorrect answer.";
    }
}
