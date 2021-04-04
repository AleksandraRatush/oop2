package domain;

public class LikesInfo {

    private int count;
    private boolean userLikes;
    private boolean allowLike;
    private boolean allowPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isAllowLike() {
        return allowLike;
    }

    public void setAllowLike(boolean allowLike) {
        this.allowLike = allowLike;
    }

    public boolean isAllowPublish() {
        return allowPublish;
    }

    public void setAllowPublish(boolean allowPublish) {
        this.allowPublish = allowPublish;
    }
}
