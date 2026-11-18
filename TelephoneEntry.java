public abstract class TelephoneEntry 
{
    private TelephoneNumber telephoneNumber;
    private Address address;
    protected TelephoneEntry(TelephoneNumber telephoneNumber, Address address)
    {
        if(telephoneNumber != null && address != null)
        {
            this.telephoneNumber = telephoneNumber;
            this.address = address;
        }
        else
        {
            throw new IllegalArgumentException("Telephone number and address cannot be null!");
        }
    }
    public abstract String description();

    public TelephoneNumber getTelephoneNumber()
    {
        return telephoneNumber;
    }

    public Address getAddress()
    {
        return address;
    }

    protected  boolean checkName(String stringToCheck)
    {
        return !(stringToCheck == null || stringToCheck.isBlank());
    }
}
