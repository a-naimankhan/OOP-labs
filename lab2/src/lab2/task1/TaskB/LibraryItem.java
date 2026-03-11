package lab2.task1.TaskB;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicitionYear;


    public LibraryItem(String title , String author , int publicitionYear) {
        this.title = title;
        this.author = author;
        this.publicitionYear = publicitionYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicitionYear() {
        return publicitionYear;
    }

    @Override
    public String toString() {
        return "Author : " + getAuthor() + "\nTitle : " + getTitle() + "\nPublished year : " + getPublicitionYear();
    }


}
