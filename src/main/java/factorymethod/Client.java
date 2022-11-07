package factorymethod;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "aa@aa.com");
        client.print(new BlackShipFactory(), "blackShip", "bb@aa.com");

//        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "aa@ddd.com");
//        System.out.println("whiteShip = " + whiteShip);
//
//        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "bb@aaa.com");
//        System.out.println("blackShip = " + blackShip);
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
