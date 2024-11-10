package com.despliegueJava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/")
    public String holaMundo() {
        return "¡Hola Mundo! Proyecto en lenguaje JAVA usando framework Spring";
    }
}
