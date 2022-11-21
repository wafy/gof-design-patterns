package template.after;

public class Plus2 implements Operator {
    @Override
    public int getResult(int result, int line) {
        return result += line;
    }
}
