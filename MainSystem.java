import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArticleManager manager = new ArticleManager();

        while (true) {
            System.out.println("\n=== Fake News Filter System ===");
            System.out.println("1. Submit article");
            System.out.println("2. View all articles");
            System.out.println("3. Analyze article by ID");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                int id = manager.getNextId();

                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Body: ");
                String body = sc.nextLine();

                String result = FakeNewsFilter.classify(body + " " + title);

                Article newArticle;

                switch (result) {
                    case "clickbait":
                        newArticle = new ClickBaitArticle(id, title, author, body);
                        break;
                    case "misleading":
                        newArticle = new MisleadingArticle(id, title, author, body);
                        break;
                    case "satire":
                        newArticle = new SatireArticle(id, title, author, body);
                        break;
                    default:
                        newArticle = new MisleadingArticle(id, title, author, body); // fallback
                        break;
                }

                manager.addArticle(newArticle);
                System.out.println("Article submitted with ID: " + id);
            }

            else if (choice == 2) {
                manager.listArticles();
            }

            else if (choice == 3) {
                System.out.print("Enter article ID: ");
                int id = sc.nextInt();

                Article a = manager.getArticleById(id);

                if (a != null) {
                    System.out.println("\nContent: " + a.getBody());
                    System.out.println("Analysis: " + a.analyze());
                } else {
                    System.out.println("Article not found.");
                }
            }

            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
        }

        sc.close();
    }
}
