package org.rosalind;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by Maja on 19.12.2015.
 */
public class GiugaTest {

    @Test
    public void testThat20IsNotGiuga(){

        assertFalse(Main.checkIfNisGiuga(20));

    }


    @Test
    public void testThat19IsNotGiuga(){

        assertFalse(Main.checkIfNisGiuga(19));

    }
}
