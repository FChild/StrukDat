abstract class Movie {
    protected String title;
    protected String genre;
    private int duration; 

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    } 
    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }
    public int getDuration() {
        return duration;
    }

    abstract void playMovie();
    public void displayInfo() {
        System.out.println("Title: " + title + ", Genre: " + genre);
    }
}

class ActionMovie extends Movie {

    public ActionMovie(String title, String genre) {
        super(title, genre);
    }
    @Override
    void playMovie() {
        System.out.println("Action movie is palying now");
    }
}

class ComedyMovie extends Movie {

    public ComedyMovie(String title, String genre) {
        super(title, genre);
    }
    @Override
    public void playMovie() {
        System.out.println("Comedy movie playing");
    }
}

public class Latihan{
     public static void main(String[] args) {

        Movie movie1 = new ActionMovie("Avengers", "Action");
        Movie movie2 = new ComedyMovie("Mr.Bean", "Comedy");

        movie1.playMovie();
        movie2.playMovie();
    }
}
