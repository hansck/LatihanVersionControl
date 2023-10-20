package prakpbo.uts;

public class Comment {
    private String commentId;
    private String text;
    private ContentState status;

    public Comment(String commentId, String text, ContentState status) {
        this.commentId = commentId;
        this.text = text;
        this.status = status;
    }
    public void writeComment(String text) {
        System.out.println("Menulis komentar: " + text);
    }

    public void deleteComment(String commentId) {
        System.out.println("Menghapus komentar dengan ID " + commentId);
    }
}
