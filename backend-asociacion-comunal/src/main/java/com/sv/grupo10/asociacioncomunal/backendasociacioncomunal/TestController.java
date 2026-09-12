package com.sv.grupo10.asociacioncomunal.backendasociacioncomunal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String testConnection() {
        return "Servidor backend activo - Java 21";
    }
}