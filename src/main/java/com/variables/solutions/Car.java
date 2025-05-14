package com.variables.solutions;

class Car {
    String model = "Mustang";
    int topSpeed = 150;
    char color = 'r';

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.model + " " + car.topSpeed + " " + car.color);
    }
}
