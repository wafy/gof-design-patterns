package factorymethod;

public class WhiteShipFactoryV2 extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
