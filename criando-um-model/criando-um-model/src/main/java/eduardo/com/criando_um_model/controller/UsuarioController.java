package eduardo.com.criando_um_model.controller;

import eduardo.com.criando_um_model.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuarios.add(new Usuario(1L, "Eduardo", "eduardoferreiraalmeida20@gmail.com"));
        usuarios.add(new Usuario(2L, "Giovanna", "giovannaaraujobonifacio07@gmail.com"));
        usuarios.add(new Usuario(3L, "Leonardo", "leonardo@gmail.com"));
        usuarios.add(new Usuario(4L, "Yasmin", "yasminferreiraaraujo@gmail.com"));
    }


    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarios; // Spring converte automaticamente para JSON
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }

        return null;
    }
}
