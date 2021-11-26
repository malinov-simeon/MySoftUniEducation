package Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main_Article {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(",\\s+");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String criteria = scanner.nextLine();

        switch (criteria){
            case "title":
                articles.sort(Comparator.comparing(article -> article.getTitle()));
                break;
            case "content":
                articles.sort(Comparator.comparing(article -> article.getContent()));
                break;
            case "author":
                articles.sort(Comparator.comparing(article -> article.getAuthor()));
                break;
        }

        articles.forEach(article -> System.out.println(article.toString()));
    }
    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }

}
