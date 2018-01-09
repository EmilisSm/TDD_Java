import java.util.ArrayList;

public class Cinema {

    ArrayList<Movie> MovieList = new ArrayList<>();
    ArrayList<Employe> EmployeList = new ArrayList<>();
    ArrayList<Schedule> SheduleList = new ArrayList<>();

    public void createMovie(){
        Movie mov = new Movie("Pulp Fiction", "Quentin Tarantino", "2h 34min");
        MovieList.add(mov);
    }

    public void printMovieList(){

    }

    public void deleteMovie(String MovieName){

    }

    public void createEmploye(){

    }

    public void printEmployes(){

    }

    public void deleteEmploye(String EmpName){

    }

    public void addToShedule(){

    }

    public void printShedule(){

    }

    public void deleteFromShedule(){

    }



}
