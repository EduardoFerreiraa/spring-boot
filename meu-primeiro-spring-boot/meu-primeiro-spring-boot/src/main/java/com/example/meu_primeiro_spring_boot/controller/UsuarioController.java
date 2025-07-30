package com.example.meu_primeiro_spring_boot.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.meu_primeiro_spring_boot.model.Usuario;



@RestController
public class UsuarioController {

    @PostMapping("/usuario")
    public String criarUsuario(@RequestBody Usuario usuario) {
        return "Usuario criado: " + usuario.getNome() + ", email: " + usuario.getEmail();
    }
    
}
