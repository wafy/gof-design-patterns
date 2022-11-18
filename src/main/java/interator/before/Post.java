package interator.before;

import java.time.LocalDateTime;

public class Post {
    private String title;
    private LocalDateTime createdDateTime;

    public Post(String title, LocalDateTime createdDateTime) {
        this.title = title;
        this.createdDateTime = createdDateTime;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
}
