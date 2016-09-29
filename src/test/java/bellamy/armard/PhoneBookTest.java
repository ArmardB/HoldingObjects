package bellamy.armard;

import bellamy.armard.HoldingObjects.Contact;
import bellamy.armard.HoldingObjects.PhoneBook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/28/16.
 */
public class PhoneBookTest {

    PhoneBook phoneBook;

    @Before
    public void init(){
        phoneBook = new PhoneBook();
        phoneBook.addContact("Armard", Contact.NumberType.CELL,"222-222-2222");
    }

    @Test
    public void lookupTest(){
        phoneBook.addContact("Armard", Contact.NumberType.CELL,"222-222-2222");
        Contact actual = phoneBook.lookUp("Armard");
        String expected = "Name: Armard | Number: 222-222-2222";
        Assert.assertEquals("Should return 222-222-2222", expected, actual);

    }

    @Test
    public void addNumber(){
        phoneBook.addContact("Oscar",Contact.NumberType.HOME, "123-123-1234");
        Integer actual = phoneBook.directory.size();
        Integer expected = 2;
        Assert.assertEquals("Should return 1", expected, actual);

    }

    @Test
    public void removeContactTest(){
        phoneBook.addContact("Oscar", Contact.NumberType.FAX, "123-123-1234");
        phoneBook.removeContact("Oscar");
        Integer actual = phoneBook.directory.size();
        Integer expected = 1;
        Assert.assertEquals("Should return 1", expected, actual);
    }

    @Test
    public void reverseLookUpTest(){
        String actual = phoneBook.reverseLookUp("222-222-2222");
        String expected = "Armard";
        Assert.assertEquals("Should return Armard", expected,actual);
    }

}
