package builder.java;

import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("호순이")
                .append("구름이")
                .toString();
        System.out.println(result);

        Stream<String> names = Stream.<String>builder().add("호순이").add("구름이").build();
        names.forEach(System.out::println);
    }
}
