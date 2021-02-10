package com.daniel.teste_meta.service;

import com.daniel.teste_meta.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PaisService {

    @Autowired
    private WebClient webClientPaises;

    /*public Pais obterPorId(String codigo_do_pais) {

        Mono<Pais> monoPais = this.webClientPaises
                .method(HttpMethod.GET)
                .uri("/{codigo_do_pais}/indicator/SI.POV.DDAY?format=json", codigo_do_pais)
                .retrieve()
                .bodyToMono(Pais.class);

        return monoPais.block();
    }*/
    public Object obterPorId(String codigo_do_pais) {

        Mono<Object> monoPais = this.webClientPaises
                .method(HttpMethod.GET)
                .uri("/{codigo_do_pais}/indicator/SI.POV.DDAY?format=json", codigo_do_pais)
                .retrieve()
                .bodyToMono(Object.class);

        return monoPais.block();
    }


}
