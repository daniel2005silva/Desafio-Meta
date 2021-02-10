package com.daniel.teste_meta.controller;

import com.daniel.teste_meta.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaisController {
    @Autowired
    private PaisService pais_service;

    @GetMapping("/pais/{codigo_do_pais}")
    public ResponseEntity<Object> obterPaisPorId(@PathVariable String codigo_do_pais) {

        Object pais = this.pais_service.obterPorId(codigo_do_pais);

        return ResponseEntity.ok(pais);
    }

}
