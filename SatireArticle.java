public class SatireArticle extends Article {

    public SatireArticle(int id, String title, String author, String body) {
        super(id, title, author, body);
    }

    @Override
    public String analyze() {
        return "Satire Article: Uses humor, exaggeration, or irony for entertainment.";
    }
}
