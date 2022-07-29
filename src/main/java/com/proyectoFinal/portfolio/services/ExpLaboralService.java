package com.proyectoFinal.portfolio.services;

import com.proyectoFinal.portfolio.Interface.ExpLaboralInterface;
import com.proyectoFinal.portfolio.models.ExpLaboralModel;
import com.proyectoFinal.portfolio.repositories.ExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralService implements ExpLaboralInterface {

    @Autowired
    ExpLaboralRepository expLaboralRepository;

    @Override
    public List<ExpLaboralModel> getExpLaboral() {
        List<ExpLaboralModel> expLab = expLaboralRepository.findAll();
        return expLab;
    }

    @Override
    public void saveExpLaboral(ExpLaboralModel lab) {
        expLaboralRepository.save(lab);
    }

    @Override
    public void deleteExpLaboral(Long id) {
        expLaboralRepository.deleteById(id);
    }

    @Override
    public ExpLaboralModel findExpLaboral(Long id) {
        ExpLaboralModel expLab = expLaboralRepository.findById(id).orElse(null);
        return expLab;
    }
    
    public ExpLaboralModel getExpLaboralById(Long id) {
        return expLaboralRepository.findById(id).orElse(null);
    }
}
