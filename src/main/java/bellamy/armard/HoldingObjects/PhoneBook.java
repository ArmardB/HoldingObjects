package bellamy.armard.HoldingObjects;

import java.util.*;

/**
 * Created by armardbellamy on 9/28/16.
 */
public class PhoneBook {



    private Map<String, Contact> directory = new TreeMap<String, Contact>();


    public void addContact(String name, Contact.NumberType numberType, String number){
        directory.put(name,  new Contact(name, numberType, number));
    }

    public void removeContact(String name){
        if (!directory.containsKey(name)){
            System.out.println("Name not found in directory");
        } else {
            directory.remove(name);
        }

    }

    public Contact lookUp(String name) {

        if (directory.containsKey(name)){
            for(Map.Entry<String, Contact> mp: directory.entrySet()){
                String key = mp.getKey();
                Contact value = mp.getValue();
                System.out.println("Name: " + key + " | " + "Number(s)" + value);
            }
        } else {
            System.out.println("Name not found in directory");
        }
        return null;

    }

    public void printNames(){
        System.out.println("Names in directory: ");
        Set<String> keys = directory.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }

    public void listAllEntries(){
        System.out.println("Displaying contents of Directory: ");
        for(Map.Entry<String, Contact> log: directory.entrySet()){
            String key = log.getKey();
            Contact value = log.getValue();
            System.out.println("Name: " + key + " | " + "Number: " + value);
        }
    }

    public String reverseLookUp(String number){
        for (Map.Entry<String, Contact> entry: directory.entrySet()){
            if(entry.getValue().equals(number)){
                return entry.getKey();
            }
        }
        return "No match found";
    }


}
