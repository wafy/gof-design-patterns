package interator.after;

import interator.before.Post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    private List<Post> posts = new ArrayList<>();

    public void addPost(String content) {
        posts.add(new Post(content, LocalDateTime.now()));
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }


}
