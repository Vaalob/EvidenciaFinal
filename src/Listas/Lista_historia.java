/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.*;
import Entidades.HistoriaClinica;

public class Lista_historia {
    
    private ArrayList<HistoriaClinica> hist;
    
    public Lista_historia(){
        hist=new ArrayList<HistoriaClinica>();
    }
    
    public void setHistoria(HistoriaClinica historia){
        hist.add(historia);
    }
    
    // ArrayList de dni de pacientes x medico
    public ArrayList<String> busca_pacientes_medico(String cod_medico){
        ArrayList<String> lista=new ArrayList<String>();
        String codigo="";
        for (int i = 0; i < hist.size(); i++) {
            codigo=hist.get(i).getCod_medico();
            if(codigo.compareToIgnoreCase(cod_medico)==0){
                lista.add(hist.get(i).getDni_paciente());
            }
        }
        return lista;
    }

    
}
