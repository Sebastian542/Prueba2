package com.example.prueba.servicios;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FactorialServiceTest {

    @InjectMocks
    private FactorialService factorialService;

    @Test
    public void testCalcularFactorial() {
        // Prueba el cálculo factorial
        assertEquals(1, factorialService.calcularFactorial(0));
        assertEquals(1, factorialService.calcularFactorial(1));
        assertEquals(120, factorialService.calcularFactorial(5));

        try {
            factorialService.calcularFactorial(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("El número no puede ser negativo", e.getMessage());
        }

        verify(factorialService, times(1)).calcularFactorial(0);
        verify(factorialService, times(1)).calcularFactorial(1);
        verify(factorialService, times(1)).calcularFactorial(5);
    }
}
