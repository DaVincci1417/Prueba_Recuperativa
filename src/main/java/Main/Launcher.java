package Main;

import Clases.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Launcher {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        int opc;
        int desicion;
        do {
            do {
                mostrarMenu();
                opc = leer.nextInt();
                segunPrincipal(opc);
            } while (opc != 0);

            desicion = menuSalir();
        }while(desicion != 1);
    }

    //Menus
    public static void mostrarMenu() {
        System.out.println(
                "Bienvenido. Marque opcion segun corresponda:\n" +
                        "0. Salir (S/N)\n" +
                        "1. Agregar Cliente.\n" +
                        "2. Agregar Vendedores.\n" +
                        "3. Agregar Articulos.\n" +
                        "4. Agregar Ventas.\n" +
                        "5. Eliminar todos los Articulos.\n" +
                        "6. Buscar Ventas por tipo de Articulo.\n"
        );
    }
    public static int menuSalir() {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("¿Desea Salir? ingrese la opcion segun corresponda.");
            System.out.println("1. Salir.");
            System.out.println("2. Seguir en el programa.");
            opcion = leer.nextInt();
        }while(opcion != 1 & opcion != 2);

        return opcion;
    }

    //Switch para las opciones
    public static void segunPrincipal(int opc) {
        int numeroDeClientes = clientes.size();
        int numeroDeVendedores = vendedores.size();
        Random random = new Random();
        switch (opc) {
            case 0:
                break;
            case 1:
                agregarCliente("Eliezer Caniulaf", metodosAuxiliares.generarRutAleatorio(), "correo@gmail.com");
                break;
            case 2:
                agregarVendedor("Javiera Belen", metodosAuxiliares.generarRutAleatorio(), "correo@hotmail.com", metodosAuxiliares.tipoDeContrato(), metodosAuxiliares.generarPrecioOrSueldoAleatorio());
                break;
            case 3:
                agregarArticulo("Articulo", metodosAuxiliares.tipoDeArticulo(), metodosAuxiliares.generarPesoAleatorio(), metodosAuxiliares.generarPrecioOrSueldoAleatorio());
                break;
            case 4:
                agregarVenta(articulos, metodosAuxiliares.precioTotalVenta(articulos), clientes.get(random.nextInt(numeroDeClientes)), vendedores.get(random.nextInt(numeroDeVendedores)));
                break;
            case 5:
                eliminarTodosLosArticulos();
                break;
            case 6:
                buscarVenta(ventas, metodosAuxiliares.tipoDeArticulo());
                break;
            default:
                System.out.println("Agregue una opción valida");
        }
    }

    static ArrayList<Vendedor> vendedores = new ArrayList<>();
    static ArrayList<Cliente> clientes= new ArrayList<>();
    static ArrayList<Articulo> articulos= new ArrayList<>();
    static ArrayList<Venta> ventas= new ArrayList<>();

    static MetodosAuxiliares metodosAuxiliares = new MetodosAuxiliares();

    //Guardar Datos de los clientes, vendedores e inmuebles.
    public static void agregarCliente(String nombre, String rut, String correo){
        Cliente cliente = new Cliente(
                nombre,
                rut,
                correo
        );
        clientes.add(cliente);
        System.out.println("Se ha agregado el cliente\n" +
                "Los clientes actuales son:\n");
        for(int i = 0; i < clientes.size(); i++){
            System.out.println(clientes.get(i));
        }
    }
    public static void agregarVendedor(String nombre, String rut, String correo, String tipoDeContrato, String sueldoBase){
        Vendedor vendedor = new Vendedor(
                nombre,
                rut,
                correo,
                tipoDeContrato,
                sueldoBase
        );
        vendedores.add(vendedor);
        System.out.println("Se ha agregado el vendedor\n" +
                "Los vendedores actuales son:\n");
        for(int i = 0; i < vendedores.size(); i++){
            System.out.println(vendedores.get(i));
        }
    }
    public static void agregarArticulo(String nombre, String tipoDeArticulo, String pesoEnKg, String precio){
        Articulo articulo = new Articulo(
                nombre,
                tipoDeArticulo,
                pesoEnKg,
                precio);
        articulos.add(articulo);
        System.out.println("Se ha agregado el articulo\n" +
                "Los articulos en bodega son:\n");
        for(int i = 0; i < articulos.size(); i++){
            System.out.println(articulos.get(i));
        }
    }
    public static void agregarVenta(ArrayList<Articulo> articulos, String precioTotal, Cliente cliente, Vendedor vendedor){
        Random random = new Random();
        Venta venta = new Venta(
                articulos,
                precioTotal,
                cliente,
                vendedor);
        ventas.add(venta);
        System.out.println("Se ha agregado la venta\n" +
                "Los ventas realizadas son:\n");
        for(int i = 0; i < ventas.size(); i++){
            System.out.println(ventas.get(i));
        }
    }
    public static void eliminarTodosLosArticulos(){
        for(int i = 0; i < articulos.size(); i++){
            articulos.clear();
        }
        System.out.println("Se ha eliminado todos los articulos");
    }

    //Buscar venta segun Articulo
    public static void buscarVenta(ArrayList<Venta> ventas, String tipoDeArticulo){
       System.out.println("Las ventas con el tipo de articulo " + tipoDeArticulo + " son: " + metodosAuxiliares.buscarVentaSegunArticulo(ventas, tipoDeArticulo));
    }


}
