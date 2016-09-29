package bellamy.armard.HoldingObjects;

/**
 * Created by armardbellamy on 9/28/16.
 */
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Armard", "222-222-2222");
        phoneBook.addContact("Oscar", "123-123-1234");

       // phoneBook.printNames();
        //phoneBook.listAllEntries();
        phoneBook.reverseLookUp("123-123-1234");

    }
}
