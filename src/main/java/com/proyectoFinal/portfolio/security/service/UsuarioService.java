
package com.proyectoFinal.portfolio.security.service;

import com.proyectoFinal.portfolio.security.entity.Usuario;
import com.proyectoFinal.portfolio.security.repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario>getByNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByMail(String mail){
        return usuarioRepository.existsByMail(mail);
    }
    
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
