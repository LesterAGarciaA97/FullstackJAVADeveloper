package org.primefaces.bean;

import org.primefaces.domain.Persona;
import org.primefaces.event.RowEditEvent;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean (name = "personaBean")
@RequestScoped
public class PersonaBean {
    private List<Persona> personas;
    private  Persona personaSeleccionada;
    public PersonaBean(){

    }
    public void inicializar(){
        for (Persona persona : personas = new ArrayList<Persona>()) {

        }
        personas.add(new Persona(personaId: 1L, nombres: "Edwin",apellidos: "Tumax"));
        personas.add(new Persona(personaId: 2L, nombres:"Juan", apelidos:"Perez"));
        personas.add(new Persona(personaId: 3L, nombres:"Roberto", apelidos:"Martinez"));
        personaSeleccionada = new Persona();
    }
    public void editListener(RowEditEvent event){
        Persona persona = (Persona) event.getObject();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getPersonaId() == persona.getPersonaId()){
                personas.set(i,persona);
                break;
            }
        }
    }
    public void reiniciarPersonaSeleccionada(){
        personaSeleccionada = new Persona();
    }
    public void agregar(){
        personas.add(personaSeleccionada);
        personaSeleccionada = null;
    }
    public void eliminar(){
        personas.remove(personaSeleccionada);
        personaSeleccionada = null;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }
}
