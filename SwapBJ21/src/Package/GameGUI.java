/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import Classes.Card;
import Classes.DealerHand;
import Classes.Deck;
import Classes.Game;
import Classes.PlayerHand;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author BK
 */
public class GameGUI extends javax.swing.JFrame {

    /**
     *
     */
    private int jlabelCounterDealer = 0;

    /**
     *
     */
    private int jlabelCounterPlayer = 0;

    /**
     *
     */
    private Game gamy;

    /**
     *
     */
    HashMap<String, JLabel> jlabelByName;

    /**
     *
     */
    private void setWinLoose() {
        JLabel x = this.winLoose;
        x.setOpaque(false);
        x.setVisible(true);
        x.setText(gamy.playerWin + ":" + gamy.dealerWin);
    }

    /**
     *
     */
    private void setScore() {
        JLabel x = this.scoreLabel;
        x.setOpaque(false);
        x.setVisible(true);
        x.setText("SCORE: " + gamy.score);
    }

    /**
     * Creates new form GameGUI
     */
    public GameGUI() {
    }
        
    /**
     *
     * @param g
     */
    public void setGamy(Game g) {
        this.gamy = g;
    }

    /**
     *
     *   g
     *   freshGame
     * @param g
     * @param freshGame
     */
    public GameGUI(Game g, boolean freshGame) {
        this.gamy = g;
        //System.out.println(gamy.toString());
        initComponents();
        jlabelByName = createHashMap();
        if (freshGame) {
            this.myInit();
        } else {
            setLoadedGame();
        }
    }

    /**
     *
     */
    private void setLoadedGame() {
        String st = null;
        for (int i = 0; i < gamy.playerHand.getHandList().size(); i++) {
            st = "pCardLabel" + Integer.toString(i + 1);
            Card dCard = gamy.playerHand.getHandList().get(i);
            dCard.setSide(true);
            
            this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard.getCardFaceIcon())));
            this.jlabelByName.get(st).setVisible(true);
            jlabelCounterPlayer++;
        }
        for (int i = 0; i < gamy.dealerHand.getHandList().size(); i++) {
            st = "dCardLabel" + Integer.toString(i + 1);
            Card dCard = gamy.dealerHand.getHandList().get(i);
            
            this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard.getCardFaceIcon())));
            this.jlabelByName.get(st).setVisible(true);
            jlabelCounterDealer++;
        }
        this.setWinLoose();
        this.setScore();
        this.DeckDeal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        SettingsB = new javax.swing.JLabel();
        StandB = new javax.swing.JLabel();
        HitB = new javax.swing.JLabel();
        DeckDeal = new javax.swing.JLabel();
        dCardLabel9 = new javax.swing.JLabel();
        dCardLabel8 = new javax.swing.JLabel();
        dCardLabel7 = new javax.swing.JLabel();
        dCardLabel6 = new javax.swing.JLabel();
        dCardLabel5 = new javax.swing.JLabel();
        dCardLabel4 = new javax.swing.JLabel();
        dCardLabel3 = new javax.swing.JLabel();
        dCardLabel2 = new javax.swing.JLabel();
        dCardLabel1 = new javax.swing.JLabel();
        pCardLabel9 = new javax.swing.JLabel();
        pCardLabel8 = new javax.swing.JLabel();
        pCardLabel7 = new javax.swing.JLabel();
        pCardLabel6 = new javax.swing.JLabel();
        pCardLabel5 = new javax.swing.JLabel();
        pCardLabel4 = new javax.swing.JLabel();
        pCardLabel3 = new javax.swing.JLabel();
        pCardLabel2 = new javax.swing.JLabel();
        pCardLabel1 = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        LuckyMe_Btn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();
        winLoose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SettingsB.setAlignmentX(0.5F);
        SettingsB.setAlignmentY(0.0F);
        SettingsB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SettingsB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SettingsBMouseReleased(evt);
            }
        });
        getContentPane().add(SettingsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 356, 35, 35));

        StandB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StandB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StandBMouseReleased(evt);
            }
        });
        getContentPane().add(StandB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 130, 50));

        HitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HitBMouseReleased(evt);
            }
        });
        getContentPane().add(HitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 130, 50));

        DeckDeal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeckDeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DeckDealMouseReleased(evt);
            }
        });
        getContentPane().add(DeckDeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 36, 90, 80));
        getContentPane().add(dCardLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, 135));
        getContentPane().add(dCardLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 135));
        getContentPane().add(dCardLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 90, 135));
        getContentPane().add(dCardLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, 135));
        getContentPane().add(dCardLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 90, 135));
        getContentPane().add(dCardLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 90, 135));
        getContentPane().add(dCardLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 90, 135));
        getContentPane().add(dCardLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 90, 135));
        getContentPane().add(dCardLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 90, 135));
        getContentPane().add(pCardLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, 135));
        getContentPane().add(pCardLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 90, 135));
        getContentPane().add(pCardLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 90, 135));
        getContentPane().add(pCardLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 90, 135));
        getContentPane().add(pCardLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 90, 135));

        pCardLabel4.setToolTipText("");
        getContentPane().add(pCardLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 90, 135));
        getContentPane().add(pCardLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 135));
        getContentPane().add(pCardLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 90, 135));
        getContentPane().add(pCardLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 135));

        scoreLabel.setFont(new java.awt.Font("MorganBig", 3, 36)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        scoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 30));

        LuckyMe_Btn.setToolTipText("");
        LuckyMe_Btn.setLabel("Lucky Me");
        LuckyMe_Btn.setName("Luck Me"); // NOI18N
        LuckyMe_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuckyMe_BtnActionPerformed(evt);
            }
        });
        getContentPane().add(LuckyMe_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package/images/java src clean game.png"))); // NOI18N
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        winLoose.setFont(new java.awt.Font("MorganBig", 3, 48)); // NOI18N
        winLoose.setForeground(new java.awt.Color(255, 255, 255));
        winLoose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winLoose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(winLoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 140, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    private void SettingsBMouseReleased(java.awt.event.MouseEvent evt) {                                        
        if (gamy.getDeckDealCounter() < 2) {
            new SettingsGUI(this).setVisible(true);
        } else {
            new SettingsGUILong(this).setVisible(true);
        }

    }                                       
    private void DeckDealMouseReleased(java.awt.event.MouseEvent evt) {                                       
        gamy.setDeckDealCounter(gamy.getDeckDealCounter() + 1);
        this.dealFunc();
        /* test of values after actions
         System.out.println(dCard1.toString()+"\n"+dCard2.toString()+"\n"+dCard3.toString()+"\n"+ dCard4.toString());
         System.out.println("\n\n\n");
         System.out.println(gamy.dealerHand.toString()+"\n"+ gamy.dealerHand.getSunOfCardValue()+"\n"+gamy.playerHand.toString()+"\n"+gamy.playerHand.getSunOfCardValue());
         */

    }                                      
    private void HitBMouseReleased(java.awt.event.MouseEvent evt) {                                   

        this.afterHit();
    }                                  

    /**
     *
     */
    private void afterHit() {
        this.deckIsEmpty();
        if (gamy.playerHand.getSumOfCardValue() <= 21) {
            String st = null;
            if (this.jlabelCounterPlayer < 9) {
                this.jlabelCounterPlayer++;
                st = "pCardLabel" + Integer.toString(this.jlabelCounterPlayer);
                Card dCard = gamy.deck.getDeck(0);
                dCard.setSide(true);
                gamy.playerHand.add(dCard);

                this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard.getCardFaceIcon())));
                gamy.deck.remove(0);
                this.jlabelByName.get(st).setVisible(true);
                /*
                 System.out.println(gamy.deck.getDeck().size());
                 */
            }
        }
        if (gamy.playerHand.getSumOfCardValue() > 21) {
            this.disableClick();
            this.winnerCheck();
        }
        if (gamy.playerHand.getSumOfCardValue() == 21) {

            this.afterStand();
        }
    }

    /**
     *
     */
    private void deckIsEmpty() {
        if (gamy.deck.isEmpty()) {
            gamy.deck = new Deck();
        }
        gamy.deck.Suffle();
    }

    /**
     *
     */
    private void dealFunc() {
        String std = null;
        String stp = null;
        for (int i = 1; i < 10; i++) {
            std = "dCardLabel" + Integer.toString(i);
            jlabelByName.get(std).setVisible(false);
            stp = "pCardLabel" + Integer.toString(i);
            jlabelByName.get(stp).setVisible(false);
        }
        this.jlabelCounterDealer = 0;
        this.jlabelCounterPlayer = 0;

        gamy.dealerHand.clear();
        gamy.playerHand.clear();
        this.HitB.setVisible(true);
        this.StandB.setVisible(true);
        /*System.out.println(gamy.deck.getDeck().size());*/
        this.deckIsEmpty();
        this.setWinLoose();
        this.setScore();

        String st = null;
        if (gamy.deck.getDeck().size() < 4) {
            this.deckIsEmpty();
        }
        Card dCard1 = gamy.deck.getDeck(0);
        dCard1.setSide(true);
        gamy.dealerHand.add(dCard1);
        this.jlabelCounterDealer++;
        st = "dCardLabel" + Integer.toString(this.jlabelCounterDealer);
        this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard1.getCardFaceIcon())));
        gamy.deck.remove(0);
        this.jlabelByName.get(st).setVisible(true);

        //no settin side to true becouse dealer shows only one card
        if (gamy.deck.getDeck().size() < 4) {
            this.deckIsEmpty();
        }
        Card dCard2 = gamy.deck.getDeck(0);
        gamy.dealerHand.add(dCard2);
        this.jlabelCounterDealer++;
        st = "dCardLabel" + Integer.toString(this.jlabelCounterDealer);
        this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard2.getCardFaceIcon())));
        gamy.deck.remove(0);
        this.jlabelByName.get(st).setVisible(true);

        if (gamy.deck.getDeck().size() < 4) {
            this.deckIsEmpty();
        }
        Card dCard3 = gamy.deck.getDeck(0);
        dCard3.setSide(true);
        gamy.playerHand.add(dCard3);
        this.jlabelCounterPlayer++;
        st = "pCardLabel" + Integer.toString(this.jlabelCounterPlayer);
        this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard3.getCardFaceIcon())));
        gamy.deck.remove(0);
        this.jlabelByName.get(st).setVisible(true);

        if (gamy.deck.getDeck().size() < 4) {
            this.deckIsEmpty();
        }
        Card dCard4 = gamy.deck.getDeck(0);
        dCard4.setSide(true);
        gamy.playerHand.add(dCard4);
        this.jlabelCounterPlayer++;
        st = "pCardLabel" + Integer.toString(this.jlabelCounterPlayer);
        this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard4.getCardFaceIcon())));
        gamy.deck.remove(0);
        this.jlabelByName.get(st).setVisible(true);

        this.HitB.setVisible(true);
        this.StandB.setVisible(true);
        this.DeckDeal.setVisible(false);

        /* test of values
         System.out.println(gamy.dealerHand.toString());
         System.out.println(gamy.playerHand.toString());
         /**/
    }
    private void StandBMouseReleased(java.awt.event.MouseEvent evt) {                                     

        this.afterStand();

    }                                    

    private void BackgroundMouseClicked(java.awt.event.MouseEvent evt) {                                        

        // TODO add your handling code here:
        //luckme();
    }                                       

    private void LuckyMe_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     *
     *   fileName
     * @param fileName
     * @throws IOException
     */
    public void saveGameToFile(String fileName) throws IOException {
        FileOutputStream fileO = null;
        ObjectOutputStream os = null;
        try {
            fileO = new FileOutputStream(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            os = new ObjectOutputStream(fileO);
            os.writeObject(gamy);

            

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            os.close();
        }
        /*
        System.out.println("------\n save\n-------\n" + gamy.toString());
        */
    }

    /**
     *
     *   fileName
     *  
     * @param fileName
     * @return 
     * @throws IOException
     */
    public Game loadGameFromFile(String fileName) throws IOException {
        FileInputStream fileI = null;
        ObjectInputStream is = null;
        Game saved = null;
        try {
            fileI = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            is = new ObjectInputStream(fileI);
            saved = (Game) is.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(GameGUI.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            is.close();
        }

        /*
        System.out.println("------\nload from save\n-------\n"+saved.toString());
        */
        return saved;
    }

    /**
     *
     */
    private void disableClick() {
        this.HitB.setVisible(false);
        this.StandB.setVisible(false);
        this.deckIsEmpty();

    }

    /**
     *
     */
    private void afterStand() {
        this.disableClick();
        String st = null;

        Card dCard = null;
        if (this.jlabelCounterDealer == 2) {
            st = "dCardLabel" + Integer.toString(this.jlabelCounterDealer);
            dCard = gamy.dealerHand.getLast();
            dCard.setSide(true);
            this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard.getCardFaceIcon())));
            this.jlabelCounterDealer++;
        }
        while ((gamy.dealerHand.getSumOfCardValue() < 17) || (gamy.dealerHand.getSumOfCardValue() < gamy.playerHand.getSumOfCardValue())) {
            if (this.jlabelCounterDealer < 9) {
                st = "dCardLabel" + Integer.toString(this.jlabelCounterDealer);
                dCard = gamy.deck.getDeck(0);
                dCard.setSide(true);
                gamy.dealerHand.add(dCard);

                this.jlabelByName.get(st).setIcon(new javax.swing.ImageIcon(getClass().getResource(dCard.getCardFaceIcon())));
                gamy.deck.remove(0);
                this.jlabelByName.get(st).setVisible(true);
                /* test of values after actions
                 
                System.out.println(gamy.deck.getDeck().size());
                 */

                this.jlabelCounterDealer++;
            }
        }
        this.winnerCheck();

    }

    /**
     * check who won round
     */
    public void winnerCheck() {
        int pSum = gamy.playerHand.getSumOfCardValue();
        int dSum = gamy.dealerHand.getSumOfCardValue();
        /*
        System.out.println("player sum: "+ pSum + " ,dealer sum: "+ dSum);
        */

        if (pSum <= 21) {
            if (pSum > dSum) {
                messageBox(true);
                return;
            }
            if (pSum == dSum) {
                messageBox(false);
                return;
            }
            if (pSum < dSum) {
                if (dSum > 21) {
                    messageBox(true);
                    return;
                } else {
                    messageBox(false);
                }
            }
        } else {
            messageBox(false);
        }
    }

    /**
     *
     *   b
     * @param b
     */
    private void messageBox(boolean b) {

        if (b == true) {
            gamy.playerWin++;
            gamy.score = gamy.score + gamy.playerHand.getSumOfCardValue();
            new MessageBoxGuiWin().setVisible(true);
        } else {
            gamy.dealerWin++;
            gamy.score = gamy.score - gamy.playerHand.getSumOfCardValue();
            new MessageBoxGuiLost().setVisible(true);
        }
        
        if (this.DeckDeal != null)      
            this.DeckDeal.setVisible(true);
    }

    /**
     *
     */
    private void myInit() {
        gamy.deck = new Deck();
        gamy.dealerHand = new DealerHand();
        gamy.playerHand = new PlayerHand();
        gamy.deck.Suffle();
        this.HitB.setVisible(false);
        this.StandB.setVisible(false);
        this.LuckyMe_Btn.setVisible(false);
        this.setWinLoose();
        this.setScore();

    }

    /**
     *
     *  
     * @return 
     */
    private HashMap<String, JLabel> createHashMap() {
        HashMap<String, JLabel> labelByName = new HashMap<String, JLabel>();
        labelByName.put("dCardLabel9", dCardLabel9);
        labelByName.put("dCardLabel8", dCardLabel8);
        labelByName.put("dCardLabel7", dCardLabel7);
        labelByName.put("dCardLabel6", dCardLabel6);
        labelByName.put("dCardLabel5", dCardLabel5);
        labelByName.put("dCardLabel4", dCardLabel4);
        labelByName.put("dCardLabel3", dCardLabel3);
        labelByName.put("dCardLabel2", dCardLabel2);
        labelByName.put("dCardLabel1", dCardLabel1);

        labelByName.put("pCardLabel9", pCardLabel9);
        labelByName.put("pCardLabel8", pCardLabel8);
        labelByName.put("pCardLabel7", pCardLabel7);
        labelByName.put("pCardLabel6", pCardLabel6);
        labelByName.put("pCardLabel5", pCardLabel5);
        labelByName.put("pCardLabel4", pCardLabel4);
        labelByName.put("pCardLabel3", pCardLabel3);
        labelByName.put("pCardLabel2", pCardLabel2);
        labelByName.put("pCardLabel1", pCardLabel1);

        String std = null;
        String stp = null;
        for (int i = 1; i < 10; i++) {
            std = "dCardLabel" + Integer.toString(i);
            labelByName.get(std).setVisible(false);
            stp = "pCardLabel" + Integer.toString(i);
            labelByName.get(stp).setVisible(false);

        }

        return labelByName;
    }

    /**
     *
     *   args
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    /**
     *   args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Background;
    private javax.swing.JLabel DeckDeal;
    private javax.swing.JLabel HitB;
    private javax.swing.JButton LuckyMe_Btn;
    private javax.swing.JLabel SettingsB;
    private javax.swing.JLabel StandB;
    private javax.swing.JLabel dCardLabel1;
    private javax.swing.JLabel dCardLabel2;
    private javax.swing.JLabel dCardLabel3;
    private javax.swing.JLabel dCardLabel4;
    private javax.swing.JLabel dCardLabel5;
    private javax.swing.JLabel dCardLabel6;
    private javax.swing.JLabel dCardLabel7;
    private javax.swing.JLabel dCardLabel8;
    private javax.swing.JLabel dCardLabel9;
    private javax.swing.JLabel pCardLabel1;
    private javax.swing.JLabel pCardLabel2;
    private javax.swing.JLabel pCardLabel3;
    private javax.swing.JLabel pCardLabel4;
    private javax.swing.JLabel pCardLabel5;
    private javax.swing.JLabel pCardLabel6;
    private javax.swing.JLabel pCardLabel7;
    private javax.swing.JLabel pCardLabel8;
    private javax.swing.JLabel pCardLabel9;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel winLoose;
    // End of variables declaration                   
}
