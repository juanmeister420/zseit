package com.company;

public class Autobus extends Samochod{

    public Autobus(String marka) {
        super(marka);
        System.out.println("Tworze autobus marki: " + marka);
    }

    public String getMarka() {
        return marka;
    }
}
