package observer.before;

public class ChatServer {

    private String subject;
    private String message;

    public String getMessage(String subject) {
        return this.subject;
    }

    public void add(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }
}
