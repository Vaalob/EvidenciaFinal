/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.*;
import Entidades.Cita;

public class Lista_cita {
    
    private ArrayList<Cita> cit;
    
    public Lista_cita(){
        cit=new ArrayList<Cita>();
    }
    
    public void setCita(Cita cita){
        cit.add(cita);
    }
    
    public boolean buscar_cita_paciente(String dni, GregorianCalendar fecha_hora){
        String cod_dni="";
        GregorianCalendar fechahora=new GregorianCalendar();
        for (int i = 0; i < cit.size(); i++) {
            cod_dni=cit.get(i).getDni();
            fechahora=cit.get(i).getFecha_hora();
            if(cod_dni.compareToIgnoreCase(dni)==0 && fechahora.compareTo(fecha_hora)==0){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscar_cita_medico(String codigo, GregorianCalendar fecha_hora){
        String cod="";
        GregorianCalendar fechahora=new GregorianCalendar();
        for (int i = 0; i < cit.size(); i++) {
            cod=cit.get(i).getCod_medico();
            fechahora=cit.get(i).getFecha_hora();
            if(cod.compareToIgnoreCase(codigo)==0 && fechahora.compareTo(fecha_hora)==0){
                return true;
            }
        }
        return false;
    }
    
    public int cantidad_cita_medico(String codigo, GregorianCalendar fecha_hora){
        // solo interesa la fecha por dia maximo 16 citas
        String cod="";
        int contador=0;
        GregorianCalendar fecha=new GregorianCalendar();
        GregorianCalendar fecha_cita=new GregorianCalendar();
        int dia, mes, año;
        dia=fecha_hora.get(Calendar.DAY_OF_MONTH);
        mes=fecha_hora.get(Calendar.MONTH);
        año=fecha_hora.get(Calendar.YEAR);
        fecha=new GregorianCalendar(año, mes, dia);
        for (int i = 0; i < cit.size(); i++) {
            cod=cit.get(i).getCod_medico();
            dia=cit.get(i).getFecha_hora().get(Calendar.DAY_OF_MONTH);
            mes=cit.get(i).getFecha_hora().get(Calendar.MONTH);
            año=cit.get(i).getFecha_hora().get(Calendar.YEAR);
            fecha_cita=new GregorianCalendar(año, mes, dia);
            if(cod.compareToIgnoreCase(codigo)==0 && fecha.compareTo(fecha_cita)==0){
                contador++;
            }
        }
        return contador;
    }
    
}
