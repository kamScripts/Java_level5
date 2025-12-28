/* Scenario:
 * Univesity allows lecturers to borrow equipment. The equipment is available
 * 5 days a week and for 7 periods each day. When booked, the details of the 
 * booking are recorded (Booking class) When no booking is recorded, the equipment
 * is available for use.
 */
package oop.javaedu;

/**
 *
 * @author kg00k
 */
public class TimeTable {
    private final Booking [][] bookings;
    
    public TimeTable (int days, int timeslots) {
        bookings = new Booking[5][7];
    }
    
    public boolean makeBooking(int day, int timeslot, Booking b){
        if(isFree(day,timeslot)) {
            bookings[day][timeslot] = b;
            return true;
        }
        return false;
    }
    
    public boolean cancelBooking(int day, int timeslot) {
        if(!isFree(day,timeslot)) {
           bookings[day][timeslot] = null;
           return true;
        }
        return false;
    }  
    
    public Booking getBooking(int day, int timeslot) {
        return bookings[day][timeslot];
    }
    
    public boolean isFree(int day, int timeslot) {
        return bookings[day][timeslot] == null;
    }
    
    public int numberOfDays() {
        return bookings.length;
    }
    
    public int numberOfTimeslots() {
        return bookings[0].length;
    }
    
}
