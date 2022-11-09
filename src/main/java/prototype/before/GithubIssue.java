package prototype.before;

import lombok.Data;

@Data
public class GithubIssue {

    private int id;
    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return null;
    }
}

