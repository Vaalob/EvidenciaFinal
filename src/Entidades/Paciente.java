/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;


public class Paciente extends Persona{


    public Paciente() {
   
    }

    public Paciente(String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    public Paciente(String dni, String nombre, String apellido, String nro_historia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "\n Paciente: " + super.toString();
    }

    public String getNro_historia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
