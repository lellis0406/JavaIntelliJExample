package main.lib.people;

public abstract class Person {
    public abstract float work();

    public abstract float sleep();

    public abstract float eat();

    //Abstraction and extending (inheritance) are the basis of Object Oriented Programming (OOP)

    //When you "inherit" from another class (see src.main.lib.people.types for examples of using the extend keyword)
    //You inherit all if its variables and methods. Effectively, you use it as a basis for the new class.
    //When a class inherits from another, it is considered a child of that other class,
    //and the other class is called the parent.

    //Using the abstract keyword for classes allows you to define abstract methods
    //that are not implemented in the parent class, but MUST be implemented in the child class.
    //You cannot actually create instances of abstract classes; they are only used as a basis
    //for other classes to inherit from.

    //For more information on OOP, I will again direct you to google;
    //it is a very complicated topic that unfortunately I won't have the time to properly detail
}
