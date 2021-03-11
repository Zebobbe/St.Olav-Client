package hospital.healthpersonal.doctor;

import hospital.Patient;

public class Surgeon extends Doctor
{

    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     *
     * @param patient
     * @param diagnosis
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {

    }
}
