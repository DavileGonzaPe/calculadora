package com.maven.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class CalculadoraController {

    @Autowired
    private Tracer tracer;

    @GetMapping("/")
	public ResponseEntity<String> index() {
        return ResponseEntity.ok("Bienvenido a la API Calculadora");
	}

    @GetMapping("/suma")
    public ResponseEntity<Operacion> suma(@RequestParam double operando1, @RequestParam double operando2) {
        double resultado = operando1 + operando2;
        Operacion operacion = new Operacion(operando1, operando2, resultado);
        tracer.log(operacion.operacionToString("suma"));
        return ResponseEntity.ok(operacion);
    }

    @GetMapping("/resta")
    public ResponseEntity<Operacion> resta(@RequestParam double operando1, @RequestParam double operando2) {
        double resultado = operando1 - operando2;
        Operacion operacion = new Operacion(operando1, operando2, resultado);
        tracer.log(operacion.operacionToString("resta"));
        return ResponseEntity.ok(operacion);
    }
}
