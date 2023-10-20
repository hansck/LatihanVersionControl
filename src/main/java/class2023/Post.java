package Model;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Post {
    private String postId;
    private ContentState  status;
    private LocalDateTime timeUpload;
    private ContentType postType;
    private ArrayList<Comment> comment = new ArrayList<>();   
    
    public Post(String postId, ContentState status, LocalDateTime timeUpload, ContentType postType) {
        this.postId = postId;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public ContentState getStatus() {
        return status;
    }

    public void setStatus(ContentState status) {
        this.status = status;
    }

    public LocalDateTime getTimeUpload() {
        return timeUpload;
    }

    public void setTimeUpload(LocalDateTime timeUpload) {
        this.timeUpload = timeUpload;
    }

    public ContentType getPostType() {
        return postType;
    }

    public void setPostType(ContentType postType) {
        this.postType = postType;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }        
}
