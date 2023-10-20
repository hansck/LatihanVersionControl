package prakpbo.uts;

public class Story extends Post {
    private int views;
    private int duration;

    public Story(String postId, String status, ContentType postType, int timeLapse, int views, int duration) {
        super(postId, status, postType, timeLapse);
        this.views = 0;
        this.duration = duration;
    }

    public int getViews() {
        return views;
    }

    public int getDuration() {
        return duration;
    }

    public Story createStory(String content, int duration) {
        System.out.println("Story baru : " + content + " durasi: " + duration + " dibuat.");
        return null;
    }

    public void deleteStory(String storyId) {
        System.out.println("Story ID " + storyId + " dihapus.");
    }

    public void view() {
        this.views++;
        System.out.println("Story dilihat " + this.views + " kali.");
    }
}
