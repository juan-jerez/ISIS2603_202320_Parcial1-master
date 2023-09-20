package co.edu.uniandes.dse.parcial1.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class SedeEntity extends BaseEntity{

    private String nombre;
    private String direccion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaInauguracion;

    @PodamExclude
    @ManyToMany
    private List<PlanEntity> planes = new ArrayList<>();
}