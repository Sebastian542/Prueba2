package com.example.prueba.servicios;

public class FactorialService {

    public static long calcularFactorial(int numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
