package singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = context.getBean("hello", String.class);
        String hello2 = context.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }
}
