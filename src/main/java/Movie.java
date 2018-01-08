public class Movie {
    public String Name;
    public String Director;
    public String MovieLength;

    public Movie(String name, String director, String movieLength) {
        Name = name;
        Director = director;
        MovieLength = movieLength;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getMovieLength() {
        return MovieLength;
    }

    public void setMovieLength(String movieLength) {
        MovieLength = movieLength;
    }
}
