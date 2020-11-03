/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbornairlines;

/**
 *
 * @author JRios15_17
 */
public class EconomyTickets {
    private String name;
    private String departCity;
    private String destination;
    private int flightNum;
    private String departDate;
    private int departTime;
    private int seatNum;
    private boolean windowSeat;
    
    public EconomyTickets(){
        name="";
        departCity="";
        destination="";
        flightNum=-1;
        departDate="";
        departTime=0;
        seatNum=0;
        windowSeat=false;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the departCity
     */
    public String getDepartCity() {
        return departCity;
    }

    /**
     * @param departCity the departCity to set
     */
    public void setDepartCity(String departCity) {
        this.departCity = departCity;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the flightNum
     */
    public int getFlightNum() {
        return flightNum;
    }

    /**
     * @param flightNum the flightNum to set
     */
    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    /**
     * @return the departDate
     */
    public String getDepartDate() {
        return departDate;
    }

    /**
     * @param departDate the departDate to set
     */
    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    /**
     * @return the departTime
     */
    public int getDepartTime() {
        return departTime;
    }

    /**
     * @param departTime the departTime to set
     */
    public void setDepartTime(int departTime) {
        this.departTime = departTime;
    }

    /**
     * @return the seatNum
     */
    public int getSeatNum() {
        return seatNum;
    }

    /**
     * @param seatNum the seatNum to set
     */
    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    /**
     * @return the windowSeat
     */
    public boolean isWindowSeat() {
        return windowSeat;
    }

    /**
     * @param windowSeat the windowSeat to set
     */
    public void setWindowSeat(boolean windowSeat) {
        this.windowSeat = windowSeat;
    }
    
    public String display(){
    
        return "Passenger's Name: "+name+"\n"+"Departing City: "+departCity+"\n"+"Destination: "+destination+"\n"+"Seat Number: "+seatNum+"\n"+"Date and Time of Departure: "+departDate+" at "+departTime+"\n"+"Window Seat? "+windowSeat+"\n";
    }
    public void reserveTicket(){
    
    }
}
