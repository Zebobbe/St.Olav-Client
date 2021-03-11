package hospital;


public class Patient extends Person implements Diagnosable
{

    /**
     * Create info for a diagnosis
     */
    private String diagnosis = "";

    /**
     *
     * @return
     */
    protected String getDiagnosis()
    {
        return diagnosis;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }

    /**
     *
     * @param diagnosis
     */
    @Override
    public void setDiagnosis(String diagnosis) {

    }
}
