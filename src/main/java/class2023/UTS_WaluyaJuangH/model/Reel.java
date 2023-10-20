package class2023.UTS_WaluyaJuangH.model;

public class Reel extends Post {
    private int duration;
    private int playedCount;

    public Reel(int duration, int playedCount) {
        this.duration = duration;
        this.playedCount = playedCount;
    }
    
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getPlayedCount() {
        return playedCount;
    }
    public void setPlayedCount(int playedCount) {
        this.playedCount = playedCount;
    }
}
