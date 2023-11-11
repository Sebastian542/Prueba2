package com.example.prueba.modelo;

public class Saludo {

    private String mensaje;

    public Saludo(String equipo) {
        this.mensaje = "Hola desde " + equipo + "!";
    }

    public String getMensaje() {
        return mensaje;
    }
}
