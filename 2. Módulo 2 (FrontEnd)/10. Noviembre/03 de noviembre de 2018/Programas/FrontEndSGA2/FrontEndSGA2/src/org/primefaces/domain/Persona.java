package org.primefaces.domain;

import java.io.Serializable;

public class Persona  implements Serializable{
    private Long personaId;
    private String nombres;
    private String apellidos;

    public Persona() {

    }

    public Persona(Long personaId, String nombres, String apellidos) {
        this.personaId = personaId;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}

