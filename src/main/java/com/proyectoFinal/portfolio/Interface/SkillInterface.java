package com.proyectoFinal.portfolio.Interface;

import com.proyectoFinal.portfolio.models.SkillModel;
import java.util.List;

public interface SkillInterface {
    //Traer Skill
    public List<SkillModel> getSkill();
    
    //Guardar Skill
    public void saveSkill(SkillModel skill);
    
    //Eliminar Skill por id
    public void deleteSkill (Long id);
    
    //Buscar Skill por id
    public SkillModel findSkill(Long id);
}
