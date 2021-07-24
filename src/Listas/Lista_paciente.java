/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.*;
import Entidades.Paciente;

public class Lista_paciente {
    
    private ArrayList<Paciente> paci;
    
    public Lista_paciente(){
        paci=new ArrayList<Paciente>();
    }
    
    public void setPaciente(Paciente paciente){
        paci.add(paciente);
    }
    
    public int buscar_dni(String dni){
        String dni_paciente="";
        for (int i = 0; i < paci.size(); i++) {
            dni_paciente=paci.get(i).getDni();
            if(dni_paciente.equals(dni)){
                return i;
            }
        }
        return -1;
    }
    
    // mostrar paciente por dni
    
    public String mostrar_por_dni(String dni){
        String cad="";
        for (int i = 0; i < paci.size(); i++) {
            if(paci.get(i).getDni().equals(dni)){
                cad+=paci.get(i).getDni()+"\n\t";
                cad+=paci.get(i).getNombre()+" ";
                cad+=paci.get(i).getApellido()+"\n";
            }
        }
        return cad;
    }

    public boolean buscar_nro_historia(String numero){
        String num="";
        for (int i = 0; i < paci.size(); i++) {
            num=paci.get(i).getNro_historia();
            if(num.compareToIgnoreCase(numero)==0){
                return true;
            }
        }
        return false;
    }
    
}
