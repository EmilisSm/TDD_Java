import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {
    Movie mov = new Movie("Pulp Fiction", "Quentin Tarantino", "2h 34min");
    Ticket ticket = new Ticket(mov, 8, 1, 1, "Big Room");

    @Test
    public void getFilm() throws Exception {
        assertEquals(mov,ticket.getFilm());
    }

    @Test
    public void setFilm() throws Exception {
        Movie mov = new Movie("Pulp Fiction", "Quentin Tarantino", "2h 34min");
        ticket.setFilm(mov);
    }

    @Test
    public void getPrice() throws Exception {
        assertEquals(8, ticket.getPrice());
    }

    @Test
    public void setPrice() throws Exception {
        ticket.setPrice(10);
        assertEquals(10, ticket.getPrice());
    }

    @Test
    public void getSector() throws Exception {
        assertEquals(1, ticket.getSector());
    }

    @Test
    public void setSector() throws Exception {
        ticket.setSector(2);
        assertEquals(2, ticket.getSector());
    }

    @Test
    public void getPlace() throws Exception {
        assertEquals(1, ticket.getPlace());
    }

    @Test
    public void setPlace() throws Exception {
        ticket.setPlace(2);
        assertEquals(2, ticket.getPlace());
    }

    @Test
    public void getRoom() throws Exception {
        assertEquals("Big Room", ticket.getRoom());
    }

    @Test
    public void setRoom() throws Exception {
        ticket.setRoom("Small Place");
        assertEquals("Small Place", ticket.getRoom());
    }

    @Test
    public void getDay() throws Exception {
    }

    @Test
    public void setDay() throws Exception {
    }

}