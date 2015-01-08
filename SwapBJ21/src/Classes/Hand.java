/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BK
 */
public class Hand implements Serializable{

    /**
     *
     */
    private List<Card> hand;

    @Override
    public String toString() {
        return "Hand{" + "hand=" + hand + ", \nsumOfCardValue=" + sunOfCardValue + '}';
    }

    /**
     *sum of cards
     */
    private  int sunOfCardValue ;

    /**
     *
     */
    public Hand() {
        this.sunOfCardValue = 0;
        this.hand = new ArrayList<>();
    }

    /**
     *
     *   c
     * @param c
     */
    public void add(Card c) 
        {
        hand.add(c);
        
        }
        
    /**
     *
     */
    public void clear() {
        hand.clear();
        sunOfCardValue = 0;
    }

    /**
     *
     *  
     * @return 
     */
    public Card getLast() {
        return (Card) hand.get(hand.size()-1);
    }

    /**
     *
     *  
     * @return 
     */
    public List<Card> getHandList() {
        return hand;
    }

    /**
     *
     *  
     * @return 
     */
    public int getSumOfCardValue() {
        return sunOfCardValue;
    }

    /**
     *
     *   num
     * @param num
     */
    public void editSumOfCardValue(int num) {
        //System.out.println("sum before "+ this.sunOfCardValue );
        //System.out.println("card value "+num);
        this.sunOfCardValue = this.sunOfCardValue+num;
        //System.out.println("sum after "+ this.sunOfCardValue );
    }

    /**
     *
     *   index
     *  
     * @param index
     * @return 
     */
    public Object remove(int index) {
        return hand.remove(index);
    }         
}
    

  

