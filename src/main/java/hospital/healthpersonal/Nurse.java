package hospital.healthpersonal;

import hospital.Employee;

public class Nurse extends Employee
{
    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
