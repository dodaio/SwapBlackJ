/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Deck;
import static org.junit.Assert.*;

/**
 *
 * @author OlegK
 * 
 */
public class DeckTest {
    
    /**
     *
     */
    public DeckTest() {
    }

    /**
     *
     */
    private static Deck deck1;

    /**
     *
     */
    private static Deck deck2;
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
        deck1 = new Deck();
        deck2 = new Deck();
        
      
          
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
        deck1=deck2=null;
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of Suffle method, of class Deck.
     */
    @Test
    public void testSuffle() {
        System.out.println("Suffle");
        
        for (int i=0; i<52; i++) {
            assertEquals("Decks equals",deck1.getDeck(i), deck2.getDeck(i));   
        }
        int dif=0;
        deck2.Suffle();
        for (int i=0; i<52; i++) {
            if (deck1.getDeck(i) != deck2.getDeck(i)) {
                dif++;
            }
        }
        assertTrue("shuffle2",dif > 2);  
        dif = 0;
        deck1.Suffle();
        for (int i=0; i<52; i++) {
            if (deck1.getDeck(i) != deck2.getDeck(i)) {
                dif++;
            }
        }  
        assertTrue("shuffle1 and 2",dif > 2);   
        
        System.out.println(dif);
        //List<Card> d1 = Arrays.asList(deck1);
        //List<Deck> d2 = Arrays.asList(deck2);
  
        //assertThat("shuffle1",d1, is(d2));
    }   
}
