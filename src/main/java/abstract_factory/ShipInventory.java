package abstract_factory;


import factorymethod.Ship;
import factorymethod.ShipFactoryV2;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactoryV2 shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());

    }
}
