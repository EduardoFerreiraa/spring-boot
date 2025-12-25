package com.minhaapi.post_projeto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class PostController {

    // Primeiro exemplo:

    @PostMapping("/saudacao")
    public String saudacaoSimples(@RequestBody String nome) {
        return "Olá" + nome + "! Bem-vindo(a)!";
    }

    // Segundo exemplo: 
    private List<String> nomes = new ArrayList<>();

    @PostMapping("/adicionar-nome")
    public String adicionarNome(@RequestBody String nome) {
        nomes.add(nome);        
        return "Nome: " + nome + " adicionado com sucesso.";
    }

    @GetMapping("/ver-nomes")
    public List<String> verNomes() {
        return nomes;
    }
    
    

}
