import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeTest {
    Employe emp = new Employe("John", "Cashier", 300);

    @Test
    public void getEmpName() throws Exception {
        assertEquals("John", emp.getEmpName());
    }

    @Test
    public void setEmpName() throws Exception {
        emp.setEmpName("Alex");
        assertEquals("Alex", emp.getEmpName());
    }

    @Test
    public void getPosition() throws Exception {
        assertEquals("Cashier", emp.getPosition());
    }

    @Test
    public void setPosition() throws Exception {
        emp.setPosition("Waiter");
        assertEquals("Waiter", emp.getPosition());
    }

    @Test
    public void getWage() throws Exception {
        assertEquals(300, emp.getWage());
    }

    @Test
    public void setWage() throws Exception {
        emp.setWage(450);
    }

    @Test
    public void countWage() throws Exception {
        int month = 3;
        //count wage for 3 months
        assertEquals(900, emp.countWage(month));
    }

}