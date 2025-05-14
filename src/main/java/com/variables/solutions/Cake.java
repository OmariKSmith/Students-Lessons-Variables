package com.variables.solutions;

class Cake {
    boolean inStock = true;
    double price = 4.50;
    int layers = 3;
    char size = 'L';
    long itemNumber = 83454544456794366L;

    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake.inStock + " " + cake.price + " " + cake.layers + " " + cake.size + " " + cake.itemNumber);
    }
}
