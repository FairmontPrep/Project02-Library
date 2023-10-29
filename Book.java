public class Book {
    private String title;
    private String author;
    private String genre;
    private int numPages;
    private int numOfCopies;

    /*
     * Constructor to create a new Book object
     */
    public Book(String title, String author, String genre, int numPages, int numOfCopies) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numPages = numPages;
        this.numOfCopies = numOfCopies;
    }

    /*
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }
}
