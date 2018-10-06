
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ModelAgenda {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    private String nombre = " ";
    private String email = " ";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método que realiza las siguietnes acciones:
     * 1.- Conecta con la base agenda_mvc.
     * 2.- Consulta todo los registros de la tabla contactos.
     * 3.- Obtiene el nombre y el email y los guarda en las variables globales
     * nombre y email.
     */
    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda_mvc", "user_mvc", "pass_mvc.2018");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM contactos;");
            rs.last();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelAgenda 001: " + err.getMessage());
        }

    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al primer registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverPrimerRegistro(){
        try {
            if(rs.isFirst()==false){
            rs.first();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al siguiente registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverSiguienteRegistro(){
        try {
            if(rs.isLast()== false){
            rs.next();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al anterior registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverAnteriorRegistro(){
        try {
            if(rs.isFirst() == false){
            rs.previous();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al ultimo registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverUltimoRegistro(){
        try {
            if(rs.isLast() == false){
            rs.last();
            nombre = rs.getString("nombre");
            email = rs.getString("email");
            }
        } catch (SQLException ex) {
           Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
          
    
    /**
     * 1.- Craer un nuevo registro y almacenar en la base e datos
     * 2.- obtener el valor del nombre rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email rs y guardarlo en la variable email
     */
    public void insertar(){
        try {

            String sql = "INSERT INTO contactos (nombre, email)" + "values("+nombre+", "+email+");";
            System.out.println(sql);
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Registro exitoso");
            } catch (SQLException ex) {
            Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    /**
     * 1.- guarda los cambios realizados al registro seleccionado
     * 2.- obtener el valor del nombre rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email rs y guardarlo en la variable email
     */
    public void modificarCambiosRegistro(){
        try {

    String sql = "UPDATE contactos set email = "+email+" where nombre = "+nombre+";";
    System.out.println(sql);
    st.executeUpdate(sql);
    JOptionPane.showMessageDialog(null,"Registro actualizado");
    } catch (SQLException ex) {
    Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    /**
     * 1.- muestra un mensaje preguntando si el usuario desea borrar el registro
     * 2.- obtener el valor del nombre rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email rs y guardarlo en la variable email
     */
    public void eliminarMensajeRegistro(){
        try {

        String sql = "DELETE from contactos where nombre = "+nombre+" and email = "+email+";";
        System.out.println(sql);
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Registro eliminado");
        } catch (SQLException ex) {
        Logger.getLogger(ModelAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
    }

