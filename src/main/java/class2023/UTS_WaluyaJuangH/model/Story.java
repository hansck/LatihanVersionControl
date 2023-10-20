package class2023.UTS_WaluyaJuangH.model;

public class Story extends Post {
    private int duration;
    private int views;
    public Story(int duration, int views) {
        this.duration = duration;
        this.views = views;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
}
