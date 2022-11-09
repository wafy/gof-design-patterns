package prototype.java;

import org.modelmapper.ModelMapper;
import prototype.after.GithubIssue;
import prototype.after.GithubRepository;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository= new GithubRepository();
        repository.setUser("wafy");
        repository.setName("gof-design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("구름아 보고싶다.");

        // TODO: 2022/11/09 ModelMapper
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println("githubIssueData = " + githubIssueData);
    }
}
