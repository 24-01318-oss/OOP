public class ClickBaitArticle extends Article {

    public ClickBaitArticle(int id, String title, String author, String body) {
        super(id, title, author, body);
    }

    @Override
    public String analyze() {
        return "Clickbait Article: The headline or content exaggerates events to attract attention.";
    }
}
