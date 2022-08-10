package com.jpinon.the_workshop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SpecialMultiplierTest {

    public static Stream<SpecialMultiplierData> parameters() {
        return Stream.of(
                new SpecialMultiplierData(2,2,4),
                new SpecialMultiplierData(5,10,50),
                new SpecialMultiplierData(1,3,3),
                new SpecialMultiplierData(3,1,3),
                new SpecialMultiplierData(0,3,0),
                new SpecialMultiplierData(3,0,0),
                new SpecialMultiplierData(-3, 4, -12),
                new SpecialMultiplierData(3, -4, -12),
                new SpecialMultiplierData(-3,-4,12));
    }

    @ParameterizedTest(name = "multiply: {0}")
    @MethodSource("parameters")
    void multiply(SpecialMultiplierData data) {
        int result = SpecialMultiplier.multiply(data.getX(),data.getY());

        assertEquals(data.getResult(), result);
    }

}