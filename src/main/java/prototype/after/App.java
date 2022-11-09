package prototype.after;


public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        GithubRepository repository = new GithubRepository();
        repository.setUser("wafy");
        repository.setName("gof-design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("test issue");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println("clone.getUrl() = " + clone.getUrl());

        System.out.println("clone == githubIssue = " + (clone != githubIssue));
        System.out.println("(clone.equals(githubIssue)) = " + (clone.equals(githubIssue)));
        System.out.println("(clone.getClass() == githubIssue.getClass()) = " + (clone.getClass() == githubIssue.getClass()));
        // Shallow copy
        // GithubIssue가 참조하는 GithubRepository는 레퍼런스가 같고 자바에서 기본적으로 shallow copy를 지원한다.
        System.out.println("(clone.getRepository() == githubIssue.getRepository()) = " + (clone.getRepository() == githubIssue.getRepository()));


    }
}
