public class MediaEntity implements Comparable<MediaEntity> {
    String tip = getClass().getName();
    String title;
    int noOfDownloads = 0;

    public MediaEntity(String title, int noOfDownloads) {
        this.title = title;
        this.noOfDownloads = noOfDownloads;
    }

    public String getTip() {
        return tip;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfDownloads() {
        return noOfDownloads;
    }

    public int download() {
        this.noOfDownloads++;
        return noOfDownloads;
    }

    @Override
    public String toString() {
        return "MediaEntity{" +
                "typeMedia=" + tip +
                ", title='" + title + '\'' +
                ", noOfDownloads=" + noOfDownloads +
                '}';
    }

    @Override
    public int compareTo(MediaEntity o) {
        if (this.noOfDownloads < o.noOfDownloads)
            return 1;
        if (this.getNoOfDownloads() == o.getNoOfDownloads() && this.getTitle().compareTo(o.getTitle()) > 0) {
            return 1;
        } else
            return -1;
    }
}

