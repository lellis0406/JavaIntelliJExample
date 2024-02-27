package main.runtime;

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
//details for people looking at your code to read

//-------------------------------------------------------------------------------

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting.");
        //this is how you output text to the console in normal Java
        //in FTC you will NOT be using this, but it's good to know anyway

        Person john;
        //you have told the compiler there is a person named
        //john, but you haven't actually created john yet
        //this is called "declaration" or "declaring" an object
        //if you tried to do anything with john at this point
        //the program will throw an exception and stop

        Person james = new Surgeon();
        //you have told the compiler that there is a person
        //named james, and you have created them as a Surgeon
        //this is called "instantiating" or creating an instance of an object
        //you are now allowed to do anything you could do
        //with a surgeon (see surgeon type in lib.people.types) to james

        john = new Insomniac();
        //you went back and instantiated
        //john as an Insomniac

        //it's important to note that ALL non primitive or derived types (google these)
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

        if(james.work() == 3.0f) {
            //won't happen
        } else { //if the first statement isn't true
            System.out.println("normal day of work");
            //this only happens if the first statement is NOT true
        }

        /* format:
        if(<condition>) {
          <do this>
        } else if(<condition>) {
          <do this>
        } else if(<condition>) {
          <do this>
        .....
        } else {
            <do if no prior condition is filled>
        }
        */
        //yes, you CAN chain elses and ifs, but doing it too much looks ugly
        //and is difficult to read, so chain elses in moderation
        //lest you end up like this guy
        //https://imgur.com/a/FIlpWC2


        while(john.sleep() == 100.0f) { //this is false, so it will never start looping
            System.out.println("Boom!!"); //(it won't happen)
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

        //^ null pointer exception example, uncomment and compile/run to see

    }
}