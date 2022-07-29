package com.proyectoFinal.portfolio.repositories;

import com.proyectoFinal.portfolio.models.SkillModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <SkillModel, Long> {
    //Creo método para luego llamarlo en el Service, en "getSkillByTipo".
                                            //findBy... + parámetro.
    public abstract List<SkillModel>findByTipo(String tipo);
}
