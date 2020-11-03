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
public class BusinessTickets extends EconomyTickets {
    private String snacks;
    
    public BusinessTickets(){
        snacks="";
    }

    /**
     * @return the snacks
     */
    public String getSnacks() {
        return snacks;
    }

    /**
     * @param snacks the snacks to set
     */
    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
    
    @Override
    public String display(){
    
        return super.display()+"Snack of choice: "+snacks+"\n";
    }
    
    @Override
    public void reserveTicket(){
    
    }
}
