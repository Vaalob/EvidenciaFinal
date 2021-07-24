
package Presentacion;
import datos.Lector;
import java.io.*;
import Listas.*;
import java.util.*;
import Entidades.*;

public class Ejecutar {

    private static GregorianCalendar fecha;
    
    public static void main(String[] args) throws IOException {
        Emp_planilla emp_planilla;
        Emp_eventual emp_eventual;
        Medico medico;
        Paciente paciente;
        Cita cita;
        HistoriaClinica historiaClinica;
        Lista_cita lista_cita=new Lista_cita();
        Lista_eventual lista_eventual=new Lista_eventual();
        Lista_historia lista_historia=new Lista_historia();
        Lista_medico lista_medico=new Lista_medico();
        Lista_paciente lista_paciente=new Lista_paciente();
        Lista_planilla lista_planilla=new Lista_planilla();
        int opc=0, hora, minutos;
        String dni, nombre, apellido, codigo;
        String especialidad, nro_historia;
        String cod_empleado, cod_medico, diagnostico;
        int dia, mes, año;
        do{
            System.out.println("\n..:::::: Sistema Hospital ::::::..\n"+
                    "\n [1]. Registrar Medico"+
                    "\n [2]. Registrar Paciente"+
                    "\n [3]. Registrar Cita"+
                    "\n [4]. Registrar Historial"+
                    "\n [5]. Lista Medicos"+
                    "\n [6]. Lista Pacientes"+
                    "\n [7]. Salir...");
            do{
                opc=Integer.parseInt(Lector.leer("Ingrese opcion: "));
            }while(opc<=0 || opc>9);
            switch(opc){
                case 1: // registrar medico
                    System.out.println("\n Registro de Medico: \n");
                    do{
                        dni=Lector.leer("Dni: ");
                    }while(lista_medico.buscar_dni(dni)>=0 || lista_paciente.buscar_dni(dni)>=0);
                    nombre=Lector.leer("Nombre: ");
                    apellido=Lector.leer("Apellido: ");
                    do{
                        codigo=Lector.leer("Codigo: ");
                    }while(lista_medico.buscar_codigo(codigo)>=0);    
                    especialidad=Lector.leer("Especialidad: ");
                    medico=new Medico(dni, nombre, apellido, codigo, especialidad);
                    lista_medico.setMedico(medico);
                    break;
                case 2: // registrar paciente
                    System.out.println("\n Registro de Paciente: \n");
                    paciente=new Paciente();
                    do{
                        dni=Lector.leer("Dni: ");
                    }while(lista_paciente.buscar_dni(dni)>=0 || lista_eventual.buscar_dni(dni)>=0
                            || lista_planilla.buscar_dni(dni)>=0 || lista_medico.buscar_dni(dni)>=0);
                    nombre=Lector.leer("Nombre: ");
                    apellido=Lector.leer("Apellido: ");
                    do{
                        nro_historia=Lector.leer("Nro de historia: ");
                    }while(lista_paciente.buscar_nro_historia(nro_historia));
                    paciente=new Paciente(dni, nombre, apellido, nro_historia);
                    lista_paciente.setPaciente(paciente);
                    break;
                case 3: // registrar cita
                    System.out.println("\n Registrar Cita: \n");
                    cita=new Cita();
                    do{
                        dni=Lector.leer("Dni del paciente: ");
                    }while(lista_paciente.buscar_dni(dni)<0);
                    do{
                        System.out.println("Fecha y Hora:");
                        do{
                            dia=Integer.parseInt(Lector.leer("Dia: "));
                            mes=Integer.parseInt(Lector.leer("Mes: "));
                            año=Integer.parseInt(Lector.leer("Año YYYY: "));
                        }while(!validarFecha(dia, mes, año));
                        hora=Integer.parseInt(Lector.leer("Hora: "));
                        minutos=Integer.parseInt(Lector.leer("Minutos: "));
                        fecha = new GregorianCalendar();
                    }while(lista_cita.buscar_cita_paciente(dni, fecha)); 
                   do{
                       cod_empleado=Lector.leer("Codigo Empleado: ");
                   }while(lista_planilla.buscar_codigo(cod_empleado)<0 && lista_eventual.buscar_codigo(cod_empleado)<0);
                   do{
                       cod_medico=Lector.leer("Codigo Medico: ");
                   }while(lista_cita.cantidad_cita_medico(cod_medico, fecha)>16 || lista_cita.buscar_cita_medico(cod_medico, fecha)
                           || lista_medico.buscar_codigo(cod_medico)<0);
                   cita=new Cita(dni, cod_empleado, cod_medico, fecha);
                   lista_cita.setCita(cita);
                   break;
                case 4: // registrar historial clinico
                    System.out.println("\n Registro de Historia Clinica: \n");
                    historiaClinica=new HistoriaClinica();
                    do{
                        nro_historia=Lector.leer("Nro de historia: ");
                    }while(!lista_paciente.buscar_nro_historia(nro_historia));
                    do{
                        cod_empleado=Lector.leer("Codigo de Empleado: ");
                    }while(lista_planilla.buscar_codigo(cod_empleado)<0 && lista_eventual.buscar_codigo(cod_empleado)<0);
                    do{
                        dni=Lector.leer("Dni paciente: ");
                    }while(lista_paciente.buscar_dni(dni)<0);
                    do{
                        System.out.println("\n Fecha de Cita: ");
                        dia=Integer.parseInt(Lector.leer("Dia: "));
                        mes=Integer.parseInt(Lector.leer("Mes: "));
                        año=Integer.parseInt(Lector.leer("Año YYYY: "));
                    }while(!validarFecha(dia, mes, año));
                    fecha=new GregorianCalendar(año, mes, dia);
                    do{
                        cod_medico=Lector.leer("Codigo de medico: ");
                    }while(lista_medico.buscar_codigo(cod_medico)<0);
                    diagnostico=Lector.leer("Diagnostico: ");
                    historiaClinica=new HistoriaClinica(nro_historia, cod_empleado, dni,
                            fecha, cod_medico, diagnostico);
                    lista_historia.setHistoria(historiaClinica);
                    break;
                case 5: // lista medicos desc
                    System.out.println(lista_medico.reporte_especialidad());
                    break;
                case 6: // listar pacientes por medico, en el historial
                    ArrayList<String> lista=new ArrayList<String>();
                    dni="";
                    System.out.println("\n Pacientes atendidos por un medico: \n");
                    do {
                        cod_medico=Lector.leer("Codigo: ");
                    } while (lista_medico.buscar_codigo(cod_medico)<0);
                    lista=lista_historia.busca_pacientes_medico(cod_medico);
                    // isEmpty ? Lista esta vacia
                    if(lista.isEmpty()){
                        System.out.println("\n Medico no atendio pacientes aun!...");
                    }else{
                        for (int i = 0; i < lista.size(); i++) {
                            dni=lista.get(i);
                            System.out.println(lista_paciente.mostrar_por_dni(dni));
                         }
                    }
                    
                    break;
                case 7:
                    break;
            }

        }while(opc!=7);  
    }
    
    public static boolean esBisiesto(int año){
        return ((año%4==0 && año%100!=0)||año%400==0);
    }
      
    public static boolean validarFecha(int dia,int mes,int año){
          int diaMes[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
          boolean bandera=false;
          switch(mes){
              case 2:
                  if(esBisiesto(año)){
                      if(dia>=1 && dia<=29){
                          bandera=true;
                      }
                  }
                  else{
                      if(dia>=1 && dia<=diaMes[mes]){
                          bandera=true;
                      }
                  };
                  break;
              default:
                      if(dia>=1 && dia<=diaMes[mes]){
                          bandera=true;   
                      }
          }
        return bandera;
    }
    
    
}