package lib.informationholder;

public class Movie extends Entertainment {

    private int releaseYear;
    private int runtime;
    String[] production_companies;
    int[] statuses;

    /*
     * Status:
     * 1 > seen
     * 2 > not seen
     * 
     * 3 > upcoming
     * 4 > released
     * 
     * 8 > special
     */

    // id, name
    public Movie(int id, String title) {
        super(id, title);
    }

    // id, title, status
    public Movie(int id, String title, int[] status) {
        super(id, title);
        this.statuses = status;
    }

    // id, title, release year, runtime, animation companies, status
    public Movie(int id, String title, int releaseYear, int runtime, String[] production_companies, int[] status) {
        super(id, title);
        this.releaseYear = releaseYear;
        this.runtime = runtime;
        this.production_companies = production_companies;
        this.statuses = status;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getRuntime() {
        return runtime;
    }

    public String[] getProductionCompanies() {
        return production_companies;
    }

    public int[] getStatuses() {
        return statuses;
    }

    public void setReleaseYear(int newReleaseYear) {
        this.releaseYear = newReleaseYear;
    }

    public void setRuntime(int newRuntime) {
        this.runtime = newRuntime;
    }

    public void setProductionCompanies(String[] newProductionCompanies) {
        this.production_companies = newProductionCompanies;
    }

    public void setStatuses(int[] newStatuses) {
        this.statuses = newStatuses;
    }

    public String toString() {
        return "Movie: " + super.toString()
                + ", Release Year: " + releaseYear
                + ", Runtime: " + runtime;
    }

}
