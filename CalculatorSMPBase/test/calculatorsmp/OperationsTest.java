/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatorsmp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author ariel
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testMakeFormula() {
        System.out.println("formula creada:");
        String ExpResult = Operations.MakeFormula();
        String result = ExpResult;
        System.out.println(result);
        assertEquals(ExpResult, result);
    }

    @Test
    @DisplayName("resolver formula")
    public void testSolve() {
        System.out.println("resultado");
        String formula = (Operations.MakeFormula());
        String resulta = Operations.Solve(formula);
        System.out.println(resulta);
        //assertEquals(expResult, result);
    }
    
}
