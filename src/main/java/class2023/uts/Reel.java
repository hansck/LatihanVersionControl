package prakpbo.uts;

public class Reel extends Post {
    private int playCount;
    private int duration;

    public Reel(String postId, String status, ContentType postType, int timeLapse, int playCount, int duration) {
        super(postId, status, postType, timeLapse);
        this.playCount = 0;
        this.duration = duration;
    }

    public int getPlayCount() {
        return playCount;
    }

    public int getDuration() {
        return duration;
    }

    public Reel createReel(String content, int duration) {
        System.out.println("Reel baru : " + content + " durasi: " + duration + " dibuat.");
        return null;
    }

    public void deleteReel(String reelId) {
        System.out.println("Reel ID : " + reelId + " dihapus.");
    }

    public void play() {
        this.playCount++;
        System.out.println("Reel diputar " + this.playCount + " kali.");
    }
}
