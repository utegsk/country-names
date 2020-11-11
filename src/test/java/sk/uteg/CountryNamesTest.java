package sk.uteg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CountryNamesTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCountryName() {
        assertEquals("Slovensko", CountryNames.getCountryName("SK", "sk"));
    }
}
