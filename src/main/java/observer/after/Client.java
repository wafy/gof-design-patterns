package observer.after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User user1 = new User("호순이");
        User user2 = new User("구름이");

        chatServer.register("고양이", user1);
        chatServer.register("멍멍이", user2);

        chatServer.register("고양이", user1);

        chatServer.sendMessage(user1,"고양이", "야옹야옹");
        chatServer.sendMessage(user2 ,"멍멍이", "왈왈");
    }
}
