package hospital;

import hospital.exception.RemoveException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department department = new Department("TestDepartment");

    Employee employeeInRegister = new Employee("Jotaro", "Kujo", "12345");
    Employee employeeNotInRegister = new Employee("Jonathan", "Joestar", "54321");

    Patient patientInRegister = new Patient("Dio", "Brando", "56789");
    Patient patientNotInRegister = new Patient("Kira", "Yoshikage", "98765");

    @BeforeEach
    void addElementsBeforeTest()
    {
        department.getEmployeeList().add(employeeInRegister);
        department.getPatientList().add(patientInRegister);
    }

    @Test
    void removePersonPositive()
    {

            department.getEmployeeList().remove(employeeInRegister);
            department.getPatientList().remove(patientInRegister);

    }

    @Test
    void removePersonNegative()
    {
            department.getEmployeeList().remove(employeeNotInRegister);
            department.getPatientList().remove(patientNotInRegister);

    }

    /*
    @Test
    void getEmployeeList() {
    }

    @Test
    void getPatientList() {
    }

     */

}