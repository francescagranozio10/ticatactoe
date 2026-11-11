/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.developed.groupAH;

import java.util.Comparator;
/**
 *
 * @author UTENTE
 */
public class DeviceReleaseComparator implements Comparator<Device>{
    
    public int compare(Device o1, Device o2) {
        if (o1.getReleaseDate().equals(o2.getReleaseDate())) {
            return o1.compareTo(o2);
        }
        return o1.getReleaseDate().compareTo(o2.getReleaseDate());
    }
}
