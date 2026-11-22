public class PhoneDirectory
{
    public static void main(String[] args)
    {
        TelephoneNumber telephoneNumber1 = new TelephoneNumber("48", "111111111");
        TelephoneNumber telephoneNumber2 = new TelephoneNumber("48", "333333333");
        TelephoneNumber telephoneNumber3 = new TelephoneNumber("7", "111111111");
        TelephoneNumber duplicateNumber = new TelephoneNumber("7", "111111111");

        Address address1 = new Address("Piotrkowska", "12", "Lodz");
        Address address2 = new Address("Krakowska", "62", "Warszawa");
        Address address3 = new Address("Main Square", "1", "London");

        Person person1 = new Person("Jan", "Kowalski", telephoneNumber1, address1);
        Person person2 = new Person("Natalia", "Lewandowska", telephoneNumber2, address2);
        Person person3 = new Person("John", "Doe", telephoneNumber3, address3);
        Person duplicatePerson = new Person("Jacek", "Konieczny", duplicateNumber, address1);

        TelephoneNumber telephoneNumber4 = new TelephoneNumber("80", "555555555");
        TelephoneNumber telephoneNumber5 = new TelephoneNumber("80", "666666666");
        TelephoneNumber telephoneNumber6 = new TelephoneNumber("7", "777777777");

        Address address4 = new Address("Politechniki", "46", "Lodz");
        Address address5 = new Address("Warszawska", "87", "Krakow");
        Address address6 = new Address("Kennedy", "3", "Dallas");

        Company company1 = new Company("Mcdonald", telephoneNumber4, address4);
        Company company2 = new Company("KFC", telephoneNumber5, address5);
        Company company3 = new Company("Burger King", telephoneNumber6, address6);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry(person1);
        phoneBook.addEntry(person2);
        phoneBook.addEntry(person3);
        phoneBook.addEntry(company1);
        phoneBook.addEntry(company2);
        phoneBook.addEntry(company3);

        if(!phoneBook.addEntry(duplicatePerson))
        {
            System.out.println("Duplicate Entry!");
        }

        phoneBook.display();

        TelephoneNumber numberA = new TelephoneNumber("48", "111111111");
        TelephoneNumber numberB = new TelephoneNumber("48", "111111111");

        System.out.println("Same object (==):    " + (numberA == numberB));
        System.out.println("Same content (equals): " + numberA.equals(numberB));
        System.out.println("compareTo result:    " + numberA.compareTo(numberB));
    }
}
