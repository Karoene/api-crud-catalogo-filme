public class Movie {
    private String title;
    private double runningTime;
    private int releaseYear;

    public Movie(String title, double runningTime, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
        this.runningTime = runningTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(double runningTime) {
        this.runningTime = runningTime;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString(){
        return "Titulo: " + getTitle() + "\nAno de Lançamento: " + getReleaseYear();
    }
}
