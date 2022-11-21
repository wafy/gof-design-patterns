package template.after;

public class Client {

    public static void main(String[] args) {

        //템플릿 패턴
        FileProcessor fileProcessor = new Plus("number.txt");
        FileProcessor fileProcessor1 = new Multiply("number.txt");
        int result = fileProcessor.process();
        int result1 = fileProcessor1.process();
        System.out.println("result = " + result);
        System.out.println("result1 = " + result1);

        //템플릿 콜백 패턴
        FileProcessor2 fileProcessor2 = new FileProcessor2("number.txt");
        int result3 = fileProcessor2.process((result2, number) -> result2 += number);
        System.out.println("result3 = " + result3);

    }
}
