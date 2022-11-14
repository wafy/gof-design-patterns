package bridge.before;

public class KDA아리 implements Champion {

    @Override
    public void move() {
        System.out.println("아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("아리 Q");
    }

    @Override
    public void skillE() {
        System.out.println("아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("아리 R");

    }
}
