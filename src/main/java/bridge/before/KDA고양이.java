package bridge.before;

public class KDA고양이 implements Champion {
    @Override
    public void move() {
        System.out.println("KDA고양이 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KKDA고양이DA Q");
    }

    @Override
    public void skillE() {
        System.out.println("KDA고양이 E");
    }

    @Override
    public void skillR() {
        System.out.println("KDA고양이 R");
    }
}
