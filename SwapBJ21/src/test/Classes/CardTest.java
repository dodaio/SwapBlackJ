/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Classes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Card;
import static org.junit.Assert.*;

/**
 *
 * @author OlegK
 * test testEquals
 */
public class CardTest {

    /**
     *
     */
    private static Object card1;

    /**
     *
     */
    private static Object card2;

    /**
     *
     */
    private static Object card3;
    
    /**
     *
     */
    public CardTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
         card1=new Card(2,11,false,"/Package/images/Cards/resize to 90X135/d11.png",10);
         card2=new Card(2,11,false,"/Package/images/Cards/resize to 90X135/d11.png",10);
         card3=null;
        
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
        card1=card2=card3=null;
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        assertEquals("equals1",card1, card2);
        assertFalse("equals2",card1.equals(card3));
        //change card2, also tests setValue
        ((Card)card2).setValue(5);                     
        assertFalse("equals3",card1.equals(card2));
        }  
}
