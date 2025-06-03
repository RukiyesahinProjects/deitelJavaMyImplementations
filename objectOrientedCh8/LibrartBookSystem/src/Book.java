public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
        this.isCheckedOut = false;
    }

    public void checkOut() {
        if (!isCheckedOut){
            this.isCheckedOut = true;
        }
    }

    public void returnBook() {
        this.isCheckedOut = false;
    }

    public String status() {
        if (isCheckedOut) {
            return "Checked Out";
        } else {
            return "Available";
        }
    }

}
