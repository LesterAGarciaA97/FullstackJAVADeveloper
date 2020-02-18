package edu.sga.core.bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import edu.sga.core.eis.bo.Alumno;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.primefaces.event.RowEditEvent;

@ManagedBean (name="alumnoBean")
@RequestScoped
public class AlumnoBean {
    private ArrayList<Alumno> alumnos;
    private Alumno alumnoSeleccionado;
    
    public AlumnoBean(){
        
    }
    
    @PostConstruct
    public void inicializar(){
        try{
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet("http://localhost9300/api/v1/alumno");
        getRequest.addHeader("accept","application/jason");
        HttpResponse response = httpClient.execute(getRequest);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Failed: HTTP error code: " + response.getStatusLine().getStatusCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            JsonParser jsonParser = new JsonParser();
            JsonArray arrayFromString = null;
            String output = "";
            while((output = br.readLine()) != null){
                arrayFromString = jsonParser.parse(output).getAsJsonArray();
                alumnos = new ArrayList<Alumno>();
            }
            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
            for (JsonElement elemento : arrayFromString) {
                alumnos.add(gson.fromJson(elemento,Alumno.class));
            }
            httpClient.getConnectionManager().shutdown();
            alumnoSeleccionado = new Alumno();
        }catch(ClientProtocolException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        alumnos.add(new Alumno(1L, "Pérez","Juan",new Date(),"2018001"));
    }
    public void editListener(RowEditEvent event){
        Alumno alumno = (Alumno)event.getObject();
        for (int index = 0; index < alumnos.size(); index++) {
            if (alumnos.get(index).getCodigoAlumno()== alumno.getCodigoAlumno()) {
                alumnos.set(index,alumno);
                break;    
            }
        }
    }
    public void agregar(){
        alumnos.add(alumnoSeleccionado);
        alumnoSeleccionado = null;
    }
    public void eliminar(){
        alumnos.remove(alumnoSeleccionado);
    }
    public void reiniciarAlumnoSeleccionado(){
        alumnoSeleccionado = new Alumno();
    }
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos){
        this.alumnos = alumnos;
    }
    public Alumno getAlumnoSeleccionado() {
        return alumnoSeleccionado;
    }
    public void setAlumnoSeleccionado(Alumno alumnoSeleccionado) {
        this.alumnoSeleccionado = alumnoSeleccionado;
    }
}
