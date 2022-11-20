package state.after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("호순이");
        Student student2 = new Student("구름이");
        student2.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(student2);

        System.out.println("onlineCourse.getStatus() = " + onlineCourse.getState());
        System.out.println("onlineCourse = " + onlineCourse.getReviews());
        System.out.println("onlineCourse = " + onlineCourse.getStudents());
    }
}
