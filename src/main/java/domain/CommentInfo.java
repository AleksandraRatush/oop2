package domain;

public class CommentInfo {
    private int count;
    private boolean allowPost;
    private boolean groupsCanPost;
    private boolean allowClose;
    private boolean allowOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isAllowPost() {
        return allowPost;
    }

    public void setAllowPost(boolean allowPost) {
        this.allowPost = allowPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isAllowClose() {
        return allowClose;
    }

    public void setAllowClose(boolean allowClose) {
        this.allowClose = allowClose;
    }

    public boolean isAllowOpen() {
        return allowOpen;
    }

    public void setAllowOpen(boolean allowOpen) {
        this.allowOpen = allowOpen;
    }
}
