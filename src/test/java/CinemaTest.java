import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class CinemaTest {
    ArrayList<Movie> MovieList = new ArrayList<>();
    ArrayList<Employe> EmployeList = new ArrayList<>();
    ArrayList<Schedule> SheduleList = new ArrayList<>();
    Employe emp = new Employe("John", "Cashier", 300);
    Movie mov = new Movie("Pulp Fiction", "Quentin Tarantino", "2h 34min");

    @Test
    public void printMovieList() throws Exception {
    }

    @Test
    public void deleteMovie() throws Exception {
    }

    @Test
    public void printEmployes() throws Exception {
    }

    @Test
    public void deleteEmploye() throws Exception {
    }

    @Test
    public void printShedule() throws Exception {
    }

    @Test
    public void createMovie() throws Exception {
        MovieList.add(mov);
        Iterator itr=MovieList.iterator();
        while(itr.hasNext()){
            Assert.assertEquals(itr.next(), mov);
        }
    }

    @Test
    public void createMovieNotNull() throws Exception {
        MovieList.add(mov);
        Assert.assertNotNull(MovieList);
        }
    @Test
    public void createMovieGetName() throws Exception {
        MovieList.add(mov);
        Iterator itr=MovieList.iterator();
        for(Movie m:MovieList){
            Assert.assertEquals(m.getName(), mov.getName());
        }
    }

    @Test
    public void createMovieSetName() throws Exception {
        mov.setName("Test");
        MovieList.add(mov);
        Iterator itr=MovieList.iterator();
        for(Movie m:MovieList){
            m.setName("Test");
            Assert.assertEquals(m.getName(), mov.getName());
        }
    }

        @Test
        public void createEmploye () throws Exception {

        }

        @Test
        public void addToShedule () throws Exception {
        }

    }