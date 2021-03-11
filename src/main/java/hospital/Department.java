package hospital;

import hospital.exception.RemoveException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department
{

    private String departmentName;

    List<Employee> employeeList = new ArrayList<>();
    List<Patient> patientList = new ArrayList<>();

    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    public List<Patient> getPatientList()
    {
        return patientList;
    }

    public void addPatient(Patient patient)
    {
        patientList.add(patient);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getDepartmentName(), that.getDepartmentName()) && Objects.equals(getEmployeeList(), that.getEmployeeList()) && Objects.equals(getPatientList(), that.getPatientList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentName(), getEmployeeList(), getPatientList());
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employeeList=" + employeeList +
                ", patientList=" + patientList +
                '}';
    }

    public void removePerson(Person person) throws RemoveException
    {
        if (person instanceof Employee)
        {
            if (employeeList.contains(person))
            {
                employeeList.remove(person);
            }
            else
            {
                throw new RemoveException("Employee not found in register");
            }
        }
        else if (person instanceof Patient)
        {
            if (patientList.contains(person))
            {
                patientList.remove(person);
            }
            else
            {
                throw new RemoveException("Patient not found in register");
            }
        }


    }

}
