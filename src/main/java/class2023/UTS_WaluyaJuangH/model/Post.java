package class2023.UTS_WaluyaJuangH.model;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Post {
    private String postID;
    private ContentStateEnum status;
    private Timestamp timeUpload;
    private ContentTypeEnum postType;
    private ArrayList<Comment> comments;

    public Post(String postID, ContentStateEnum status, Timestamp timeUpload, ContentTypeEnum postType, ArrayList<Comment> comments) {
        this.postID = postID;
        this.status = status;
        this.timeUpload = timeUpload;
        this.postType = postType;
        this.comments = comments;
    }

    public String getPostID() {
        return postID;
    }
    public void setPostID(String postID) {
        this.postID = postID;
    }
    public ContentStateEnum getStatus() {
        return status;
    }
    public void setStatus(ContentStateEnum status) {
        this.status = status;
    }
    public Timestamp getTimeUpload() {
        return timeUpload;
    }
    public void setTimeUpload(Timestamp timeUpload) {
        this.timeUpload = timeUpload;
    }
    public ContentTypeEnum getPostType() {
        return postType;
    }
    public void setPostType(ContentTypeEnum postType) {
        this.postType = postType;
    }
    public ArrayList<Comment> getComments() {
        return comments;
    }
}

