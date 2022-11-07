package factorymethod;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "aa@ddd.com");
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "bb@aaa.com");
        System.out.println("blackShip = " + blackShip);
    }
}
