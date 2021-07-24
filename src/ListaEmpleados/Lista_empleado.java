package ListaEmpleados;

import Entidades.Empleado;
import java.util.ArrayList;

public class Lista_empleado {
    
    private final String nombre_hospital = "Hospital Acatecuro";
    
    private static Lista_empleado unicaInstancia;
    
    private Lista_empleado()
    {
        ArrayList empleados = new ArrayList();
    }
    
    public static Lista_empleado getUniqueInstance()
    {
        if(unicaInstancia == null)
            unicaInstancia = new Lista_empleado();
        return unicaInstancia;
    }
    
    @Override
    public String toString()
    {
        return nombre_hospital;
    }
}
