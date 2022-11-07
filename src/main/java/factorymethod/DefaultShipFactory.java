package factorymethod;

public abstract class DefaultShipFactory implements ShipFactoryV2 {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
