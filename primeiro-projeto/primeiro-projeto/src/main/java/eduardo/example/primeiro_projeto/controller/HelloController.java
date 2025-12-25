package eduardo.example.primeiro_projeto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String dizerOla() {
        return "Olá, mundo! Eu estou de volta.";
    }

    @GetMapping("/saudacao")
    public String saudacao() {
        return "Bem-vindo ao spring boot! Você está no caminho certo!";
    }
}
