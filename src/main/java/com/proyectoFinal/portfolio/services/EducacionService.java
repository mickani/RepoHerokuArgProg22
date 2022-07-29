package com.proyectoFinal.portfolio.services;

import com.proyectoFinal.portfolio.Interface.EducacionInterface;
import com.proyectoFinal.portfolio.models.EducacionModel;
import com.proyectoFinal.portfolio.repositories.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements EducacionInterface{     
    @Autowired
    EducacionRepository educacionRepository;
   
    @Override
    public List<EducacionModel> getEducacion() {
        List<EducacionModel> educacion = educacionRepository.findAll();
        return educacion;
    }
    @Override
    public void saveEducacion(EducacionModel edu) {
        educacionRepository.save(edu);
    }
    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
    }
    @Override
    public EducacionModel findEducacion(Long id) {
       EducacionModel educacion = educacionRepository.findById(id).orElse(null);
        return educacion;
    }
    public EducacionModel getEducationById(Long id){
        return educacionRepository.findById(id).orElse(null);
    }
}
