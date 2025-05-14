package com.variables.solutions;

class IceCreamCone {
    boolean inStock = true;
    int scoops = 2;
    char flavors = 'V';
    double price = 4.35;
    long itemNumber = 4857474639L;

    public static void main(String[] args) {
        IceCreamCone cone = new IceCreamCone();
        System.out.println(cone.inStock + " " + cone.scoops + " " + cone.flavors+ " " + cone.price+ " " + cone.itemNumber);
    }
}
