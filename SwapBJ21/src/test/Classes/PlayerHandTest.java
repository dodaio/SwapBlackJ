/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Classes;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Card;
import Classes.PlayerHand;
import static org.junit.Assert.*;

/**
 *
 * @author OlegK
 * Test of add method, of class DealerHand.
 */
public class PlayerHandTest {
    
    /**
     *
     */
    public PlayerHandTest() {
    }
    
    /**
     *
     */
    private static PlayerHand ph;

    /**
     *
     */
    private static Card hearts2;

    /**
     *
     */
    private static Card hearts14;

    /**
     *
     */
    private static Card diamonds14;

    /**
     *
     */
    private static Card clubs14;

    /**
     *
     */
    private static Card clubs11;

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
        hearts2 = new Card(3,2,false,"/Package/images/Cards/resize to 90X135/h2.png",2);
        hearts14 = new Card(3,14,false,"/Package/images/Cards/resize to 90X135/h14.png",11);
        diamonds14 = new Card(2,14,false,"/Package/images/Cards/resize to 90X135/d14.png",11);
        clubs14 = new Card(1,14,false,"/Package/images/Cards/resize to 90X135/c14.png",11);
        clubs11 = new Card(1,11,false,"/Package/images/Cards/resize to 90X135/c11.png",10);

    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
        ph = null;
        hearts2 = hearts14 = diamonds14 = clubs14 = clubs11 = null;
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        ph = new PlayerHand();
    }

    /**
     * Test of getSumOfCardValue method, of class PlayerHand.
     */
    @Test
    public void testGetSumOfCardValue() {
        System.out.println("getSumOfCardValue");
        assertEquals("sum 0", 0, ph.getSumOfCardValue());
        ph.add(clubs14);
        assertEquals("sum 11", 11, ph.getSumOfCardValue());           
        ph.add(hearts2);
        assertEquals("sum 13", 13, ph.getSumOfCardValue());
        ph.add(hearts14);
        assertEquals("sum 14", 14, ph.getSumOfCardValue());
        ph.add(clubs11);
        assertEquals("sum 24", 24, ph.getSumOfCardValue());
        ph.add(diamonds14);
        assertEquals("sum 25", 25, ph.getSumOfCardValue());   
    }


    /**
     * Test of add method, of class PlayerHand.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int numCards=0;
        assertEquals("0 cards", 0, ph.getHandList().size());
        ph.add(clubs14);
        assertEquals("1 cards", 1, ph.getHandList().size());
        ph.add(hearts2);
        assertEquals("2 cards", 2, ph.getHandList().size());   
    }
    
}
