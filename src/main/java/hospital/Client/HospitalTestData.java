package hospital.Client;

import hospital.Employee;
import hospital.Hospital;
import hospital.Patient;
import hospital.healthpersonal.Nurse;
import hospital.healthpersonal.doctor.GeneralPractitioner;
import hospital.healthpersonal.doctor.Surgeon;
import hospital.Department;

public final class HospitalTestData
{

    private HospitalTestData()
    {
        // Not called
    }

    /**
     *
     * @param hospital
     */
    public static void fillRegisterWithTestData(final Hospital hospital)
    {
        Department emergency = new Department("Akutten");
        emergency.getEmployeeList().add(1, new Employee("Odd Even", "Primtallet", ""));
        emergency.getEmployeeList().add(2, new Employee("Huppasahn", "DelFinito", ""));
        emergency.getEmployeeList().add(3, new Employee("Rigmor", "Mortis", ""));
        emergency.getEmployeeList().add(4, new GeneralPractitioner("Inco", "Gnito", ""));
        emergency.getEmployeeList().add(5, new Surgeon("Inco", "Gnito", ""));
        emergency.getEmployeeList().add(6, new Nurse("Nina", "Teknologi", ""));
        emergency.getEmployeeList().add(7, new Nurse("Ove", "Ralt", ""));
        emergency.getPatientList().add(8, new Patient("Inga", "Lykke", ""));
        emergency.getPatientList().add(9, new Patient("Ulrik", "Smål", ""));
        hospital.getDepartments().put("Emergency", emergency);

        Department childrenPolyclinic = new Department("Barne poliklinikk");
        childrenPolyclinic.getEmployeeList().add(10, new Employee("Salti", "Kaffen", ""));
        childrenPolyclinic.getEmployeeList().add(11, new Employee("Nidel V.", "Elvefølger", ""));
        childrenPolyclinic.getEmployeeList().add(12, new Employee("Anton", "Nym", ""));
        childrenPolyclinic.getEmployeeList().add(13, new GeneralPractitioner("Gene", "Sis", ""));
        childrenPolyclinic.getEmployeeList().add(14, new Surgeon("Nanna", "Na", ""));
        childrenPolyclinic.getEmployeeList().add(15, new Nurse("Nora", "Toriet", ""));
        childrenPolyclinic.getPatientList().add(16, new Patient("Hans", "Omvar", ""));
        childrenPolyclinic.getPatientList().add(17, new Patient("Laila", "La", ""));
        childrenPolyclinic.getPatientList().add(18, new Patient("Jøran", "Drebli", ""));
        hospital.getDepartments().put("Children-Polyclinic", childrenPolyclinic);


    }


}
