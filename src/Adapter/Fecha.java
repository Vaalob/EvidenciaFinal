package Adapter;

import java.util.GregorianCalendar;

public class Fecha implements IFecha {
    private int año; 
    private int mes;
    private int dia;
    private int hora;    
    private int minutos;
    private static GregorianCalendar GC;
    static final int diaMes[]={0,31,29,31,30,31,30,31,31,30,31,30,31};

    public Fecha() {}    
    
    public Fecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public Fecha(int año, int mes, int dia, int hora, int minutos) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
   
    @Override
    public String darFormato(int n) {
        if(n<=9)
            return "0"+n;
        if(n>=1000)
            return String.valueOf(n%100);
        return String.valueOf(n);
    }

    @Override
    public boolean esValida() {
          boolean bandera=false;
          if(dia>=1 && dia<=diaMes[mes])
            bandera=true;   
          if(mes==2 && dia==29 && !esBisiesto())
            bandera=false;
          return bandera;           
    }
        
    @Override
    public boolean esBisiesto(){
        GC = new GregorianCalendar();
        return GC.isLeapYear(año);
    }

    @Override
    public boolean esIgual(Fecha f) {
        if(año==f.getAño() && mes==f.getMes() && dia==f.getDia() && hora==f.getHora() && minutos==f.getMinutos())
            return true;
        return false;
    }
}
