package Model;

import java.time.LocalDateTime;

public class Feed extends Post{
    private String caption;
    private int likes;
    
    public Feed(String postId, ContentState status, LocalDateTime timeUpload, ContentType postType, String caption,
            int likes) {
        super(postId, status, timeUpload, postType);
        this.caption = caption;
        this.likes = likes;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

    
}
