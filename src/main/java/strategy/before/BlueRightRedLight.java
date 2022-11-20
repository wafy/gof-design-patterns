package strategy.before;

public class BlueRightRedLight {

    private int speed;

    public BlueRightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("무 궁 화    꽃   이");
        } else if (speed == 2) {
            System.out.println("무궁화꽅이");
        } else {
            System.out.println("무광꼬치");
        }
    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("피 었 습 니 다.");
        } else if (speed == 2) {
            System.out.println("피었습니다.");
        } else {
            System.out.println("피어씀다");
        }
    }
}
