package Clases;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Articulo> articulos;
    private String precioTotal;
    private Cliente cliente;
    private Vendedor vendedor;

    public Venta(ArrayList<Articulo> articulos, String precioTotal, Cliente cliente, Vendedor vendedor) {
        setArticulos(articulos);
        setPrecioTotal(precioTotal);
        setCliente(cliente);
        setVendedor(vendedor);
    }


    //Getters
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }


    //Setters
    private void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    private void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }
    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    private void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }



    @Override
    public String toString() {
        return "[Venta: " + articulos + ", " + precioTotal + ", " + cliente + ", " + vendedor + "]";
    }
}
