/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.package1;

import Classes.Game;
import Package.GameGUI;
import Package.SaveGUI;
import Classes.Card;
import Classes.DealerHand;
import Classes.PlayerHand;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OlegK
 * test All scores, load and save
 */
public class GameGUITest {
        
    /**
     *
     */
    public GameGUITest() {
        //this.<> = new GameGUI();
    }
   
    /**
     *
     */
    private static PlayerHand ph;

    /**
     *
     */
    private static DealerHand dh;

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
    private static Card clubs9;

    /**
     *
     */
    private static Card clubs7;
    
    /**
     *
     */
    private static GameGUI gameGui;

    /**
     *
     */
    private static Game game;

    /**
     *
     */
    private static GameGUI gameGui2;

    /**
     *
     */
    private static Game game2;

    /**
     *
     */
    private static String path;
    
    int numFilesBefore,

    /**
     *
     */
    numFilesAfter;
    
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
        clubs9 = new Card(1,9,false,"/Package/images/Cards/resize to 90X135/c9.png",9);
        clubs7 = new Card(1,7,false,"/Package/images/Cards/resize to 90X135/c9.png",7);
        
        ph = new PlayerHand();
        dh = new DealerHand();
        gameGui = new GameGUI();
        game = new Game();
        gameGui2 = new GameGUI();
        game2 = new Game();
        path = testPathCreator();
       
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
        ph = null;
        dh = null;
        hearts2 = hearts14 = diamonds14 = clubs14 = clubs11 = clubs9 = clubs7 = null;        
        path = null;
    }
            
    /**
     * Test of main method, of class GameGUI.
     * Test winnerCheck and Scores
     * @return 
     */
    
     private static String testPathCreator() {    // helper function
        CharSequence win = "Win";
        CharSequence mac = "Mac";
        CharSequence linux = "Lin";
        String tempPath = null;

        String name = System.getProperty("os.name");

        if (name.contains(win)) {
            tempPath = "C:\\BlackJackTest\\";
            new File(tempPath).mkdir();
        }
        if (name.contains(mac)) {
            tempPath = "BlackJackTest/";
            new File(tempPath).mkdir();
        }
        if (name.contains(linux)) {
            tempPath = "BlackJackTest/";
            new File(tempPath).mkdir();
        }
        return tempPath;
    }

    /**
     *
     */
    @Test
    public void testMain() {
        System.out.println("main");
        //String[] args = null;
        
        ph.add(clubs14);  //11
        ph.add(hearts14); //12
        dh.add(diamonds14);    //11
        dh.add(clubs9);        //20
        
        game.setDealerHand(dh);
        game.setPlayerHand(ph);
        gameGui.setGamy(game);
        gameGui.winnerCheck();
    
        assertTrue("Player 0 Dealer 1", game.getDealerWin() == 1 && game.getPlayerWin() == 0);
        assertTrue("score is -12",game.getScore() == -12);
        
        // Save game in unique name
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        try {
        numFilesBefore = listOfFiles.length;
        gameGui.saveGameToFile(path + "//uniqueSaveGame.gm");
        } catch (IOException ex) {
                Logger.getLogger(SaveGUI.class.getName()).log(Level.SEVERE, null, ex);
          }  
        
        File [] listOfFilesAfter = folder.listFiles();
        numFilesAfter = listOfFilesAfter.length;
    
        assertEquals("1 file added", numFilesBefore+1, numFilesAfter);
        game2 = game;
        
        // load the game uniqueSaveGame.gm
        try {
            game2 = gameGui2.loadGameFromFile(path + "//uniqueSaveGame.gm");
        } catch (IOException ex) {
            Logger.getLogger(GameGUITest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Check if parameters are same
        assertEquals("score", game.score, game2.score);
        assertEquals("dealerWin", game.dealerWin, game2.dealerWin);
        assertEquals("playerWin", game.playerWin, game2.playerWin);
        
        ph.add(clubs14);  //13
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 0 Dealer 2", game.getDealerWin() == 2 && game.getPlayerWin() == 0);
        assertTrue("score is -25",game.getScore() == -25);
        
        ph.add(clubs7);   //20
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 0 Dealer 3", game.getDealerWin() == 3 && game.getPlayerWin() == 0);
        assertTrue("score is -45",game.getScore() == -45);
        
        ph.add(diamonds14);  //21
        game.setPlayerHand(ph);
        gameGui.winnerCheck();
        assertTrue("Player 1 Dealer 3", game.getDealerWin() == 3 && game.getPlayerWin() == 1);
        assertTrue("score is -24",game.getScore() == -24);
        
        dh.add(diamonds14);  //21
        game.setDealerHand(dh);
        gameGui.winnerCheck();
        assertTrue("Player 1 Dealer 4", game.getDealerWin() == 4 && game.getPlayerWin() == 1);
        assertTrue("score is -45",game.getScore() == -45);
        
        dh.add(hearts14);  //22
        game.setDealerHand(dh);
        gameGui.winnerCheck();
        assertTrue("Player 2 Dealer 4", game.getDealerWin() == 4 && game.getPlayerWin() == 2);
        assertTrue("score is -24",game.getScore() == -24); 
        
        listOfFiles = folder.listFiles();    // delete all test files
        for (int i = 0; (i < listOfFiles.length); i++) {
              listOfFiles[i].delete();
        }
        folder.delete();      // delete test folder
        
       
    }  
}
