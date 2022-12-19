package Clases;

import Clase_Abstracta.Persona;

public class Vendedor extends Persona {
    private String tipoDeContrato;
    private String sueldoBase;

    public Vendedor(String nombre, String rut, String correoElectronico, String tipoDeContrato, String sueldoBase){
        super(nombre, rut, correoElectronico);
        setTipoDeContrato(tipoDeContrato);
        setSueldoBase(sueldoBase);
    }


    //Getters
    public String getTipoDeContrato() {
        return tipoDeContrato;
    }
    public String getSueldoBase() {
        return sueldoBase;
    }

    //Setters
    private void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }
    private void setSueldoBase(String sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "[Vendedor: " + nombre + ", " + rut + ", " + correoElectronico + ", " + tipoDeContrato + ", " + sueldoBase + "]";
    }
}
