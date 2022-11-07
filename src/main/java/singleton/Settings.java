package singleton;

public class Settings {

    private static Settings instance;

    /**
     * new를 사용해서 외부에서 객체를 생성하지 못한다.
     */
    private Settings() {
    }

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
