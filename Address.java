public class Address 
{
    private String street;
    private String streetNumber;
    private String city;

    public Address(String street, String streetNumber,  String city)
    {
        if(isValid(street) && isValid(streetNumber) && isValid(city))
        {
            this.street = street;
            this.streetNumber = streetNumber;
            this.city = city;
        }
        else
        {
            throw new IllegalArgumentException("Street, street number and city cannot be empty!");
        }
    }

    
    @Override 
    public String toString()
    {
        return street + " " + streetNumber + ", " + city;
    }

    private boolean isValid(String stringToCheck)
    {
        return !(stringToCheck == null || stringToCheck.isBlank());      
    }
}
