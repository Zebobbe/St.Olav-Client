package hospital;

public abstract class Person
{

    /**
     * Create info for Person
     */
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     */
    public Person(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     *
     * @return
     */
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    /**
     *
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
