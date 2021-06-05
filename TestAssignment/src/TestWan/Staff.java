package TestWan;

public class Staff {

    private int staffID;
    private String name;
    private double salary;
    private double taxAmount;

    public Staff(int staffID, String name, double salary) {
        this.staffID = staffID;
        this.name = name;
        this.salary = salary;
    }

    public void setTaxAmount(double Amount) {
        taxAmount = Amount;
    }

    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

}
