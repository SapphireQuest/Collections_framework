public class Company extends TelephoneEntry 
{
    private String companyName;

    public Company(String companyName, TelephoneNumber telephoneNumber, Address address)
    {
        super(telephoneNumber, address);
        if(checkName(companyName)) 
        {
            this.companyName = companyName;
        }
        else
        {
            throw new IllegalArgumentException("Company name must not be empty!");
        }
    }

    @Override
    public String description() 
    {
        return companyName +  ", " + getAddress();
    }    
}
