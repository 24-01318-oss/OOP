public class MisleadingArticle extends Article {

    public MisleadingArticle(int id, String title, String author, String body) {
        super(id, title, author, body);
    }

    @Override
    public String analyze() {
        return "Misleading Article: The content uses vague, deceptive, or partially false information.";
    }
}
