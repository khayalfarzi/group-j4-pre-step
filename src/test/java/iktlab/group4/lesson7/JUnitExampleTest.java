package iktlab.group4.lesson7;

import org.junit.Assert;
import org.junit.Test;

import static iktlab.group4.lesson7.JUnitExample.findMax;
import static org.junit.Assert.assertEquals;

public class JUnitExampleTest {

    @Test
    public void testFindMax(){
        assertEquals(9 , findMax( 3 , 6 , 9));
        assertEquals(9 , findMax( 3 , 6 , 9));
        assertEquals(9 , findMax( 3 , 6 , 9));
        assertEquals(9 , findMax( 3 , 6 , 9));
    }

    @Test
    public void testFindMin(){

    }
}
