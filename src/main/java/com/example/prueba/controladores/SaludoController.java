package com.example.prueba.controladores;

import com.example.prueba.modelo.FactorialResponse;
import com.example.prueba.modelo.Saludo;
import com.example.prueba.servicios.FactorialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/hola")
    public Saludo getSaludo() {
        return new Saludo("EquipoIncreible");
    }

    @GetMapping("/factorial/{numero}")
    public FactorialResponse getFactorial(@PathVariable int numero) {
        long factorial = FactorialService.calcularFactorial(numero);
        return new FactorialResponse(numero, factorial);
    }
}
