package prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student 호순이 = new Student("호순이");
        Student 구름이 = new Student("구름이");
//        ArrayList<Student> students = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(호순이);
        students.add(구름이);

        // 이렇게 사용은 않함
        // ArrayList<Student> clone = (ArrayList<Student>) students.clone();
        //리스트는 clone을 지원하지 않는다.
        //아래 방법을 일반적으로 많이 사용한다.
        List<Student> clone = new ArrayList<>(students);
        System.out.println("clone = " + clone);
    }
}
