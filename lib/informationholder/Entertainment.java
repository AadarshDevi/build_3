package lib.informationholder;

public class Entertainment {

    public static final String MOVIE = "Movie";
    public static final String ANIME = "Anime";
    public static final String BOOK = "Book";
    public static final String MANGA = "Manga";

    private int id;
    private String franchise;

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
     * 8 > special
     */

    public Entertainment(int id, String franchise) {
        this.id = id;
        this.franchise = franchise;
    }

    public String getFranchise() {
        return franchise;
    }

    public int getId() {
        return id;
    }

    public void setFranchise(String newFranchise) {
        franchise = newFranchise;
    }

    public void setId(int newId) {
        id = newId;
    }

    public String toString() {
        return " " + id + ": " + franchise;
    }

    public static int[] getStatusList(String statusline) {
        String[] statuses = statusline.split(" ");
        int[] statuslist = new int[statuses.length];

        for (int i = 0; i < statuses.length; i++) {
            statuslist[i] = Integer.parseInt(statuses[i]);
        }

        return statuslist;
    }

}
