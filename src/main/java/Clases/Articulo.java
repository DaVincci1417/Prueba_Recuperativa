package Clases;

public class Articulo {
    private String nombre;
    private String tipoDeArticulo;
    private String pesoEnKg;
    private String precio;

    public Articulo(String nombre, String tipoDeArticulo, String pesoEnKg, String precio){
        setNombre(nombre);
        setTipoDeArticulo(tipoDeArticulo);
        setPesoEnKg(pesoEnKg);
        setPrecio(precio);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getTipoDeArticulo() {
        return tipoDeArticulo;
    }
    public String getPesoEnKg() {
        return pesoEnKg;
    }
    public String getPrecio() {
        return precio;
    }

    //Setters
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private void setTipoDeArticulo(String tipoDeArticulo) {
        this.tipoDeArticulo = tipoDeArticulo;
    }
    private void setPesoEnKg(String pesoEnKg){
        this.pesoEnKg = pesoEnKg;
    }
    private void setPrecio(String precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return  "[Articulo: "+nombre + ", " + tipoDeArticulo + ", "+ pesoEnKg +
                ", " + precio + "]";
    }
}
