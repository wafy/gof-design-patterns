package chain_of_reponsibilities.bofore;

public class LoggingRequestHandler extends RequestHandler {

    public void handler(Request request) {
        System.out.println("로그");
        super.handler(request);
    }
}
