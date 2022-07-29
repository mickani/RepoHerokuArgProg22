package com.proyectoFinal.portfolio.security.service;

import com.proyectoFinal.portfolio.security.entity.Rol;
import com.proyectoFinal.portfolio.security.enums.RolNombre;
import com.proyectoFinal.portfolio.security.repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolnombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
    
}
