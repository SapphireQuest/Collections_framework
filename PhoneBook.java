import java.util.*;

public class PhoneBook
{
    private final TreeMap<TelephoneNumber, TelephoneEntry> entries = new TreeMap<>();

    public boolean addEntry(TelephoneEntry telephoneEntry)
    {
        TelephoneNumber key = telephoneEntry.getTelephoneNumber();
        if(entries.containsKey(key))
        {
            return false;
        }
        entries.put(key, telephoneEntry);
        return true;
    }

    public void display()
    {
        System.out.println();
        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = entries.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            Map.Entry<TelephoneNumber, TelephoneEntry> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue().description());    
        }
        System.out.println();
    }

}
