package co.edu.uniandes.dse.parcial1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcial1.entities.SedeEntity;
import co.edu.uniandes.dse.parcial1.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcial1.repositories.SedeRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SedeService {
   
    @Autowired 
    SedeRepository sedeRepository;

    @Transactional
    public SedeEntity createSede(SedeEntity sedeEntity) throws IllegalOperationException {
        log.info("Inicia proceso de creación de la sede");
        
        if (sedeEntity.getNombre() == null)
            throw new IllegalOperationException("Nombre no valido");
        
        if (sedeEntity.getDireccion().length() < 10)
            throw new IllegalOperationException("Direccion no valida (debe tener mas de 10 caracteres)");

        log.info("Termina el proceso de creacion de la sede");
        return sedeRepository.save(sedeEntity);
    }
}
