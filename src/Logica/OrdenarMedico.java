/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.*;
import Entidades.Medico;

public class OrdenarMedico implements Comparator<Medico>{

    @Override
    public int compare(Medico A, Medico B) {
        return (A.getEspecialidad().compareToIgnoreCase(B.getEspecialidad())*-1);
    }
    
}
