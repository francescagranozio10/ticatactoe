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
public class Smartphone extends Device {
    private MobileCPUType cpu;
    private float screenSizeInch;
    
    public Smartphone(MobileCPUType cpu, float screenSizeInch, String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        super(serialNumber, year, month, dayOfMonth, RAMsize, storageCapacity);
        this.cpu = cpu;
        this.screenSizeInch = screenSizeInch;
    }
    
    public MobileCPUType getCpu() {
        return cpu;
    }
    
    public float getscreenSizeInch() {
        return screenSizeInch;
    }
    
    @Override
    public boolean hasTouchScreen() {
        return true;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nSmartphone");
        
        sb.append(super.toString());
        sb.append("\nCPU= ");
        sb.append(cpu);
        sb.append("\nscreenSizeInch= ");
        sb.append(screenSizeInch);
        
        return sb.toString();
        
    }
    
    
}
