package prakpbo.uts;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String username;
    private String password;
    private String bio;
    private List<Post> post;

    public User(String userId, String username, String password, String bio) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.bio = bio;
    }

    public String getUserId() {
        return userId;
    }
    public void addPost(Post post) {
        post.add(post);
    }
    public List<Post> showUserPost() {
        System.out.println("Menampilkan semua post dari user " + username);
        return post;
    }

    public void changePostState(String postId, ContentState newState) {
        System.out.println("Mengubah status post " + postId + " menjadi " + newState);
    }

    public void showUserBestPost() {
        System.out.println("Menampilkan post terbaik dari user " + username);
    }
}
