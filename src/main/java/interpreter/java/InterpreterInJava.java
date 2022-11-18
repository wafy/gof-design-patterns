package interpreter.java;

import java.util.regex.Pattern;

public class InterpreterInJava {

    public static void main(String[] args) {
        System.out.println(Pattern.matches(".pr...", "spring"));
        System.out.println(Pattern.matches("[a-z]{6}", "spring"));
        System.out.println(Pattern.matches("호순이[a-z]{4}[0-9]{4}", "호순이abcd2021"));
    }
}
