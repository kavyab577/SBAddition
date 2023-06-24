package org.example;

import org.example.demo.utility.MathUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.ejml.simple.SimpleUnitTests.assertEquals;

public class MathUtilityTest {
    @Test
    public void testAddition() {
        MathUtility mathUtility = new MathUtility();
        int result = mathUtility.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAddition_Failure() {
        MathUtility mathUtility = new MathUtility();
        int result = mathUtility.add(2, 3);
        Assertions.assertNotEquals(6, result);
    }
}