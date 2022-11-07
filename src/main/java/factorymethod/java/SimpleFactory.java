package factorymethod.java;

import factorymethod.BlackShip;
import factorymethod.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteShip")) {
            return new WhiteShip();
        } else if (name.equals("blackShip")) {
            return new BlackShip();
        }
        throw new IllegalArgumentException();
    }
}
