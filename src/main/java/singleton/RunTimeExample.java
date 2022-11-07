package singleton;

/**
 * 자바에서 사용하는 싱클톤
 */
public class RunTimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
