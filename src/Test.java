import java.util.*;

public class Test {

    public static void main(String[] args) {

        Library library = new Library();

        System.out.println("\nTop 20 \n");
        library.top20();


        System.out.println("\nArchive \n");
        library.archive();

        System.out.println("\nVideo \n");
        library.search("Video");

        System.out.println("\nDownload \n");
        library.download("Logistica Transporturilor");

        //Top 20 has been changed.
        System.out.println("\nTop 20 \n");
        library.top20();

    }

    /*
    * Contains 15 books, 5 videos and 7 Mp3...
     */

    public static List<MediaEntity> getEntityList() {

        List<MediaEntity> mediaEntityList = new ArrayList<>();
        mediaEntityList.add(new Book("Management Financiar",19, "A. Nestian", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Finante",20, "A. Popa", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Management",21, "N. Andrei", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Marketing",22, "A.  Monoranu", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Logistica", 18, "A. Roman", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Bazele Contabilitatii", 17, "D. Parhon", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Microeconomie", 16, "D. Niculescu", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Statistica", 15, "P. Roman", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Logistica Transporturilor",1, "S. Tita", "Al. I. Cuza"));
        mediaEntityList.add(new Book("Managementul Proiectelor",0, "N. Andrei", "Al. I. Cuza"));
        mediaEntityList.add(new Video("Java pentru incepatori", 1,4,55, true));
        mediaEntityList.add(new Video("Tutorial C#",11, 2,55, true));
        mediaEntityList.add(new Video("Limbaje de programare",10, 5,33, false));
        mediaEntityList.add(new Video("Algoritmi", 9,3,22, false));
        mediaEntityList.add(new Video("Programarea in Pyton", 8,1, 22, true));
        mediaEntityList.add(new Mp3("Melodie01", 7,"Interpret5", "Album"));
        mediaEntityList.add(new Mp3("Melodie02", 6,"Interpret2", "Album"));
        mediaEntityList.add(new Mp3("Melodie03", 4,"Interpret3", "Album"));
        mediaEntityList.add(new Mp3("Melodie04", 5,"Interpret4", "Album"));
        mediaEntityList.add(new Mp3("Melodie05", 14,"Interpret0", "Album"));
        mediaEntityList.add(new Mp3("Melodie06", 13,"Interpret1", "Album"));
        mediaEntityList.add(new Mp3("Melodie07", 12,"Interpret", "Album"));
        return mediaEntityList;
    }


}
