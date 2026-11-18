public class TelephoneNumber implements Comparable<TelephoneNumber>
{
    private String countryCode;
    private String localNumber;

    public TelephoneNumber(String countryCode, String localNumber)
    {
        if(numberCheck(localNumber) && numberCheck(countryCode))
        {
            this.countryCode = countryCode;
            this.localNumber = localNumber;
        }
        else
        {
            throw new IllegalArgumentException("Telephone number must only contain numbers and cannot be empty!");
        }
    }

    private boolean numberCheck(String stringToCheck)
    {
        if(stringToCheck == null || stringToCheck.isEmpty())
        {
            return false;
        }
        int length = stringToCheck.length();
        for(int index = 0; index < length; index++)
        {
            if(!(Character.isDigit(stringToCheck.charAt(index))))
            {
                return false;
            }
        }
        return true;
    }

    @Override 
    public int compareTo(TelephoneNumber telephoneNumber)
    {
        int result = this.countryCode.compareTo(telephoneNumber.countryCode);
        if(result != 0)
        {
            return result;
        }
        return this.localNumber.compareTo(telephoneNumber.localNumber);
    }

    @Override 
    public String toString()
    {
        return "+" + this.countryCode + " " + this.localNumber;
        
    }
}