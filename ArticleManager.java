import java.util.ArrayList;

public class ArticleManager {
    private ArrayList<Article> articles = new ArrayList<>();
    private int nextId = 1;

    public void addArticle(Article article) {
        articles.add(article);
    }

    public Article getArticleById(int id) {
        for (Article a : articles) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public void listArticles() {
        for (Article a : articles) {
            System.out.println(a.toString());
            System.out.println();
        }
    }

    public int getNextId() {
        return nextId++;
    }
}
