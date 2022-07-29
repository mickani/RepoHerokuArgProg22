package com.proyectoFinal.portfolio.repositories;

import com.proyectoFinal.portfolio.models.PersonaModel;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Long> {
    //Creo método para luego llamarlo en el Service, en "getPersonaByApellido".
                                            //findBy... + parámetro.
    public abstract ArrayList<PersonaModel> findByApellido(String apellido);
}
