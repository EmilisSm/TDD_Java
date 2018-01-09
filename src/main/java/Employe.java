public class Employe {
    private String EmpName;
    private String Position;
    private int Wage;

    public Employe(String empName, String position, int wage) {
        EmpName = empName;
        Position = position;
        Wage = wage;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getWage() {
        return Wage;
    }

    public void setWage(int wage) {
        Wage = wage;
    }

    public int countWage(int months){
        int totalWage = Wage * months;
        return totalWage;
    }
}
