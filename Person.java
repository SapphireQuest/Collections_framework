public class Person extends TelephoneEntry
{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName, TelephoneNumber telephoneNumber, Address address)
    {
        super(telephoneNumber, address);
        if(checkName(firstName) && checkName(lastName))
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        else
        {
            throw new IllegalArgumentException("First and last name must not be empty!");
        }
    }

    @Override
    public String description() 
    {
        return firstName + " " + lastName + ", " + getAddress();
    }
}
