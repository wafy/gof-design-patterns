package chain_of_reponsibilities.after;

import chain_of_reponsibilities.bofore.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅 처리");
        super.handle(request);
    }
}
