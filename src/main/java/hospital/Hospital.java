package hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital
{

    /**
     * Create info for hospital names
     */
    private final String hospitalName;


    HashMap<String, Department> departmentList = new HashMap<>();

    /**
     *
     * @param hospitalName
     */
    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    /**
     *
     * @return
     */
    public String getHospitalName()
    {
        return hospitalName;
    }

    public HashMap<String, Department> getDepartments() {
        return departmentList;
    }

    /**
     *
     * @param department
     */
    public void addDepartment(Department department)
    {
        departmentList.put(department.getDepartmentName(), department);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }
}
