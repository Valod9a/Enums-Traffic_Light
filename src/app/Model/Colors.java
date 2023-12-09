package app.Model;

public enum Colors {

    RED("Stop, it`s RED!"),

    YELLOW("It`s YELLOW, Get Ready."),

    GREEN("It`s GREEN, GO!");

    private final String description;

    Colors(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
