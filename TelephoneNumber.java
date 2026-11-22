import java.util.Objects;

public class TelephoneNumber implements Comparable<TelephoneNumber>
{
    private final String countryCode;
    private final String localNumber;

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
        int result = compareAsNumbers(this.countryCode, telephoneNumber.countryCode);
        if(result != 0)
        {
            return result;
        }
        return compareAsNumbers(this.localNumber, telephoneNumber.localNumber);
    }

    private int compareAsNumbers(String first, String second)
    {
        if(first.length() != second.length())
        {
            return Integer.compare(first.length(), second.length());
        }
        return first.compareTo(second);
    }

    @Override 
    public boolean equals(Object other)
    {
        if(this == other)
        {
            return true;
        }
        if(!(other instanceof TelephoneNumber))
        {
            return false;
        }
        TelephoneNumber otherNumber = (TelephoneNumber) other;
        return countryCode.equals(otherNumber.countryCode) && localNumber.equals(otherNumber.localNumber);
    }

    @Override 
    public int hashCode()
    {
        return Objects.hash(countryCode, localNumber);
    }

    @Override 
    public String toString()
    {
        return "+" + this.countryCode + " " + this.localNumber;
        
    }
}