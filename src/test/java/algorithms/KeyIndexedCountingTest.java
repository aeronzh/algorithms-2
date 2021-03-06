package algorithms;

import algorithms.KeyIndexedCounting.Element;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyIndexedCountingTest {
    @Test
    public void testSort() {
        Element[] elements = new Element[20];
        elements[0] = new Element("Anderson", 2);
        elements[1] = new Element("Brown", 3);
        elements[2] = new Element("Davis", 3);
        elements[3] = new Element("Garcia", 4);
        elements[4] = new Element("Harris", 1);
        elements[5] = new Element("Jackson", 3);
        elements[6] = new Element("Johnson", 4);
        elements[7] = new Element("Jones", 3);
        elements[8] = new Element("Martin", 1);
        elements[9] = new Element("Martinez", 2);
        elements[10] = new Element("Miller", 2);
        elements[11] = new Element("Moore", 1);
        elements[12] = new Element("Robinson", 2);
        elements[13] = new Element("Smith", 4);
        elements[14] = new Element("Taylor", 3);
        elements[15] = new Element("Thomas", 4);
        elements[16] = new Element("Thompson", 4);
        elements[17] = new Element("White", 2);
        elements[18] = new Element("Williams", 3);
        elements[19] = new Element("Wilson", 4);

        KeyIndexedCounting.sort(elements, 6);

        assertEquals(elements[0], new Element("Harris", 1));
        assertEquals(elements[1], new Element("Martin", 1));
        assertEquals(elements[2], new Element("Moore", 1));
        assertEquals(elements[3], new Element("Anderson", 2));
        assertEquals(elements[4], new Element("Martinez", 2));
        assertEquals(elements[5], new Element("Miller", 2));
        assertEquals(elements[6], new Element("Robinson", 2));
        assertEquals(elements[7], new Element("White", 2));
        assertEquals(elements[8], new Element("Brown", 3));
        assertEquals(elements[9], new Element("Davis", 3));
        assertEquals(elements[10], new Element("Jackson", 3));
        assertEquals(elements[11], new Element("Jones", 3));
        assertEquals(elements[12], new Element("Taylor", 3));
        assertEquals(elements[13], new Element("Williams", 3));
        assertEquals(elements[14], new Element("Garcia", 4));
        assertEquals(elements[15], new Element("Johnson", 4));
        assertEquals(elements[16], new Element("Smith", 4));
        assertEquals(elements[17], new Element("Thomas", 4));
        assertEquals(elements[18], new Element("Thompson", 4));
        assertEquals(elements[19], new Element("Wilson", 4));
    }
}
