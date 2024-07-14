package tech.investia.stock.models;

public class CurrentTradingPeriod {
    private Post pre;
    private Post regular;
    private Post post;

    public Post getPre() { return pre; }
    public void setPre(Post value) { this.pre = value; }

    public Post getRegular() { return regular; }
    public void setRegular(Post value) { this.regular = value; }

    public Post getPost() { return post; }
    public void setPost(Post value) { this.post = value; }
}
