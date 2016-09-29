package bellamy.armard.HoldingObjects;

import java.util.HashMap;

/**
 * Created by armardbellamy on 9/28/16.
 */
public class Contact  {
    public enum NumberType {HOME, CELL, FAX}

    private String name;
    public HashMap<NumberType, String> numbers = new HashMap<NumberType, String>();

    public Contact(String name, NumberType numberType, String number){
        this.name = name;
        numbers.put(numberType, number);
    }

    public void addNewNumber(NumberType numberType,String number){
        numbers.put(numberType, number);
    }

    public void deleteNumber(NumberType numberType){
        numbers.remove(numberType);
    }

    public String getNumberByType(NumberType numberType) {
        return numbers.get(numberType);
    }

    public String getName(){
        return this.name;
    }

    public int getNumbersSize(){
        return numbers.size();
    }
    
    public String getNumber(String name) {
        return numbers.get(name);
    }


}
