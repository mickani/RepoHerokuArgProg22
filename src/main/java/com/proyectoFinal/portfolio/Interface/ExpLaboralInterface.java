package com.proyectoFinal.portfolio.Interface;

import com.proyectoFinal.portfolio.models.ExpLaboralModel;
import java.util.List;

public interface ExpLaboralInterface {
    //Traer ExpLaboral
    public List<ExpLaboralModel> getExpLaboral();
    
    //Guardar ExpLaboral
    public void saveExpLaboral(ExpLaboralModel lab);
    
    //Eliminar ExpLaboral por id
    public void deleteExpLaboral (Long id);
    
    //Buscar ExpLaboral por id
    public ExpLaboralModel findExpLaboral(Long id);
}
