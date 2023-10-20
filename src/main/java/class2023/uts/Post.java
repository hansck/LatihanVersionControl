package prakpbo.uts;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private String postId;
    private String status;
    private ContentType postType;
    private int timeLapse;

    public Post(String postId, String status, ContentType postType, int timeLapse) {
        this.postId = postId;
        this.status = status;
        this.postType = postType;
        this.timeLapse = timeLapse;
    }

    public Post createPost(String content, ContentType contentType) {
        return null;
    }

    public void deletePost(String postId) {
    }

    public void showPost(String postId) {
        System.out.println("detail post dengan ID " + postId);
    }

    public void add(Post post) {
    }
}
