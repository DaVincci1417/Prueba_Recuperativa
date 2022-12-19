package Clase_Abstracta;

public abstract class Persona{
    protected String nombre;
    protected String rut;
    protected String correoElectronico;

    public Persona(String nombre, String rut, String correoElectronico){
        setNombre(nombre);
        setRut(rut);
        setCorreoElectronico(correoElectronico);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setRut(String rut) {
        this.rut = rut;
    }
    private void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
