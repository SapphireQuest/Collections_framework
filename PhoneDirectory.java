import java.util.*;

public class PhoneDirectory 
{
        public static void main(String[] args)
        {
            TelephoneNumber telephoneNumber1 = new TelephoneNumber("48", "111111111");
            TelephoneNumber telephoneNumber2 = new TelephoneNumber("48", "333333333");
            TelephoneNumber telephoneNumber3 = new TelephoneNumber("11", "111111111");
          
            Address address1 = new Address("Piotrkowska", "12", "Lodz");
            Address address2 = new Address("Krakowska", "62", "Warszawa");
            Address address3 = new Address("Main Square", "1", "London");

            Person person1 = new Person("Jan", "Kowalski", telephoneNumber1, address1);
            Person person2 = new Person("Natalia", "Lewandowska", telephoneNumber2, address2);
            Person person3 = new Person("John", "Doe", telephoneNumber3, address3);

            TelephoneNumber telephoneNumber4 = new TelephoneNumber("80", "555555555");
            TelephoneNumber telephoneNumber5 = new TelephoneNumber("80", "666666666");
            TelephoneNumber telephoneNumber6 = new TelephoneNumber("11", "777777777");
          
            Address address4 = new Address("Politechniki", "46", "Lodz");
            Address address5 = new Address("Warszawska", "87", "Krakow");
            Address address6 = new Address("Kennedy", "3", "Dallas");

            Company company1 = new Company("Mcdonald", telephoneNumber4, address4);
            Company company2 = new Company("KFC", telephoneNumber5, address5);
            Company company3 = new Company("Burger King", telephoneNumber6, address6);


            TreeMap<TelephoneNumber, TelephoneEntry> phoneBook = new TreeMap<>();
            phoneBook.put(telephoneNumber1, person1);
            phoneBook.put(telephoneNumber2, person2);
            phoneBook.put(telephoneNumber3, person3);
            phoneBook.put(telephoneNumber4, company1);
            phoneBook.put(telephoneNumber5, company2);
            phoneBook.put(telephoneNumber6, company3);

            System.out.println();
            Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = phoneBook.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                Map.Entry<TelephoneNumber, TelephoneEntry> entry = iterator.next();
                System.out.println(entry.getKey() + " - " + entry.getValue().description());    
            }
            System.out.println();

        }
}
