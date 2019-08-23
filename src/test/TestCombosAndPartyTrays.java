package test;

import model.ComboAndPartyTray;
import model.Sushi;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCombosAndPartyTrays {
    private ComboAndPartyTray testCombo;
    private Sushi s1 = new Sushi(5.00, "Roll 1", "S1");
    private Sushi s2 = new Sushi(4.00, "Roll 2", "S2");
    private Sushi s3 = new Sushi(3.00, "Roll 3", "S3");

    @Test
    public void testSetBrownRiceOneRoll() {
        testCombo = new ComboAndPartyTray(10.00, "Combo X", "C1", s1);
        testCombo.setBrownRice(true);
        // should be $10 + $1
        assertTrue(testCombo.isBrownRice());
        assertEquals(11.00, testCombo.getPrice());
    }

    @Test
    public void testSetBrownRiceTwoRolls() {
        testCombo = new ComboAndPartyTray(10.00, "Combo Y", "C1", s1, s2);
        testCombo.setBrownRice(true);
        // should be $10 + $2
        assertTrue(testCombo.isBrownRice());
        assertEquals(12.00, testCombo.getPrice());
    }

    @Test
    public void testSetBrownRiceThreeRolls() {
        testCombo = new ComboAndPartyTray(10.00, "Combo Y", "C1", s1, s2, s3);
        testCombo.setBrownRice(true);
        // should be $10 + $3
        assertTrue(testCombo.isBrownRice());
        assertEquals(13.00, testCombo.getPrice());
    }
}
