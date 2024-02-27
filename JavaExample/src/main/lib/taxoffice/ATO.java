package main.lib.taxoffice;

import main.lib.people.Person;

public class ATO {
    static float total_tax = 0.0f;
    static float calculate_tax(Person payer) {
        float tax = payer.work() * 13.0f;
        total_tax += tax;
        return tax;
    }
}
