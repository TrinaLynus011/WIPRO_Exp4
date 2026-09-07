package employee;

import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list =
        new ArrayList<>();

    // Add employee
    public boolean addEmployee(Employee e) {

        return list.add(e);
    }

    // Delete employee using empId
    public boolean deleteEmployee(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {

                list.remove(e);

                return true;
            }
        }

        return false;
    }

    // Show payslip
    public String showPaySlip(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {

                return "Employee ID : "
                    + e.empId
                    + "\nEmployee Name : "
                    + e.empName
                    + "\nSalary : "
                    + e.salary;
            }
        }

        return "Employee not found";
    }
}
