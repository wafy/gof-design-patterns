package prototype.before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("wafy");
        repository.setName("gof-design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("test issue");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

//      GithubIssue clone = githubIssue.clone();

        // TODO: 2022/11/09 clone ! = githubIssue     : true 레퍼런스는 같고
        // TODO: 2022/11/09 clone.equals(githubIssue) : true 값은 같다.



    }

}
