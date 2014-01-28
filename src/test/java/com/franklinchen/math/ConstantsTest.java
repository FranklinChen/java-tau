package com.franklinchen.math;

import static com.franklinchen.math.Constants.TAU;
import static com.franklinchen.math.Constants.τ;

import static java.lang.Math.PI;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConstantsTest {
    private final double DELTA = 0.00000000000000000000001;

    @Test
    public void twoPiIsTau() {
        assertEquals(TAU, 2.0 * PI, DELTA);
    }

    @Test
    public void τIsSynonymForTau() {
        assertEquals(TAU, τ, DELTA);
    }
}
