package com.variables.solutions;

class TV {
    boolean isOn = true;
    int volume = 10;
    int channel = 5;
    boolean wifiEnabled = false;

    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.isOn + " " + tv.volume + " " + tv.channel+ " " + tv.wifiEnabled);
    }
}
