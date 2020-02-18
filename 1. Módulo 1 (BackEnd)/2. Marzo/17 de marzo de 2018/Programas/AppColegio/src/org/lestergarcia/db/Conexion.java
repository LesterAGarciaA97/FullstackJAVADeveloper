package org.lestergarcia.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;

/**
 *
 * @author Lester Andrés García Aquino
 */
public class Conexion {
    private static Conexion instancia;
    private Connection conexion;
    private Statement enunciado;
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/sga2018?user=lestergarcia&password=Java2018"); 
            enunciado = conexion.createStatement();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static Conexion getInstancia(){
        //Patrón de diseño "Singleton"
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
    public ResultSet hacerConsulta(String consulta){
        ResultSet resultado = null;
        try{
            PreparedStatement procedimiento = conexion.prepareStatement(consulta);
            resultado = procedimiento.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return resultado;
    }
    public void ejecutarSentencia(String sentencia){
        try{
            enunciado.execute(sentencia);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
