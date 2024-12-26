package lib.informationholder;

public class Manga extends Entertainment {

    /*
     * Status:
     * 1 > seen
     * 2 > not seen
     * 
     * 3 > upcoming
     * 4 > released
     * 
     * 5 > completed
     * 6 > ongoing
     * 
     * 7 > pilot
     */

    public Manga(int id, String title) {
        super(id, title);
    }
}
