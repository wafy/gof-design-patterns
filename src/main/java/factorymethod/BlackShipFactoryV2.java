package factorymethod;

public class BlackShipFactoryV2 extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }

}
