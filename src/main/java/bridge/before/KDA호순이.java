package bridge.before;

public class KDA호순이 implements Champion {
    @Override
    public void move() {
        System.out.println("호순이 move");
    }

    @Override
    public void skillQ() {
        System.out.println("호순이 Q");
    }

    @Override
    public void skillE() {
        System.out.println("호순이 E");

    }

    @Override
    public void skillR() {
        System.out.println("호순이 R");
    }
}
