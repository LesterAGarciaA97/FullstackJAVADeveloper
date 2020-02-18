package edu.sga.core.controller;

import edu.sga.core.bean.Carrera;
import java.util.ArrayList;

import java.util.List;
import javax.json.stream.JsonParser;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import java.util.ArrayList;

public class CarreraController {
    private final String URL_API = "http://localhost:8080/api/v1/carrera";
    private static CarreraController instancia;
    private Client carreraCliente = ClientBuilder.newClient();
    public static CarreraController getInstancia(){
        if (instancia == null) {
            instancia = new CarreraController();
        }
        return instancia;
    }
    public List<Carrera> getCarrera(){
        WebTarget carreraClienteTarget = carreraCliente.target(URL_API);
        GenericType<List<Carrera>> listaCarreraGeneric = new GenericType<List<Carrera>>(){};
        String json  = carreraClienteTarget.request(MediaType.APPLICATION_JSON).get(String.class);
        List<Carrera> lista = new ArrayList<Carrera>();
        JsonParser parser = new JsonParser();
        JsonArray gsonArray = parser.parse(json).getAsJsonArray();
        for (JsonElement objeto : gsonArray) {
            Carrera elemento = new Gson().fromJson(objeto,Carrera.class);
                    lista.add(elemento);
        }
        return null;
    }
    public void agregar(Carrera elemento){
        WebTarget carreraClienteTarget = carreraCliente.target(URL_API);
        Form formulario = new Form();
        formulario.param("descripcion", elemento.getDescripcion());
        carreraClienteTarget.request(MediaType.APPLICATION_FORM_URLENCODED).post(Entity.entity(formulario, MediaType.APPLICATION_FORM_URLENCODED));
    }
    public void eliminar(Long id){
        WebTarget carreraClienteTarget = carreraCliente.target(URL_API + "/" + id);
        carreraClienteTarget.request(MediaType.APPLICATION_JSON).delete();
    }
    public void editar(Carrera elemento){
        WebTarget carreraClienteTarget = carreraCliente.target(URL_API + "/" + elemento.getCodigoCarrera());
        Form formulario = new Form();
        formulario.param("descripcion", elemento.getDescripcion());
        carreraClienteTarget.request(MediaType.APPLICATION_FORM_URLENCODED).put(Entity.entity(formulario, MediaType.APPLICATION_FORM_URLENCODED));
    }
}
