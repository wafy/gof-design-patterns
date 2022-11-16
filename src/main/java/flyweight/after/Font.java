package flyweight.after;

/**
 * 자주 변하지 않는 것들은 불변객체로 만들어야한다.
 */
public final class Font {

    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
