package factorymethod;

public class ClientV2 {

    public static void main(String[] args) {
        ClientV2 client = new ClientV2();
        client.print(new WhiteShipFactoryV2(), "whiteShip", "aa@aa.com");
        client.print(new BlackShipFactoryV2(), "blackShip", "bb@aa.com");


    }

    private void print(ShipFactoryV2 shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
