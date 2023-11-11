package com.example.prueba.modelo;


public class FactorialResponse {

    private int numero;
    private long factorial;

    public FactorialResponse(int numero, long factorial) {
        this.numero = numero;
        this.factorial = factorial;
    }

    public int getNumero() {
        return numero;
    }

    public long getFactorial() {
        return factorial;
    }
}
