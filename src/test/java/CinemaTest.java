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
        MovieList.add(mov);
        Iterator itr=MovieList.iterator();
        for(Movie m:MovieList){
            assertNotNull(m.getName(), MovieList);
            System.out.println(m.getName() + " : " + m.getDirector() + " : " + m.getMovieLength());
        }
    }

    @Test
    public void deleteMovie() throws Exception {
        String movNameToDelete = "Pulp Fiction";
        int i = 0;
        Movie mov2 = new Movie("Kill Bill", "Quentin Tarantrino", "2h 30min");
        MovieList.add(mov);
        MovieList.add(mov2);
        Iterator itr=MovieList.iterator();
        for(Movie m:MovieList){
            if(m.getName() == movNameToDelete){
                MovieList.remove(i);
                assertEquals(1, MovieList.size());
            }
            i++;
        }
    }

    @Test
    public void printEmployes() throws Exception {
        EmployeList.add(emp);
        Iterator itr=EmployeList.iterator();
        for(Employe e:EmployeList){
            assertNotNull(e.getEmpName(), EmployeList);
            System.out.println(e.getEmpName() + " : " + e.getPosition() + " : " + e.getWage() + "$");
        }
    }

    @Test
    public void deleteEmploye() throws Exception {
        String empNameDelete = "John";
        int i = 0;
        Employe emp1 = new Employe("Alex", "Guard", 450);
        EmployeList.add(emp);
        EmployeList.add(emp1);
        Iterator itr=EmployeList.iterator();
        for(Employe e:EmployeList){
            if(e.getEmpName() == empNameDelete){
                EmployeList.remove(i);
                assertEquals(1, EmployeList.size());
            }
            i++;
        }
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
            EmployeList.add(emp);
            Iterator itr=EmployeList.iterator();
            while(itr.hasNext()){
                Assert.assertEquals(itr.next(), emp);
            }


        }

        @Test
        public void addToShedule () throws Exception {
        }

        @Test
        public void printShedule() throws Exception {
        }

    }