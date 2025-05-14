public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitleInfo() {
        return "Title: " + title;
    }

    public static void main(String[] args) {
        Book b = new Book("Boobby Hobbit");
        System.out.println(b.getTitleInfo());
    }
}
