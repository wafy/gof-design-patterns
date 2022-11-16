package proxy.after;

public class Client {

    public static void main(String[] args) {
//        GameServiceProxy gameService = new GameServiceProxy();
//        gameService.startGame();

        GameService gameService = new GameServiceProxy2();
        gameService.startGame();
    }
}
