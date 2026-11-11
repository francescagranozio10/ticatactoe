/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupAH;
import it.unisa.diem.oop.provided.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;



/**
 *
 * @author UTENTE
 */
public class DeviceStore implements Filterable{
    private String name;
    private Set<Device> store;
    
    public DeviceStore(String name) {
        store = new TreeSet<>();
        this.name = name;
    }
    
    public DeviceStore(String name, Comparator<Device> c) {
        store = new TreeSet<>(c);
        this.name = name;
    }
    
    public void addDevice(Device d) {
        if(!store.add(d)) {
            throw new DeviceInsertionException ("Dispositivo già presente. Non inserito\n");
        }
    }
    
    @Override
    public DeviceStore filter(DeviceFilter d, Comparator<Device> c) {
        DeviceStore filteredDevices;
        if (c==null)
            filteredDevices = new DeviceStore(name);
        else {
            filteredDevices = new DeviceStore(name, c);
        }
        for (Device dev : store) {
            if(d.checkDevice(dev))
                filteredDevices.store.add(dev);
        }
        return filteredDevices;
    }
    
    @Override 
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.append(" contains " + store.size() + " items.\n" );
        sb.append("Printing: \n");
        for (Device dev : store) {
            sb.append("\n****");
            sb.append(dev);
        }
        return sb.toString();
    }
}
