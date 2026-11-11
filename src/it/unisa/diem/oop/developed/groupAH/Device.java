package it.unisa.diem.oop.developed.groupAH;

import java.time.LocalDate;

/**
 *
 * @author UTENTE
 */
public abstract class Device implements Comparable<Device> {
    private String serialNumber;
    private LocalDate releaseDate;
    private int RAMsize;
    private int storageCapacity;
    
    public Device (String serialNumber, int year, int month, int dayOfMonth, int RAMsize, int storageCapacity) {
        this.serialNumber = serialNumber;
        this.releaseDate =  LocalDate.of(year,month,dayOfMonth);
        this.RAMsize = RAMsize;
        this.storageCapacity = storageCapacity;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    
    public int getRAMsize() {
        return RAMsize;
    }
    
    public int getStorageCapacity () {
        return storageCapacity;
    }
    
    public int getAgeInYears() {
        return java.time.Period.between(releaseDate, LocalDate.now()).getYears();
    }
    
    public abstract boolean hasTouchScreen();
    
    
    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        
        if (this.getClass() != other.getClass()) return false;
        
        Device d = (Device) other;
        return this.serialNumber.equals(d.serialNumber);
            
    }
    
    @Override
    public int hashCode() {
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
    
    @Override 
    public final int compareTo (Device d) {
        return this.serialNumber.compareToIgnoreCase(d.serialNumber);
    }
    
    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nserialNumber= ");
        sb.append(getSerialNumber());
        sb.append("\nreleaseDate= ");
        sb.append(getReleaseDate());
        sb.append("\nRAMsize= ");
        sb.append(getRAMsize());
        sb.append("\nstorageCapacity= ");
        sb.append(getStorageCapacity());
        return sb.toString();
    }
    
    
    
    
}