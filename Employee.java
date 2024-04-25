public class Employee {
    private String fName;
    private String lName;
    private String emp_Number;

    //constructor
    public Employee(String fName, String lName, String emp_Number){
        this.fName = fName;
        this.lName = lName;
        this.emp_Number = emp_Number;
    }


    //getters
    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public String getEmpID() {
        return emp_Number;
    }

    //setters
    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setEmpID(String emp_Number) {
        this.emp_Number = emp_Number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fName + '\'' +
                ", lname='" + lName + '\'' +
                ", empID=" + emp_Number +
                '}';
    }
}