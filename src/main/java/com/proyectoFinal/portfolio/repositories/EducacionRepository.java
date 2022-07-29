package com.proyectoFinal.portfolio.repositories;
import com.proyectoFinal.portfolio.models.EducacionModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<EducacionModel, Long>{
    //Creo método para luego llamarlo en el Service, en "getEducacionByTitulo".
                                            //findBy... + parámetro.
    public abstract List<EducacionModel> findByTitulo(String titulo);
}
