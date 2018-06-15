public class Book extends MediaEntity {
    String author;
    String publishingHouse;

    public Book(String title, int noOfDownloads, String author, String publishingHouse) {
        super(title, noOfDownloads);
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public String getTip() {
        return tip;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return "Book: " +
                "Author: '" + author + '\'' +
                ", PublishingHouse: '" + publishingHouse + '\'' +
                ", Title: '" + title + '\'' +
                ", noOfDownloads: " + noOfDownloads;
    }
}
