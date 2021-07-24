/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.*;
import Entidades.Medico;
import Logica.OrdenarMedico;

public class Lista_medico {
    
    private ArrayList<Medico> med;
    
    public Lista_medico(){
        med=new ArrayList<Medico>();
    }
    
    public void setMedico(Medico medico){
        med.add(medico);
    }
    
    // busca codigo de medico
    
    public int buscar_codigo(String codigo){
        String cod="";
        for (int i = 0; i < med.size(); i++) {
            cod=med.get(i).getCodigo();
            if(cod.compareToIgnoreCase(codigo)==0){
                return i;
            }
        }
        return -1;
    }
    
    // busca dni de medico
    
    public int buscar_dni(String dni){
        String dni_medico="";
        for (int i = 0; i < med.size(); i++) {
            dni_medico=med.get(i).getDni();
            if(dni_medico.compareToIgnoreCase(dni)==0){
                return i;
            }
        }
        return -1;
    }
    
    public String reporte_especialidad(){
        String cad="";
        Collections.sort(med, new OrdenarMedico());
        Iterator it=med.iterator();
        while(it.hasNext()){
            cad+="\n"+it.next().toString()+"\n";
        }
        return cad;
    }
    
}
