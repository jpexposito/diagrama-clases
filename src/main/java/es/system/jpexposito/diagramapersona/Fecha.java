package es.system.jpexposito.diagramapersona;

public class Fecha {

    int dia;
    int mes;
    int anio;

    /**
     * Constructor por defecto de la clase
     */
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }
    
    /**
     * Constructor con parametros de la clase
     * @param dia valor
     * @param mes valor
     * @param anio valor
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Definimos el toString de la clase
     */
    @Override
    public String  toString() {
        return anio+"/"+mes+"/"+dia;
    }


}
