package main;

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

        if (james.work() == 4.0f) { //spoiler: this is true
            System.out.println("A good day's work.");
        }

        /* format:
        if(<condition>) {
          <do this>
        }
        */

        if (james.work() == 3.0f) {
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


        while (john.sleep() == 100.0f) { //this is false, so it will never start looping
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

        //THE COMPILER IS YOUR BEST FRIEND! Do not forget this. The compiler is very descriptive with errors
        //IF you know how to properly read it. Always read the compiler output when it fails.
        //If you don't understand, throw the key phrases from the output into google and StackOverflow will
        //nearly always give a concise answer.


    }

    public int example(int example_input_1, float example_input_2) {
        //this is a METHOD.
        //methods are members of classes (main is a method too) that are basically
        //blocks of code that you can call by an alias, which is the word before the brackets
        //in this case, example

        //methods have inputs (referred to as arguments)
        //these are set between the brackets in its definition (see above with int example_input 1 and 2)

        //if you give a method a type (see above how I said this method was an int?)
        //you must return (using the return keyword) an output of the specified type
        return 3;
        //the only exception to this is the void type, then you do NOT need to return anything.
        //however, "return;" can still be used to break out of the function early if necessary


        //to call a method once it has been defined, use object.methodname(arguments)
        //you may call methods in your current object (in this case, main) without specifying the object
        //for this function in this class, you may call it as "example(1, 1.5f);"
        //or if you had an integer named int1 and a float named float1,
        //"example(int1, float1);"

    }

        //Now that you have finished basic logic and structure, go to src.main.lib.houses.House

}