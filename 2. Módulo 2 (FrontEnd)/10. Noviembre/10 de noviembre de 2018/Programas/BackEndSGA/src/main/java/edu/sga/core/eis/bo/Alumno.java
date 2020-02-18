package edu.sga.core.eis.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="alumno")
@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigoAlumno")
    private Long codigoAlumno;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="nombres")
    private String nombres;
    @Column(name="fechaNacimiento")
    private Date fechaNacimiento;
    @Column(name="carne")
    private String carne;
}
