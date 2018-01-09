import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    Movie mov = new Movie("Pulp Fiction", "Quentin Tarantino", "2h 34min");

    @Test
    public void getName() throws Exception {
        assertEquals("Pulp Fiction",  mov.getName());
    }

    @Test
    public void setName() throws Exception {
        mov.setName("Taxi Driver");
        assertEquals("Taxi Driver",  mov.getName());
    }

    @Test
    public void getDirector() throws Exception {
        assertEquals("Quentin Tarantino",  mov.getDirector());
    }

    @Test
    public void setDirector() throws Exception {
        mov.setDirector("Martin Scorsese");
        assertEquals("Martin Scorsese",  mov.getDirector());
    }

    @Test
    public void getMovieLength() throws Exception {
        assertEquals("2h 34min",  mov.getMovieLength());
    }

    @Test
    public void setMovieLength() throws Exception {
        mov.setMovieLength("2h");
        assertEquals("2h",  mov.getMovieLength());
    }

}