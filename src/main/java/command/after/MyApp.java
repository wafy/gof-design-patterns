package command.after;

import command.before.Light;

public class MyApp {

    private Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new LightOffCommand(new Light()));
        myApp.press();
    }
}
