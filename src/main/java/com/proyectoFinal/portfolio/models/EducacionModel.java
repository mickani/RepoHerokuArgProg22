package com.proyectoFinal.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "education")
@Getter @Setter
public class EducacionModel {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nivelInstitucion;
    private String fecha;

    private String titulo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    } 
}
