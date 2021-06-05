package TestWan;

public class StaffMainMenu {

    public static void main(String[] args) {

        int staffNumber = 5;  //  indicate the number of employee
        StaffOperation staffOperation = new StaffOperation(staffNumber);
        Staff staff;
        int index = 0;

        // create and add three staff records via calling an appropriate constructor and 
        // method from the class Staff and StaffOperation respectively. 
        staff = new Staff(111, "Muhammad Ridzwan", 4000);
        staffOperation.addStaff(staff, index);

        index++;
        staff = new Staff(222, "Muhammad Kamal", 500);
        staffOperation.addStaff(staff, index);

        index++;
        staff = new Staff(333, "Muhammad Jamal", 2000);
        staffOperation.addStaff(staff, index);

        index++;
        staff = new Staff(444, "Muhammad Hassan", 10000);
        staffOperation.addStaff(staff, index);

        // The example of staff records could be referred to the given sample output       
        // display all the staff information along with the tax for each employee  
        System.out.println("================= DISPLAYING ALL STAFF INFORMATION =================");
        staffOperation.disPlayAllStaff();
    }
}
