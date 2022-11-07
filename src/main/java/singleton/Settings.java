package singleton;

public class Settings {

    public static class inner {
        private static final Settings INSTANCE = new Settings();
    }

    private Settings() {

    }

    public static Settings getInstance() {
        return inner.INSTANCE;
    }
}
