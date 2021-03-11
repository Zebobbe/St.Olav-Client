package hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital
{

    private final String hospitalName;

    HashMap<String, Department> departmentList = new HashMap<>();


    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName()
    {
        return hospitalName;
    }

    public HashMap<String, Department> getDepartments() {
        return departmentList;
    }

    public void addDepartment(Department department)
    {
        departmentList.put(department.getDepartmentName(), department);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }
}
