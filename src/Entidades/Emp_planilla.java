/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;


public class Emp_planilla extends Empleado{
    

    public Emp_planilla(String dni, String nombre, String apellido, String codigo) {
        
        super(dni, nombre, apellido, codigo);
    }

    @Override
    public String toString() {
        return "\n Empleado de planilla: " +
                super.toString();
    }

    
}
