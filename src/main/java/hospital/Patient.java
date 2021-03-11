package hospital;

public class Patient extends Person implements Diagnosable {

    private String diagnosis = "";

    protected String getDiagnosis()
    {
        return diagnosis;
    }

    protected Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "diagnosis='" + diagnosis + '\'' +
                '}';
    }

    @Override
    public void setDiagnosis(String diagnosis) {

    }
}
