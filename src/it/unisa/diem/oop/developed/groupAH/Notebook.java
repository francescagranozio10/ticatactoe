/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupAH;

import it.unisa.diem.oop.provided.*;

/**
 *
 * @author UTENTE
 */
public class Notebook extends Device {
    private CPUType type;
    private NBScreenType screenType;
    private boolean touchScreen;
    
    public Notebook(CPUType type, NBScreenType screenType, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.screenType = screenType;
        this.type = type;
    }
    
    public Notebook(CPUType type, NBScreenType screenType, boolean touchScreen,String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this(type, screenType, serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.touchScreen = touchScreen;
    }
    
    public CPUType getType() {
        return type;
    }
    
    public NBScreenType getScreenType () {
        return screenType;
    }
    
    @Override
    public boolean hasTouchScreen() {
        return touchScreen;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNotebook");
        sb.append(super.toString());
        sb.append("\nCPU=");
        sb.append(type);
        sb.append("\nscreenType=");
        sb.append(screenType);
        if (this.hasTouchScreen()) {
            sb.append("\ntouchScreen available");
        }
        return sb.toString();
    
    }
    
    
    
    
}
