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
    private String departTime;
    private int seatNum;
    private int windowSeat;
    private int seatPrice;
    
    public EconomyTickets(){
        name="";
        departCity="";
        destination="";
        flightNum=-1;
        departDate="";
        departTime="";
        seatNum=0;
        windowSeat=0;
        seatPrice=0;
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
    public String getDepartTime() {
        return departTime;
    }

    /**
     * @param departTime the departTime to set
     */
    public void setDepartTime(String departTime) {
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
    
    
    public String display(){
        boolean isWindSeat=false;
        if(windowSeat==1){
            isWindSeat=true;
        }
        return "Passenger's Name: "+name+"\n"+"Price: "+ getSeatPrice() +"\n"+"Departing City: "+departCity+"\n"+"Destination: "+destination+"\n"+"Seat Number: "+seatNum+"\n"+"Date and Time of Departure: "+departDate+" at "+departTime+"\n"+"Is Window Seat? "+isWindSeat+"\n";
    }
    public void reserveTicket(){
    
    }

    /**
     * @return the windowSeat
     */
    public int getWindowSeat() {
        return windowSeat;
    }

    /**
     * @param windowSeat the windowSeat to set
     */
    public void setWindowSeat(int windowSeat) {
        this.windowSeat = windowSeat;
    }

    /**
     * @return the seatPrice
     */
    public int getSeatPrice() {
        return seatPrice;
    }

    /**
     * @param seatPrice the seatPrice to set
     */
    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }
}
