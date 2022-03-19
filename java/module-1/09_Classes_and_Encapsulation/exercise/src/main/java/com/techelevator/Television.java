package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public void turnOff(){
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
        currentChannel = 3;
        currentVolume = 2;
    }
    public void changeChannel(int newChannel){
        currentChannel = newChannel;
    }


}
