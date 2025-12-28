/*
 * Booking record factory for a TimeTable class
 * 
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class Booking {
    
    private final String room;
    private final String name;

    public Booking(String room, String name) {
        this.room = room;
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }
    
    
}
