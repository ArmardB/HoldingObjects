package bellamy.armard.HoldingObjects;

import java.util.*;

/**
 * Created by armardbellamy on 9/28/16.
 */
public class PhoneBook {

    private String name;
    private String number;
    public Map<String, String> directory = new TreeMap<String, String>();

    public PhoneBook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Map<String, String> getDirectory() {
        return directory;
    }

    public void setDirectory(Map<String, String> directory) {
        this.directory = directory;
    }

    public void addContact(String name, String number){
        directory.put(name, number);
    }

    public void removeContact(String name){
        if (!directory.containsKey(name)){
            System.out.println("Name not found in directory");
        } else {
            directory.remove(name);
        }

    }

    public String lookUp(String name) {

        if (directory.containsKey(name)){
            return "Name: " + name + " | " + "Number: " + directory.get(name);
        } else {
            return "Name not found in directory";
        }

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
        for(Map.Entry<String, String> log: directory.entrySet()){
            String key = log.getKey();
            String value = log.getValue();
            System.out.println("Name: " + key + " | " + "Number: " + value);
        }
    }

    public String reverseLookUp(String number){
        for (Map.Entry<String, String> entry: directory.entrySet()){
            if(entry.getValue().equals(number)){
                return entry.getKey();
            }
        }
        return "No match found";
    }


}
