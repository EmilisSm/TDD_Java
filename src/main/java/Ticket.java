import java.util.Date;

public class Ticket {
    private Movie Film;
    private int Price;
    private int Sector;
    private int Place;
    private String Room;
    private Date Day;

    public Ticket(Movie film, int price, int sector, int place, String room) {
        Film = film;
        Price = price;
        Sector = sector;
        Place = place;
        Room = room;
    }

    public Movie getFilm() {
        return Film;
    }

    public void setFilm(Movie film) {
        Film = film;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSector() {
        return Sector;
    }

    public void setSector(int sector) {
        Sector = sector;
    }

    public int getPlace() {
        return Place;
    }

    public void setPlace(int place) {
        Place = place;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public Date getDay() {
        return Day;
    }

    public void setDay(Date day) {
        this.Day = day;
    }
}
