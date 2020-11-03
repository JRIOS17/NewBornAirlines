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
public class FirstClassTickets extends BusinessTickets {
    private String wine;
    
    public FirstClassTickets(){
        wine="";
    }

    /**
     * @return the wine
     */
    public String getWine() {
        return wine;
    }

    /**
     * @param wine the wine to set
     */
    public void setWine(String wine) {
        this.wine = wine;
    }
    
    @Override
    public String display(){
    
        return super.display()+"Wine of Choice: "+wine+"\n";
    }
    
    @Override
    public void reserveTicket(){
    
    }
}
