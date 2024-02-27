package main.lib.houses;

import main.lib.people.Person;

public class House {
    float size;
    Person[] occupants;
    public House(float size_in, Person[] people) {
        size = size_in;
    };
    public float get_size() {
        return size;
    };

    public Person[] get_occupants() {
        return occupants;
    };

    public void set_occupants(Person[] people) {
        occupants = people;
    }
}
