package class2023.UTS_WaluyaJuangH.model;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String username;
    private String password;
    private String bio;
    private List<Post> posts;
    

    public User(String userID, String username, String password, String bio) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.posts = new ArrayList<>();
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public List<Post> getPosts() {
        return posts;
    }
    public void addPost(Post post) {
        this.posts.add(post);
    }
}