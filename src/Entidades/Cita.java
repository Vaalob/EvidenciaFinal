/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.*;

public class Cita {
    
    private String dni;
    private String cod_empleado;
    private String cod_medico;
    private GregorianCalendar fecha_hora;

    public Cita() {
        dni="";
        cod_empleado="";
        cod_medico="";
        fecha_hora=new GregorianCalendar();
    }

    public Cita(String dni, String cod_empleado, String cod_medico) {
        this.dni = dni;
        this.cod_empleado = cod_empleado;
        this.cod_medico = cod_medico;
        this.fecha_hora = fecha_hora;
    }

    public Cita(String dni, String cod_empleado, String cod_medico, GregorianCalendar fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(String cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getCod_medico() {
        return cod_medico;
    }

    public void setCod_medico(String cod_medico) {
        this.cod_medico = cod_medico;
    }

    public GregorianCalendar getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(GregorianCalendar fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Override
    public String toString() {
        return "\n Cita: " + 
                "\n dni: " + getDni() +
                "\n codigo empleado: " + getCod_empleado() +
                "\n codigo medico: " + getCod_medico() +
                "\n fecha: " + getFecha_hora().get(Calendar.DAY_OF_MONTH)+
                "/"+getFecha_hora().get(Calendar.MONTH)+
                "/"+getFecha_hora().get(Calendar.YEAR)+
                "\n Hora: "+getFecha_hora().get(Calendar.HOUR)+
                ":"+getFecha_hora().get(Calendar.MINUTE);
    }
    
    
    
    
    
    
}
