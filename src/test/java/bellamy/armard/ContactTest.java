package bellamy.armard;

import bellamy.armard.HoldingObjects.Contact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by armardbellamy on 9/28/16.
 */
public class ContactTest {

    Contact contact;

    @Before
    public void init(){
        Contact demo = new Contact("Steve", Contact.NumberType.HOME, "444-444-4444");
    }

    @Test
    public void addNewNumberTest(){
        Contact demo = new Contact("Dave", Contact.NumberType.CELL, "505-505-5005");
        int actual = contact.getNumbersSize();
        int expected = 2;
        Assert.assertEquals("Should return 2", expected, actual);
    }


}
