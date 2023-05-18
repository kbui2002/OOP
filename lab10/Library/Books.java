package lab10.Library;

public class Books extends Item {

    int pages;

    public Books(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return "Book" + super.toString() + "; pages: " + pages;
    }
}