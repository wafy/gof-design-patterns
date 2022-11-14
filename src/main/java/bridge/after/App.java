package bridge.after;

import bridge.before.Champion;

public class App {

    public static void main(String[] args) {
        Champion 호순 = new 호순(new Cat());
        호순.skillQ();
        호순.skillR();

        Champion 구름 = new 구름(new Dog());
        구름.skillQ();
        구름.skillR();
    }
}
