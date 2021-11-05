package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
            // begin loop
        while (counter < personArray.length) {
//            for (int i = 0; i < personArray.length; i++) {
                result += personArray[counter].toString();
                counter++;
//            }
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int counter = 0;
        // identify terminal condition
        //terminal condition is length of personArray
        // identify increment
        //increment goes up by 1
        // use the above clauses to declare for-loop signature
            // begin loop
        for (int i = 0; i < personArray.length; i++) {
            result += personArray[counter].toString();
            counter++;
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        int counter = 0;

        // identify array's type
        // identify array's variable-name
        
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Person name : personArray) {
            result += personArray[counter].toString();
            counter++;
            
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
