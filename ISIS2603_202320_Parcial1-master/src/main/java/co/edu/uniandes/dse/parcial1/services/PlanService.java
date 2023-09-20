package co.edu.uniandes.dse.parcial1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcial1.entities.PlanEntity;
import co.edu.uniandes.dse.parcial1.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcial1.repositories.PlanRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PlanService {

    @Autowired
    PlanRepository planRepository;

    @Transactional
    public PlanEntity createPlan(PlanEntity planEntity) throws IllegalOperationException{

        if (planEntity.getNombre() == null)
            throw new IllegalOperationException("Nombre no valido");
        
        if (planEntity.getDescripcion() == null)
            throw new IllegalOperationException("Descripcion no valida");
        
        
    }
    
}
