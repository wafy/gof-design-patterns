package observer.before;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User(chatServer);
        user1.sendMessage("디자인패턴", "이번엔 옵저버 패턴입니다.");
        user1.sendMessage("호순이", "잘잔다.");

        User user2 = new User(chatServer);
        System.out.println("user2.getMessage() = " + user2.getMessage("디자인패턴"));

        user1.sendMessage("디자인 패턴", "에제 코드 보는 중....");
        System.out.println("user2 = " + user2.getMessage("디자인 패턴"));
    }
}
