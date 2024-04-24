public class Employee {
    private String fName;
    private String lName;
    private String emp_Number;

    //constructor
    public Employee(){
        fName = "John";
        lName = "Doe";
        emp_Number = "0000000";
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
}