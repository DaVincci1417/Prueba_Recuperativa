package Clases;

import Clase_Abstracta.Persona;

public class Cliente extends Persona{
    public Cliente(String nombre, String rut, String correoElectronico){
        super(nombre, rut, correoElectronico);
    }

    @Override
    public String toString() {
        return "[Cliente:"+nombre + ", " + rut + ", " + correoElectronico + "]";
    }
}
