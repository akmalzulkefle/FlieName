package TestWan;

public class StaffOperation {

    private Staff staffs[];

    public StaffOperation(Staff[] staffs) {
        this.staffs = staffs;
    }

    public StaffOperation(int staffNumber) {
        staffs = new Staff[staffNumber];
    }

    public double calculateTax(Staff staffs, int i) {

        double salary = staffs.getSalary();
        double tax;

        if (salary < 1000) {
            tax = 0 * staffs.getSalary();
        } else if (salary >= 1000 && salary < 5000) {
            tax = 0.05 * staffs.getSalary();
        } else {
            tax = 0.1 * staffs.getSalary();
        }

        staffs.setTaxAmount(tax);

        return tax;

    }

    public void addStaff(Staff staff, int i) {
        staffs[i] = staff;
        calculateTax(staff, i);
    }

    public void disPlayAllStaff() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] != null) {
                System.out.println("Staff No.   = " + staffs[i].getStaffID());
                System.out.println("Name        = " + staffs[i].getName());
                System.out.println("Salary      = RM " + staffs[i].getSalary());
                System.out.println("Tax Amount  = RM " + staffs[i].getTaxAmount());
                System.out.println("\n");
            }
        }
    }

}