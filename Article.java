public abstract class Article {
    protected int id;
    protected String title;
    protected String author;
    protected String body;

    public Article(int id, String title, String author, String body) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public int getId() { return id; }
    public String getBody() { return body; }
    public String getTitle() { return title; }

    public abstract String analyze();

    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author;
    }
}
