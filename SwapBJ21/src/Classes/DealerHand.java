/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author BK
 */
public class DealerHand extends Hand implements Serializable{

    /**
     *
     */
    public DealerHand() {
    }

    /**
     *
     *   index
     *  
     * @param index
     * @return 
     */
    @Override
    public Object remove(int index) {
        return super.remove(index); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     *   num
     * @param num
     */
    @Override
    public void editSumOfCardValue(int num) {
        super.editSumOfCardValue(num); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     *  
     * @return 
     */
    @Override
    public int getSumOfCardValue() {
        return super.getSumOfCardValue(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     *  
     * @return 
     */
    @Override
    public List<Card> getHandList() {
        return super.getHandList(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     *  
     * @return 
     */
    @Override
    public Card getLast() {
        return super.getLast(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void clear() {
        super.clear(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     *   c
     * first ace is 11 if has less than sum of 10
     * @param c
     */
    @Override
    public void add(Card c) {
       
        //System.out.println(" sum d before"+super.getSumOfCardValue());
       
        int tempValue = 0;
        if (c.getRank()==14)
        {
            if (super.getSumOfCardValue()>=11)
                tempValue = 1;
            else
                tempValue = 11;
        }
        else
            tempValue=c.getValue();
        super.editSumOfCardValue(tempValue);
        super.add(c);
        //System.out.println("sum d after"+super.getSumOfCardValue());
    

    }

    /**
     *
     *  
     * @return 
     * @return  
     */
    public String getSunOfCardValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
