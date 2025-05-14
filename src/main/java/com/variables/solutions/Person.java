package com.variables.solutions;
//!                             Declare the appropriate variables for class.
//!                                 Output variable values to console,
class Person {
    //height
    double height = 5.9;
    //age
    int age = 28;
    //gender
    char gender = 'M';
    //weight
    double weight = 180;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.height + " " + person.age + " " + person.gender+ " " + person.weight);
    }
}
