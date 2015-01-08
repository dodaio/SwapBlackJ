/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author OlegK
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    test.Classes.CardTest.class,
    test.Classes.DeckTest.class,
    test.Classes.DealerHandTest.class,
    test.Classes.PlayerHandTest.class,
    test.package1.GameGUITest.class
})
public class NewTestSuite {    
}
