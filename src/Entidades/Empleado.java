/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.*;

public abstract class Empleado extends Persona{
    
    private String codigo;

    public Empleado(String dni, String nombre, String apellido, String codigo) {
        
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\nEmpleado: " + super.toString()+
                "\n codigo: " + getCodigo();
    }
 
}
