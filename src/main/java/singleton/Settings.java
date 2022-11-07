package singleton;

public class Settings {

    private static final Settings INSTANCE = new Settings();

    /**
     * new를 사용해서 외부에서 객체를 생성하지 못한다.
     */
    private Settings() {
    }

    /**
     * 두가지 쓰레드가 동시에 if문을 접근하면 쓰레드가 두개 생성되는 문제점.
     * 1. synchronized : 동기화 메커니즘 때문에 lock 발생 때문에 성능에 문제가 발생한다.
     * 2. 이른 초기화(eager initialization) 사용하기
     * - 미리 만드는게 단점
     * - 객체 생성단계가 오래 걸리는데 만들어 놓고 사용하지 않는다면 비효율
     */
    public static Settings getInstance() {
        return INSTANCE;
    }
}
