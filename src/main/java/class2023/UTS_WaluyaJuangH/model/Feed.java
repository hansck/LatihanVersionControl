package class2023.UTS_WaluyaJuangH.model;

public class Feed extends Post {
    private String caption;
    private int likes;
    public Feed(String caption, int likes) {
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
