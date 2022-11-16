package chain_of_reponsibilities.bofore;

public class RequestHandler {
    private Request request;


    public void handler(Request request) {

//        //단일 책임원칙 위배
//        System.out.println("인증이 되었나?");
//        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");

        System.out.println("request = " + request.getBody());
    }
}
