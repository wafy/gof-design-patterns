package strategy.before;

public class Client {

    public static void main(String[] args) {
        BlueRightRedLight blueRightRedLight = new BlueRightRedLight(1);
        blueRightRedLight.blueLight();
        blueRightRedLight.redLight();
    }
}
