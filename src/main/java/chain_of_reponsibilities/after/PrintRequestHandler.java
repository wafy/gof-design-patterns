package chain_of_reponsibilities.after;

import chain_of_reponsibilities.bofore.Request;

public class PrintRequestHandler extends RequestHandler{

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);

    }
}
