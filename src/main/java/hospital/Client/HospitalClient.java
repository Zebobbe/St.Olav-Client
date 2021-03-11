package hospital.Client;

import hospital.Department;
import hospital.Hospital;
import hospital.Patient;
import hospital.exception.RemoveException;

public class HospitalClient
{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {

        Hospital hospital = new Hospital("Seb's Hospital");
        HospitalTestData.fillRegisterWithTestData(hospital);


        try {
            hospital.getDepartments().get(8).removePerson(new Patient("Inga", "Lykke", ""));
        } catch (RemoveException removeException) {
            removeException.printStackTrace();
        }

        try {
            hospital.getDepartments().get(3).removePerson(new Patient("Ingrid", "Land", ""));
        } catch (RemoveException removeException) {
            removeException.printStackTrace();
        }

    }






}
