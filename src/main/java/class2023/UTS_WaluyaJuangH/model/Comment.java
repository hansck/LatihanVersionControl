package class2023.UTS_WaluyaJuangH.model;

public class Comment {
    private String commentID;
    private String text;
    private ContentStateEnum status;

    public Comment(String commentID, String text, ContentStateEnum status) {
        this.commentID = commentID;
        this.text = text;
        this.status = status;
    }

    public String getCommentID() {
        return commentID;
    }

    public void setCommentID(String commentID) {
        this.commentID = commentID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ContentStateEnum getStatus() {
        return status;
    }

    public void setStatus(ContentStateEnum status) {
        this.status = status;
    }
}
