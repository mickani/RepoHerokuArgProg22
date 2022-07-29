package com.proyectoFinal.portfolio.services;

import com.proyectoFinal.portfolio.Interface.SkillInterface;
import com.proyectoFinal.portfolio.models.SkillModel;
import com.proyectoFinal.portfolio.repositories.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements SkillInterface {

    @Autowired
    SkillRepository skillRepository;

    @Override
    public List<SkillModel> getSkill() {
        List<SkillModel> skill = skillRepository.findAll();
        return skill;
    }

    @Override
    public void saveSkill(SkillModel skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public SkillModel findSkill(Long id) {
SkillModel skill = skillRepository.findById(id).orElse(null);
        return skill; 
    }
    
    public List<SkillModel> getSkillByTipo(String tipo) {
        return skillRepository.findByTipo(tipo);
    }
    
    public SkillModel getSkillById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
    /*public ArrayList<SkillModel> getAllSkills() {
        return (ArrayList<SkillModel>) skillRepository.findAll();
    }

    public SkillModel saveSkill(SkillModel skill) {
        return skillRepository.save(skill);
    }

    public boolean removeSkill(Long skillId) {
        try {
            skillRepository.deleteById(skillId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public SkillModel findById (Long skillId){
        return skillRepository.findById(skillId).orElseGet(null);
    }*/

}
