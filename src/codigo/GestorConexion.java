/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import com.mysql.cj.conf.DatabaseUrlContainer;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author xp
 */
public class GestorConexion {
    
    Connection conn1;
    
    
    public GestorConexion(){
        conn1 = null;
        
        try{
            String url="jdbc:mysql://localhost:3306/tienda_instrumentos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";          
            String user = "root";
            String password = "root";
            
            conn1 = (Connection) DriverManager.getConnection(url, user, password);
            if(conn1 != null){
                System.out.println("Conectado a tienda_instrumentos...");
            }
        }catch(SQLException ex){
            System.out.println("ERROR: direccion o usuario/clave no válida");
        }
    }
    
    
    
    public void cerrar_conexion(){
        try{
            conn1.close();
            System.out.println("Conexion cerrada");
        
        }catch(SQLException ex){
            System.out.println("Error al cerrar la conexion");
        }
    }
    
    
    public void consulta_preparedStatement(){
        try{
            String query = "SELECT * FROM album WHERE titulo like ?";
            PreparedStatement pst = conn1.prepareStatement(query);
            pst.setString(1,"B%");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                System.out.println("ID -"+ rs.getInt("id")+ "Titulo"+ rs.getString("titulo") + "Autor"+ rs.getString("autor"));
            }
            rs.close();
            pst.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
        }
    }
    
    public void consulta_Statement(){
        try{
            Statement sta = conn1.createStatement();
            String query = "SELECT DNI,nombre, apellidos FROM clientes WHERE DNI like 'B%'";
            ResultSet rs = sta.executeQuery(query);
            
            while(rs.next()){
                System.out.println("DNI -"+ rs.getString("DNI")+ "nombre"+ rs.getString("nombre") + "Apellidos"+ rs.getString("apellidos"));
            }
            rs.close();
            sta.close();
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
        }
    }
    
    public ResultSet Mostrar_TablaClientes(){
        try{
            Statement sta = conn1.createStatement();
            String query = "SELECT * FROM clientes";
            ResultSet rs = sta.executeQuery(query);
            return rs;
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
            return null;
        }
    }
    
    public ResultSet Mostrar_TablaProductos(){
        try{
            Statement sta = conn1.createStatement();
            String query = "SELECT * FROM producto";
            ResultSet rs = sta.executeQuery(query);
            return rs;
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
            return null;
        }
    }
    
    public ResultSet Mostrar_TablaClientes_Producto(){
        try{
            Statement sta = conn1.createStatement();
            String query = "SELECT * FROM cliente_producto";
            ResultSet rs = sta.executeQuery(query);
            return rs;
        }catch(SQLException ex){
            System.out.println("ERROR: al consultar");
            ex.printStackTrace();
            return null;
        }
    }
}
