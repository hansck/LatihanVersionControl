package prakpbo.uts;

public class Feed extends Post {
    private String caption;
    private int like;

    public Feed(String postId, String status, ContentType postType, int timeLapse, String caption, int like) {
        super(postId, status, postType, timeLapse);
        this.caption = caption;
        this.like = 0;
    }

    public String getCaption() {
        return caption;
    }

    public int getLike() {
        return like;
    }

    public void addToFeed(String postId) {
        System.out.println("Post ID : " + postId + " ditambahkan.");
    }

    public void removeFromFeed(String postId) {
        System.out.println("Post ID " + postId + " dihapus.");
    }

    public void like() {
        this.like++;
        System.out.println("Post memiliki " + this.like + " likes.");
    }
}
