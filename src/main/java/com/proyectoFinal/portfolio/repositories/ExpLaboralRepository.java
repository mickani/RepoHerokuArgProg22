package com.proyectoFinal.portfolio.repositories;
import com.proyectoFinal.portfolio.models.ExpLaboralModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLaboralRepository extends JpaRepository<ExpLaboralModel, Long>{
    //Creo método para luego llamarlo en el Service, en "getExpLaboralByEmpresa".
                                            //findBy... + parámetro.
    public abstract List<ExpLaboralModel> findByEmpresa(String empresa);
}
