package lab2.task1.TaskB;

public class Book extends LibraryItem{
    private int numberOfPages;

    public Book(String title , String author , int publicitionYear , int pages ) {
        super(title, author, publicitionYear);
        this.numberOfPages = pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of pages : " + getNumberOfPages();
    }
}
