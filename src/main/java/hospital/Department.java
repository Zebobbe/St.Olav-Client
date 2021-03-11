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

    /**
     *
     * @param departmentName
     */
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     *
     * @param departmentName
     */
    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     *
     * @return
     */
    public String getDepartmentName()
    {
        return departmentName;
    }

    /**
     *
     * @return
     */
    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    /**
     *
     * @param employee
     */
    public void addEmployee(Employee employee)
    {
        employeeList.add(employee);
    }

    /**
     *
     * @return
     */
    public List<Patient> getPatientList()
    {
        return patientList;
    }

    /**
     *
     * @param patient
     */
    public void addPatient(Patient patient)
    {
        patientList.add(patient);
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getDepartmentName(), that.getDepartmentName()) && Objects.equals(getEmployeeList(), that.getEmployeeList()) && Objects.equals(getPatientList(), that.getPatientList());
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentName(), getEmployeeList(), getPatientList());
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employeeList=" + employeeList +
                ", patientList=" + patientList +
                '}';
    }

    /**
     *
     * @param person
     * @throws RemoveException
     */
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
                throw new RemoveException(person.getFullName() + " not found in register");
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
                throw new RemoveException(person.getFullName() + " not found in register");
            }
        }


    }

}
