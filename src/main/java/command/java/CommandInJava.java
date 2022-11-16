package command.java;

import command.before.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(light::off);
        executorService.submit(light::on);
        executorService.shutdown();
    }
}
