public class Mp3 extends MediaEntity {
    String singer;
    String album;

    public Mp3(String title, int noOfDownloads, String singer, String album) {
        super(title, noOfDownloads);
        this.singer = singer;
        this.album = album;
    }

    public String getTip() {
        return tip;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Mp3: " +
                "Singer: '" + singer + '\'' +
                ", Album: '" + album + '\'' +
                ", Title:'" + title + '\'' +
                ", noOfDownloads: " + noOfDownloads;
    }
}
