package co.edu.uniandes.dse.parcial1.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class PlanEntity extends BaseEntity {

    private String nombre;
    private String descripcion;
    private int precio;

    @PodamExclude
    @ManyToMany
    private List<SedeEntity> sedes = new ArrayList<>();
}
