/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author BK
 */
public final class Game implements Serializable {

    /**
     *
     */
    public Deck deck;

    /**
     *
     */
    public Hand playerHand;

    /**
     *
     */
    public Hand dealerHand;

    /**
     *
     */
    public int playerWin = 0;

    /**
     *
     */
    public int dealerWin = 0;

    /**
     *
     */
    public long score = 0;

    /**
     *
     */
    public long deckDealCounter = 0;

    @Override
    public String toString() {
        return "Game{" + "\ndeck=" + deck + ", \nplayerHand=" + playerHand + ", \ndealerHand=" + dealerHand + ", \nplayerWin=" + playerWin + ", \ndealerWin=" + dealerWin + ", \nscore=" + score + ", \ndeckDealCounter=" + deckDealCounter + '}';
    }

    /**
     *
     */
    public Game() {
    }

    /**
     *
     *   g
     * @param g
     */
    public Game(Game g) {
        this.setDealerHand(g.getDealerHand());
        this.setDealerWin(g.getDealerWin());
        this.setDeck(g.getDeck());
        this.setPlayerHand(g.getPlayerHand());
        this.setPlayerWin(g.getPlayerWin());
        this.setScore(g.getScore());
    }

    /**
     *
     *  
     * @return 
     */
    public long getDeckDealCounter() {
        return deckDealCounter;
    }

    /**
     *
     *   deckDealCounter
     * @param deckDealCounter
     */
    public void setDeckDealCounter(long deckDealCounter) {
        this.deckDealCounter = deckDealCounter;
    }

    /**
     *
     *  
     * @return 
     * @return  
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     *
     *   deck
     * @param deck
     */
    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /**
     *
     *  
     * @return 
     */
    public Hand getPlayerHand() {
        return playerHand;
    }

    /**
     *
     *   playerHand
     * @param playerHand
     */
    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    /**
     *
     *  
     * @return 
     * @return  
     */
    public Hand getDealerHand() {
        return dealerHand;
    }

    /**
     *
     *   dealerHand
     * @param dealerHand
     */
    public void setDealerHand(Hand dealerHand) {
        this.dealerHand = dealerHand;
    }

    /**
     *
     *  
     * @return 
     */
    public int getPlayerWin() {
        return playerWin;
    }

    /**
     *
     *   playerWin
     * @param playerWin
     */
    public void setPlayerWin(int playerWin) {
        this.playerWin = playerWin;
    }

    /**
     *
     *  
     * @return 
     * @return  
     */
    public int getDealerWin() {
        return dealerWin;
    }

    /**
     *
     *   dealerWin
     * @param dealerWin
     */
    public void setDealerWin(int dealerWin) {
        this.dealerWin = dealerWin;
    }

    /**
     *
     *  
     * @return 
     */
    public long getScore() {
        return score;
    }

    /**
     *
     *   score
     * @param score
     */
    public void setScore(long score) {
        this.score = score;
    }
}
