package hospital.healthpersonal.doctor;

import hospital.Employee;
import hospital.Patient;

public abstract class Doctor extends Employee
{

    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    protected Doctor(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     *
     * @param patient
     * @param diagnosis
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);


}
