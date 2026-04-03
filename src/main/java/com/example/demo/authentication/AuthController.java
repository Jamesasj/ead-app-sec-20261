package com.example.demo.authentication;

import com.example.demo.usuario.Usuario;
import com.example.demo.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        Usuario user = usuarioService.findByEmail(usuario.getEmail());
        if (user != null && user.getSenha().equals(usuario.getSenha())) {
            return "Login realizado com sucesso!";
        }
        return "Credenciais inválidas";
    }

    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }
}
