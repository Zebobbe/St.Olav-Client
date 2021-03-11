package hospital.healthpersonal.doctor;

import hospital.Patient;

public class GeneralPractitioner extends Doctor
{

    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber)
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
