package com.proyectoFinal.portfolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter @Setter
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido
;    private String titulo;    
    
    @Lob
    private String descripcion;

    @Column(name = "url_img", length = 2048)
    private String image_perfil;
    
    @Column(name = "url_banner", length = 2048)
    private String banner;
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
