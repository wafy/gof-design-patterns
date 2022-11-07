package singleton;

public class Settings {

    private static Settings instance;

    /**
     * new를 사용해서 외부에서 객체를 생성하지 못한다.
     */
    private Settings() {
    }

    /**
     * 두가지 쓰레드가 동시에 if문을 접근하면 쓰레드가 두개 생성되는 문제점.
     * 1.synchronized : 동기화 메커니즘 때문에 lock발생때문에 성능에 문제가 발생한다.
     */
    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
