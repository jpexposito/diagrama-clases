package es.system.jpexposito.diagramapersona;

public class Persona extends Nombre{
    
    private Nif nif;
    private Fecha fechaNac;
    //private Nombre nombre;
    //String nombre;
    //String apellidos;

    /**
     * Constructor por defecto
     */
    public Persona () {
        //this.getApellidos();
    }
    
    public Nif getNif() {
        return this.nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public Fecha getFechaNac() {
        return this.fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    /** 
    public Nombre getNombre() {
        return this.nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
    **/

    
}

