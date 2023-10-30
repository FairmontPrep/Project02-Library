package src.main.java;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<Book> database;

    /*
     * Constructs a new library of books
     */
    public Library() {
        database = new ArrayList<>(Arrays.asList(
        new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 281, 3),
        new Book("1984", "George Orwell", "Dystopian", 328, 2),
        new Book("Pride and Prejudice", "Jane Austen", "Romance", 279, 1),
        new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 180, 5),
        new Book("Animal Farm", "George Orwell", "Political Satire", 112, 8),
        new Book("Brave New World", "Aldous Huxley", "Science Fiction", 288, 4),
        new Book("The Catcher in the Rye", "J.D. Salinger", "Coming-of-Age", 224, 2),
        new Book("Lord of the Flies", "William Golding", "Literary Fiction", 224, 6),
        new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 310, 12),
        new Book("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", 1178, 5),
        new Book("War and Peace", "Leo Tolstoy", "Historical Fiction", 1392, 8),
        new Book("Crime and Punishment", "Fyodor Dostoevsky", "Psychological Fiction", 551, 11),
        new Book("The Brothers Karamazov", "Fyodor Dostoevsky", "Philosophical Fiction", 796, 1),
        new Book("Moby-Dick", "Herman Melville", "Adventure", 585, 2),
        new Book("The Adventures of Huckleberry Finn", "Mark Twain", "Classic", 366, 6),
        new Book("Jane Eyre", "Charlotte Brontë", "Gothic Fiction", 532, 8),
        new Book("Frankenstein", "Mary Shelley", "Gothic Horror", 280, 4),
        new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Magic Realism", 417, 1),
        new Book("The Picture of Dorian Gray", "Oscar Wilde", "Gothic Fiction", 254, 3),
        new Book("The Grapes of Wrath", "John Steinbeck", "Social Commentary", 464, 5),
        new Book("Great Expectations", "Charles Dickens", "Literary Fiction", 505, 9),
        new Book("Wuthering Heights", "Emily Brontë", "Gothic Fiction", 342, 0),
        new Book("The Odyssey", "Homer", "Epic Poetry", 442, 4),
        new Book("A Tale of Two Cities", "Charles Dickens", "Historical Fiction", 341, 7),
        new Book("The Divine Comedy", "Dante Alighieri", "Epic Poetry", 798, 1),
        new Book("The Iliad", "Homer", "Epic Poetry", 683, 4),
        new Book("Gulliver's Travels", "Jonathan Swift", "Satire", 306, 2),
        new Book("Alice's Adventures in Wonderland", "Lewis Carroll", "Fantasy", 200, 5),
        new Book("The War of the Worlds", "H.G. Wells", "Science Fiction", 192, 2),
        new Book("The Count of Monte Cristo", "Alexandre Dumas", "Adventure", 1276, 0),
        new Book("Les Misérables", "Victor Hugo", "Historical Fiction", 1463, 4),
        new Book("Dracula", "Bram Stoker", "Gothic Horror", 418, 1),
        new Book("Sense and Sensibility", "Jane Austen", "Romance", 409, 1),
        new Book("A Christmas Carol", "Charles Dickens", "Gothic Fiction", 104, 14),
        new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", "Mystery", 239, 8),
        new Book("Don Quixote", "Miguel de Cervantes", "Satire", 863, 3),
        new Book("Anna Karenina", "Leo Tolstoy", "Romantic Tragedy", 964, 0),
        new Book("The Scarlet Letter", "Nathaniel Hawthorne", "Gothic Romance", 238, 10),
        new Book("Oliver Twist", "Charles Dickens", "Social Commentary", 608, 13),
        new Book("The Canterbury Tales", "Geoffrey Chaucer", "Poetry", 504, 2),
        new Book("The Stranger", "Albert Camus", "Philosophical Fiction", 123, 2),
        new Book("Heart of Darkness", "Joseph Conrad", "Psychological Fiction", 72, 3),
        new Book("The Sun Also Rises", "Ernest Hemingway", "Modernist Literature", 251, 2),
        new Book("The Sound and the Fury", "William Faulkner", "Modernist Literature", 326, 5),
        new Book("A Clockwork Orange", "Anthony Burgess", "Dystopian", 213, 7),
        new Book("Slaughterhouse-Five", "Kurt Vonnegut", "Satire", 275, 0),
        new Book("Catch-22", "Joseph Heller", "Satire", 453, 4),
        new Book("The Handmaid's Tale", "Margaret Atwood", "Dystopian", 311, 18),
        new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Science Fiction", 193, 4),
        new Book("The Shining", "Stephen King", "Horror", 447, 7),
        new Book("The Stand", "Stephen King", "Post-Apocalyptic", 1153, 2),
        new Book("The Old Man and the Sea", "Ernest Hemingway", "Adventure", 127, 1),
        new Book("Fahrenheit 451", "Ray Bradbury", "Science Fiction", 249, 14),
        new Book("The Bell Jar", "Sylvia Plath", "Autobiographical Fiction", 244, 3),
        new Book("Gone with the Wind", "Margaret Mitchell", "Historical Fiction", 1037, 13),
        new Book("The Color Purple", "Alice Walker", "Epistolary Novel", 295, 17),
        new Book("The Joy Luck Club", "Amy Tan", "Contemporary Fiction", 288, 2),
        new Book("The Road", "Cormac McCarthy", "Post-Apocalyptic", 287, 12),
        new Book("A Thousand Splendid Suns", "Khaled Hosseini", "Historical Fiction", 432, 3),
        new Book("The Kite Runner", "Khaled Hosseini", "Historical Fiction", 372, 23),
        new Book("The Help", "Kathryn Stockett", "Historical Fiction", 464, 9),
        new Book("The Book Thief", "Markus Zusak", "Historical Fiction", 552, 22),
        new Book("Life of Pi", "Yann Martel", "Adventure", 319, 30),
        new Book("The Hunger Games", "Suzanne Collins", "Dystopian", 374, 16),
        new Book("The Da Vinci Code", "Dan Brown", "Thriller", 454, 5),
        new Book("Angels & Demons", "Dan Brown", "Thriller", 736, 6),
        new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", "Mystery", 672, 12),
        new Book("The Lovely Bones", "Alice Sebold", "Fantasy", 328, 5)));
    }

    /*
     * @return the database ArrayList
     */
    public ArrayList<Book> getDatabase() {
        return database;
    }

    /*
     * Prints the title of all books in the library with its number of copies
     */
    public void printAllTitles() {
        System.out.println("");
        System.out.printf("%-40s%-6s\n", "Title", "Copies");
        System.out.println("-----------------------------------------------");
        for (Book book : database) {
            System.out.printf("%-40s%6d\n", book.getTitle(), book.numOfCopies());
        }
    }
}
