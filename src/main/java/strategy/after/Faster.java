package strategy.after;

public class Faster implements Speed {
    @Override
    public void blueLight() {
        System.out.println("무궁화꽅이");
    }

    @Override
    public void redLight() {
        System.out.println("피었습니다.");
    }
}
