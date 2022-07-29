package com.proyectoFinal.portfolio.Interface;

import com.proyectoFinal.portfolio.models.EducacionModel;
import java.util.List;

public interface EducacionInterface {
     //Traer educacion
    public List<EducacionModel> getEducacion();
    
    //Guardar educacion
    public void saveEducacion(EducacionModel edu);
    
    //Eliminar educacion por id
    public void deleteEducacion (Long id);
    
    //Buscar educacion por id
    public EducacionModel findEducacion(Long id);
}
