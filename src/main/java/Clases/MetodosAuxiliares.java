package Clases;

import java.util.ArrayList;
import java.util.Random;

public class MetodosAuxiliares {

    public String precioTotalVenta(ArrayList<Articulo> articulos){
        int precioTotal = 0;
        for(int i = 0; i < articulos.size(); i++){
            precioTotal = precioTotal + Integer.parseInt(articulos.get(i).getPrecio());
        }
        return Integer.toString(precioTotal);
    }
    public String generarRutAleatorio(){
        Random numero = new Random();
        String rutAleatorio = "";
        for(int i = 0; i < 9; i++) {
            rutAleatorio = rutAleatorio + Integer.toString(numero.nextInt(10));
        }
        return rutAleatorio;
    }
    public String generarPesoAleatorio(){
        Random numero = new Random();
        String pesoAleatorio = "";
        for(int i = 0; i < 2; i++) {
            pesoAleatorio = pesoAleatorio + Integer.toString(numero.nextInt(10));
        }
        return pesoAleatorio;
    }
    public String generarPrecioOrSueldoAleatorio(){
        Random numero = new Random();
        String sueldoAleatorio = "";
        for(int i = 0; i < 6; i++){
            sueldoAleatorio = sueldoAleatorio + Integer.toString(numero.nextInt(10));
        }
        return sueldoAleatorio;
    }
    public String tipoDeArticulo(){
        String tipoDeArticulo = "";
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0:
                tipoDeArticulo = "Cuaderno";
                break;
            case 1:
                tipoDeArticulo = "Lapiz";
                break;
            case 2:
                tipoDeArticulo = "Libro";
        }
        return tipoDeArticulo;
    }
    public String tipoDeContrato(){
        String tipoDeContrato = "";
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0:
                tipoDeContrato = "Jornada Parcial";
                break;
            case 1:
                tipoDeContrato = "Media Jornada";
                break;
            case 2:
                tipoDeContrato = "Jornada Completa";
        }
        return tipoDeContrato;
    }
    public ArrayList<Venta> buscarVentaSegunArticulo(ArrayList<Venta> ventas, String tipoDeArticulo){
        ArrayList<Venta> ventasConArticulo = new ArrayList<>();
            for (int i = 0; i < ventas.size(); i++) {
                for(int j = 0; j < ventas.get(i).getArticulos().size(); j++){
                    if (ventas.get(i).getArticulos().get(j).getTipoDeArticulo().equalsIgnoreCase(tipoDeArticulo)) {
                        ventasConArticulo.add(ventas.get(i));
                    }
                }
            }
            return ventasConArticulo;
    }
}
