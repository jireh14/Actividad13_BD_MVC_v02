
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAgenda;
import views.ViewAgenda;

public class ControllerAgenda {

    ModelAgenda modelAgenda;
    ViewAgenda viewAgenda;

    /**
     * Objeto de tipo ActionListener para atrapar los eventos actionPerformed y
     * llamar a los metodos para ver los registros almacenados en la bd.
     */
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewAgenda.jbtn_primero) {
                jbtn_primero_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_anterior) {
                jbtn_anterior_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_siguiente) {
                jbtn_siguiente_actionPerformed();
            } else if (e.getSource() == viewAgenda.jbtn_ultimo) {
                jbtn_ultimo_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jB_nuevo) {
                jB_nuevo_actionPerformed();
        }
            else if (e.getSource() == viewAgenda.jB_insertar) {
                jB_insertar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jB_modificar) {
                jB_modificar_actionPerformed();
            }
            else if (e.getSource() == viewAgenda.jB_eliminar) {
                jB_eliminar_actionPerformed();
            }
        }

    };

    /**
     * Constructor de Controlador para unir el ModelAgenda y ViewAgenda
     *
     * @param modelAgenda objeto de tipo ModelAgenda
     * @param viewAgenda objeto de tipo ViewAgenda
     */
    public ControllerAgenda(ModelAgenda modelAgenda, ViewAgenda viewAgenda) {
        this.modelAgenda = modelAgenda;
        this.viewAgenda = viewAgenda;
        initComponents();
        setActionListener();
        initDB();
    }

    /**
     * Método que llama al método conectarBD del modelo y muestra el nombre y
     * email del primer registro en las cajas de texto de ViewAgenda.
     */
    public void initDB(){
        modelAgenda.conectarDB();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
    }
    /**
     * Metodo para inicializar la ViewAgenda
     */
    public void initComponents() {
        viewAgenda.setLocationRelativeTo(null);
        viewAgenda.setTitle("Agenda MVC");
        viewAgenda.setVisible(true);
    }

    /**
     * Método para agregar el actionListener a cada boton de la vista
     */
    public void setActionListener() {
        viewAgenda.jbtn_primero.addActionListener(actionListener);
        viewAgenda.jbtn_anterior.addActionListener(actionListener);
        viewAgenda.jbtn_siguiente.addActionListener(actionListener);
        viewAgenda.jbtn_ultimo.addActionListener(actionListener);
        viewAgenda.jB_nuevo.addActionListener(actionListener);
        viewAgenda.jB_insertar.addActionListener(actionListener);
        viewAgenda.jB_modificar.addActionListener(actionListener);
        viewAgenda.jB_eliminar.addActionListener(actionListener);
        
    }

    /**
     * Método para ver el primer registro de la tabla contactos
     */
    private void jbtn_primero_actionPerformed() {
        modelAgenda.moverPrimerRegistro();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        //invocar al metodo moverPrimerRegistro
        //mostrar nombre en la vista
        //mostar email en la vista
    }

    /**
     * Método para ver el registro anterior de la tabla contactos
     */
    private void jbtn_anterior_actionPerformed() {
        modelAgenda.moverAnteriorRegistro();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        //invocar al metodo moverAnteriorRegistro
        //mostrar nombre en la vista
        //mostar email en la vista
    }

    /**
     * Método para ver el último registro de la tabla contactos
     */
    private void jbtn_ultimo_actionPerformed() {
        modelAgenda.moverUltimoRegistro();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        //invocar al metodo moverUltimoRegistro
        //mostrar nombre en la vista
        //mostar email en la vista
    }

    /**
     * Método para ver el siguiente registro de la tabla contactos
     */
    private void jbtn_siguiente_actionPerformed() {
        modelAgenda.moverSiguienteRegistro();
        viewAgenda.jtf_nombre.setText(modelAgenda.getNombre());
        viewAgenda.jtf_email.setText(modelAgenda.getEmail());
        //invocar al metodo moverSiguienteRegistro
        //mostrar nombre en la vista
        //mostar email en la vista
    }
    private void jB_nuevo_actionPerformed(){
        System.out.print("Boton Nuevo");
        viewAgenda.jtf_nombre.setText("");                     
        viewAgenda.jtf_email.setText("");             
             
    }
    private void jB_eliminar_actionPerformed() {
    System.out.println("Eliminar");
    modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
    modelAgenda.setEmail(viewAgenda.jtf_email.getText());
    modelAgenda.eliminarMensajeRegistro();
    //invoca el metodo eliminar
    //elimina un registro seleccionado
    }

    private void jB_insertar_actionPerformed() {
    modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
    modelAgenda.setEmail(viewAgenda.jtf_email.getText());
    modelAgenda.insertar();
    }

    private void jB_modificar_actionPerformed() {
    System.out.println("modificar");
    modelAgenda.setNombre(viewAgenda.jtf_nombre.getText());
    modelAgenda.setEmail(viewAgenda.jtf_email.getText());
    modelAgenda.modificarCambiosRegistro();
    }
}
            

