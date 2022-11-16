package chain_of_reponsibilities.after;

import chain_of_reponsibilities.bofore.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증처리");
        super.handle(request);
    }
}
