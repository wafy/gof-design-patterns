package proxy.after;

import proxy.before.GameService;

public class GameServiceProxy extends GameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);


    }
}
