/*
 * Apartment class stores colection of oblong objects where each Oblong
 * represents unique room in the Apartment.
 */
package oop.javaedu;

import java.util.ArrayList;

/**
 *
 * @author kg00k
 */
public class Apartment {
    private final ArrayList<Oblong>rooms;

    public Apartment() {
        rooms = new ArrayList<>();
    }
    
    public boolean addRoom(Oblong room) {
        if (rooms.contains(room)){
            return false;
        }
        rooms.add(room);
        return true;        
    }
    
    public double getRoomArea(int roomNo){
        // Room area based on room number
        if (roomNo < rooms.size()) {
           return rooms.get(roomNo).calculateArea();
        }
        return -999.9;
    }
    public double getRoomLength(int roomNo){
        // Room length based on room number
        if (roomNo < rooms.size()) {
            return rooms.get(roomNo).getLength();
        }
        return -999.9;
    }
    public double getRoomHeight(int roomNo){
        // Room height based on room number
        if (roomNo < rooms.size()) {
            return rooms.get(roomNo).getHeight();
        }
        return -999.9;
    }
    
    
}
