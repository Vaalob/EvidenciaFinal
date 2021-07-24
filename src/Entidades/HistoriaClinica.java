/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.*;

public class HistoriaClinica {
    
    private String nro_historia;
    private GregorianCalendar fecha_apertura;
    private String cod_empleado;
    private String dni_paciente;
    private GregorianCalendar fecha_cita;
    private String servicio;
    private String cod_medico;
    private String diagnostico;

    public HistoriaClinica() {
        nro_historia="";
        fecha_apertura=new GregorianCalendar();
        cod_empleado="";
        dni_paciente="";
        fecha_cita=new GregorianCalendar();
        servicio="";
        cod_medico="";
        diagnostico="";
    }

    public HistoriaClinica(String nro_historia, GregorianCalendar fecha_apertura, String cod_empleado, String dni_paciente, GregorianCalendar fecha_cita, String servicio, String cod_medico, String diagnostico) {
        this.nro_historia = nro_historia;
        this.fecha_apertura = fecha_apertura;
        this.cod_empleado = cod_empleado;
        this.dni_paciente = dni_paciente;
        this.fecha_cita = fecha_cita;
        this.servicio = servicio;
        this.cod_medico = cod_medico;
        this.diagnostico = diagnostico;
    }

    public HistoriaClinica(String nro_historia, String cod_empleado, String dni, GregorianCalendar fecha, String cod_medico, String diagnostico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNro_historia() {
        return nro_historia;
    }

    public void setNro_historia(String nro_historia) {
        this.nro_historia = nro_historia;
    }

    public GregorianCalendar getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(GregorianCalendar fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public String getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(String cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getDni_paciente() {
        return dni_paciente;
    }

    public void setDni_paciente(String dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public GregorianCalendar getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(GregorianCalendar fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCod_medico() {
        return cod_medico;
    }

    public void setCod_medico(String cod_medico) {
        this.cod_medico = cod_medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "\n HistoriaClinica: " +
                "\n nro historia: " + getNro_historia() +
                "\n fecha apertura: " + getFecha_apertura().get(Calendar.DAY_OF_MONTH) +
                "/"+getFecha_apertura().get(Calendar.MONTH)+
                "/"+getFecha_apertura().get(Calendar.YEAR)+
                "\n codigo empleado: " + getCod_empleado() +
                "\n dni paciente: " + getDni_paciente() +
                "\n fecha cita: " + getFecha_cita().get(Calendar.DAY_OF_MONTH) +
                "/"+getFecha_cita().get(Calendar.MONTH)+
                "/"+getFecha_cita().get(Calendar.YEAR)+
                "\n servicio: " + getServicio() +
                "\n codigo medico: " + getCod_medico() +
                "\n diagnostico: " + getDiagnostico();
    }
    
    
    
    
    
    
    
    
    
}
