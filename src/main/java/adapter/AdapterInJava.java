package adapter;

import java.io.*;
import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {

        // collection
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);

        // lo
        try (InputStream is = new FileInputStream("input.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
