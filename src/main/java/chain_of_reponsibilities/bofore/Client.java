package chain_of_reponsibilities.bofore;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler();
        //단일 책임은 지키지만 클라이언트가 직접 선택되어야한다.
        //책임이 추가된다면 로그와 관련된 핸들러를 만들어야 한다.
        requestHandler.handler(request);
    }
}
