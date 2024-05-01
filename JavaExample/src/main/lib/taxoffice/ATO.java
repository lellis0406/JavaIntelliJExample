package main.lib.taxoffice;

import main.lib.people.Person;

public class ATO {
    static float total_tax = 0.0f;
    static float calculate_tax(Person payer) {
        float tax = payer.work() * 13.0f;
        total_tax += tax;
        return tax;
    }

    //the static keyword is very special, and completely changes how variables and methods work.
    //when you define something as static, it is not attached to an instance of the class.
    //Instead, it is accessible through the class name itself.

    //In this example, you can access calculate_tax through ATO.calculate_tax(<person>);
    //this means that you never have to actually instantiate ATO at all.
    //when all members of a class are static, the class is considered static.
    //static classes are commonly used for objects that you will only ever need one of.

    //you CAN mix and match static and non static members.
    //when you do this, the static variables become global (accessible by all instances of the class)
    //when you use a static method, it can ONLY access static variables or methods.
    //this is useful for shared information or behaviour between instances of a class

    //Now that you have finished static classes, go to src.main.lib.people.Person
}
