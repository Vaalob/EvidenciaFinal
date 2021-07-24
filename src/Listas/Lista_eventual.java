/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import java.util.*;
import Entidades.Emp_eventual;

public class Lista_eventual {
    
    private ArrayList<Emp_eventual> emp_eventual;
    
    public Lista_eventual(){
        emp_eventual=new ArrayList<Emp_eventual>();
    }
    
    public void setEventual(Emp_eventual emp){
        emp_eventual.add(emp);
    }
    
    public int buscar_dni(String dni){
        String cod="";
        for(int i=0; i<emp_eventual.size(); i++){
            cod=emp_eventual.get(i).getDni();
            if(cod.compareToIgnoreCase(dni)==0){
                return i;
            }
        }
        return -1;
    }
    
    public int buscar_codigo(String codigo){
        String cod="";
        for(int i=0; i<emp_eventual.size(); i++){
            cod=emp_eventual.get(i).getCodigo();
            if(cod.compareToIgnoreCase(codigo)==0){
                return i;
            }
        }
        return -1;
    }
    
}
