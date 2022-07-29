package com.proyectoFinal.portfolio.repositories;

import com.proyectoFinal.portfolio.models.ProyectoModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<ProyectoModel, Long>{
    //Creo método para luego llamarlo en el Service, en "getProyectoByNombre".
                                            //findBy... + parámetro.
    public abstract ArrayList<ProyectoModel>findByNombre(String nombre); 
}
