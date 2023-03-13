package org.example;

public class LgTV2 implements TV{
    @Override
    public void powerOn() {
        System.out.println("LG Tv - Turn On");
    }

    @Override
    public void powerOff() {
        System.out.println("LG Tv - Turn Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("LG Tv - Sound Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("LG Tv - Sound Down");
    }
}
