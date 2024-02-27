package main.runtime;

import main.lib.houses.House;
import main.lib.people.types.Insomniac;
import main.lib.people.Person;
import main.lib.people.types.Surgeon;

// keep an eye out for "//<content>" or:

/*
<content>
*/

//these are called comments; you will be using them a lot to document your code
//and I will be using them in this project to talk about things

//they don't actually do anything in the code; they are just a way for you to add
//details for people reading

//-------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting.");
        //this is how you output text to the console in normal Java
        //in FTC you will NOT be using this, but it's good to know anyway

        Person john;
        //you have told the compiler there is a person named
        //john, but you haven't actually created john yet

        Person james = new Surgeon();
        //you have told the compiler that there is a person
        //named james, and you have created them as a Surgeon

        john = new Insomniac();
        //you went back and told the compiler that john
        //is an insomniac

        //it's important to note that ALL non primitive or derived types (google it)
        //require that you use the new keyword as above when instantiating.

        //---------------------------------------------------------------------------

        if(james.work() == 4.0f) { //spoiler: this is true
            System.out.println("A good day's work.");
        }

        /* format:
        if(<condition>) {
          <do this>
        }
        */

        while(john.sleep() == 100.0f) {// this is false, so it will never start looping
            System.out.println("Boom!!");//(it won't happen)
        }

        /* format:
        while(<condition>) {
          <do this>
        }
        */

        //for loops are a little harder to explain, so see this link:
        //https://www.w3schools.com/java/java_for_loop.asp

        //----------------------------------------------------------------------------

        /*
        Insomniac jane = null;
        jane.work();
        */

    }
}