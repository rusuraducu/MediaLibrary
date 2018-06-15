import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<MediaEntity> mediaEntityList = Test.getEntityList();

    public void search(String type) {

        for (int i = 0; i < mediaEntityList.size(); i++) {
            if (mediaEntityList.get(i).getTip().equals(type)) {
                System.out.println(mediaEntityList.get(i));
            }
        }
    }

    public void archive() {
        mediaEntityList.sort(MediaEntity::compareTo);
        if (mediaEntityList.size() > 20) {
            for (int i = 20; i < mediaEntityList.size(); i++) {
                System.out.println(mediaEntityList.get(i));
            }
        }
    }

    public void top20() {
        mediaEntityList.sort(MediaEntity::compareTo);
        int top = 20;
        if (top > mediaEntityList.size()) {
            top = mediaEntityList.size();
        }
        for (int i = 0; i < top; i++) {
            System.out.println(i + 1 + ". " + mediaEntityList.get(i).getTip()+":  Title: '"+
            mediaEntityList.get(i).getTitle() + "', noOfDownloads: " +mediaEntityList.get(i).getNoOfDownloads());
        }
    }

    public boolean download(String title) {
        boolean downloadReturn = false;
        for (int i = 0; i < mediaEntityList.size(); i++) {
            if (mediaEntityList.get(i).getTitle().equals(title)) {
                mediaEntityList.get(i).download();
                downloadReturn = true;
                downloadMsg(downloadReturn, title);
                return true;
            }
        }
        downloadMsg(downloadReturn, title);
        return false;
    }

    private static void downloadMsg(Boolean downloadReturn, String title) {
        if (downloadReturn == true) {
            System.out.println(title + " was downloaded.");
        } else {
            System.out.println(title + " doesn't exist.");
        }

    }
}
