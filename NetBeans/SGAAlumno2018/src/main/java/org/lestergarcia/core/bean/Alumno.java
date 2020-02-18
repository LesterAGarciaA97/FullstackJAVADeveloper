package org.lestergarcia.core.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo_alumno")
    private Long codigoAlumno;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="nombres")
    private String nombres;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(name="carne")
    private String carne;
}
