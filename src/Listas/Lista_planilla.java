/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.*;
import Entidades.Emp_planilla;

public class Lista_planilla {
    
    private ArrayList<Emp_planilla> emp_planilla;
    
    public Lista_planilla(){
        emp_planilla=new ArrayList<Emp_planilla>();
    }
    
    public void setPlanilla(Emp_planilla emp){
        emp_planilla.add(emp);
    }
    
    public int buscar_codigo(String codigo){
        String cod="";
        for (int i = 0; i < emp_planilla.size(); i++) {
            cod=emp_planilla.get(i).getCodigo();
            if(cod.compareToIgnoreCase(codigo)==0){
                return i;
            }
        }
        return -1;
    }
    
    public int buscar_dni(String dni){
        String cod="";
        for (int i = 0; i < emp_planilla.size(); i++) {
            cod=emp_planilla.get(i).getDni();
            if(cod.compareToIgnoreCase(dni)==0){
                return i;
            }
        }
        return -1;
    }
    
    
    
    
}
