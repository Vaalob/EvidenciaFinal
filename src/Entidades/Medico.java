/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.GregorianCalendar;


public class Medico extends Persona{

    private String especialidad;
    private String codigo;
    private String dni;
    private String nombre;
    private String apellido;

    public Medico(String especialidad, String codigo, String dni, String nombre, String apellido) {
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "\n Medico:" + super.toString()+ "\n especialidad: " + getEspecialidad();
    }

    
}
