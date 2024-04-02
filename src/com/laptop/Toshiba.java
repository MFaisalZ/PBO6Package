
package com.laptop;


public class Toshiba {
    private Laptop laptop;
    
    public Toshiba(Laptop laptop) {
        this.laptop = laptop;
    }
    
    void turnOnLaptop(){
        this.laptop.powerOn();
    }
    
    void turnOffLaptop(){
        this.laptop.powerOff();
    }
    void makeLaptopLouder(){
        this.laptop.volumeUp();
    }
    
    void makeLaptopSilence(){
        this.laptop.volumeDown();
    }
}
