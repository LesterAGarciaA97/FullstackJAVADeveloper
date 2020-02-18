package edu.sga.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="carrera")
@Entity
public class Carrera implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoCarrera")
    private Long codigoCarrera;
    @Column(name="descripcion")
    private String descripcion;
}
