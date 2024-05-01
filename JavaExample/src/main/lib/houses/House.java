package main.lib.houses;

import main.lib.people.Person;

public class House {
    //the variables below are members of the House class
    //you may notice that the class House says public, but the members below these comments say private
    //these are called "access modifiers"

    //public means any other package or class can access them

    //private means that they can only be accessed from this class

    //protected means that they can only be accessed by classes that either
    //inherit from this class, or are in the same package

    private float size;
    private Person[] occupants;

    public static int bleh  = 3;

    //when you put a [] at the end of a type (in this case, Person becomes Person[])
    //it is considered an "array"
    //arrays are effectively a list of objects
    //for more information use Google, as arrays are quite complicated


    public House(float size_in, Person[] people) {
        size = size_in;
        occupants = people;
    };

    //this is a unique kind of method called a constructor
    //it does not require a type, and MUST have the same name as the class it is in
    //When you use the new keyword, and then call this function
    //for example in Main, I call "Person james = new Surgeon();"
    //it creates an object of
    //and then runs the body of the constructor immediately

    //in this case, I would call "House house = new House(3.0f, <list of people>);"
    //and it would create a new instance of House named house, and automatically set
    //size and occupants based on the arguments passed in

    //this function exists by default so you do not HAVE to create it
    //but if you want classes to do something in particular on instantiation
    //you should define this method. most commonly used for setting variables
    //immediately as the object is instantiated
    public float get_size() {
        return size;
    };

    public Person[] get_occupants() {
        return occupants;
    };

    public void set_occupants(Person[] people) {
        occupants = people;
    }

    //above are all examples of method structure as discussed in the Main file.



    //Now that you have finished basic class structure, move on to src.main.lib.taxoffice.ATO
}
