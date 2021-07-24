package Adapter;

public interface IFecha {
    public String darFormato(int n);
    public boolean esValida();
    public boolean esBisiesto();
    public boolean esIgual(Fecha f);
}
