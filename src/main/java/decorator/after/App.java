package decorator.after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enabledTrimming) {
            commentService = new TrimingCommentDecorator(commentService);
        }
        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("하하하하하하하 호호호호호... ");
        client.writeComment("http://afsdfsdf.");
    }
}
