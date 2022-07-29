package com.proyectoFinal.portfolio.security.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginUsuario {

    @NotNull
    private String nombreUsuario;
    @NotNull
    private String password;
}
