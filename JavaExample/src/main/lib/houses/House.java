package main.lib.houses;

import main.lib.people.Person;

public class House {
    float size;
    Person[] occupants;
    public House(float size_in, Person[] people) {
        size = size_in;
    };
    //this function is called a "constructor".
    //When you use the new keyword, and then call this function
    //for example in Main, I call "Person james = new Surgeon();"
    //it creates an object
    public float get_size() {
        return size;
    };

    public Person[] get_occupants() {
        return occupants;
    };

    public void set_occupants(Person[] people) {
        occupants = people;
    }



    //Now that you have finished basic class structure, move on to src.main.lib.taxoffice.ATO
}
