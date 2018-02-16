package unitTesting;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TreasureChestTest {

    private TreasureChest chest7;

    @Before
    public void setUp() throws Exception {
         chest7 = new TreasureChest(7);
    }

    @Test
    public void testTreasureChest() {
        TreasureChest chest5 = new TreasureChest(5);
        assertEquals(5, chest5.getGold()); // Pass expected and actual values
    }

    @Test
    public void testGetGold() {
        int expected = 7;
        int actual = chest7.getGold(); // To test getGold I need to call getGold
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd() {
        chest7.add(2); // To test add I need to call add
        assertEquals(9, chest7.getGold());
    }

    @Test
    public void remove() {
    }

    @Test
    public void testToString() {
        assertEquals("[ 7 ]", chest7.toString());
    }
}