public class Video extends MediaEntity {
    int minutes;
    int seconds;
    Boolean fullHD;


    public Video(String title, int noOfDownloads, int minutes, int seconds, Boolean fullHD) {
        super(title, noOfDownloads);
        this.minutes = minutes;
        this.seconds = seconds;
        this.fullHD = fullHD;
    }

    public String getTip() {
        return tip;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Boolean getFullHD() {
        return fullHD;
    }

    @Override
    public String toString() {
        return "Video: " +
                "Minutes: " + minutes +
                ", Seconds: " + seconds +
                ", fullHD: " + fullHD +
                ", Title: '" + title + '\'' +
                ", noOfDownloads: " + noOfDownloads;
    }
}
