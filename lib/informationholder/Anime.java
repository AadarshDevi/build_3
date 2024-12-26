package lib.informationholder;

public class Anime extends Entertainment {

    private String title;
    private int seasons;
    private int episodes;
    private int[] statuses;

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

    // id, franchise
    public Anime(int id, String franchise) {
        super(id, franchise);
    }

    public Anime(int id, String franchise, String title) {
        super(id, franchise);
        if (title.equals("nullvoidreturn"))
            title = null;
        this.title = title;

    }

    public Anime(int id, String franchise, String title, int seasons, int episodes) {
        super(id, franchise);
        if (title.equals("nullvoidreturn"))
            title = null;
        this.title = title;
        this.seasons = seasons;
        this.episodes = episodes;
    }

    // id, franchise, title, seasons, episodes, statuses
    public Anime(int id, String franchise, String title, int seasons, int episodes, int[] statuses) {
        super(id, franchise);
        if (title.equals("nullvoidreturn"))
            title = null;
        this.title = title;
        this.seasons = seasons;
        this.episodes = episodes;
        this.statuses = statuses;
    }

    public String getTitle() {
        return title;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public int[] getStatuses() {
        return statuses;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setStatuses(int[] statuses) {
        this.statuses = statuses;
    }

    @Override
    public String toString() {
        if (title != null)
            return "Anime: " + super.toString()
                    + ", Title: " + title
                    + ", S" + seasons
                    + " E" + episodes;
        else
            return "Anime: " + super.toString()
                    + ", S" + seasons
                    + " E" + episodes;
    }
}
