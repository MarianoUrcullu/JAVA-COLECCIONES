/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package g8ej6.Servicios;

import g8ej6.Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioProducto {

    private HashMap<String, Integer> almacen;
    private Scanner leer;

    public ServicioProducto() {
        this.almacen = new HashMap();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    /**
     * Ingresamos el producto ingresando como "key" el nombre y el "value" como
     * el precio.
     */
    public void ingresarProducto() {

        String op = "";
        do {
            Producto p = new Producto();

            System.out.println("Ingrese el Producto");
            String produc = leer.next();
            p.setProduc(produc);

            System.out.println("Ingrese el Precio del Producto");
            Integer precio = Integer.parseInt(leer.next());
            p.setPrecio(precio);

            System.out.println("Desea ingresar otro Producto ? [S/N]");
            op = leer.next();
            op = op.toUpperCase();
            
            almacen.put(produc, precio);

        } while (!"N".equals(op));

    }

    /**
     * Mostramos todos los productos en el mapa
     */
    public void mostarProductos() {
        for (Map.Entry<String, Integer> aux : almacen.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Producto: " + key + " | Precio: " + value);
        }
    }

    /**
     * Modificamos el precio del producto ingresado por parametro
     *
     * @param productoModificar
     * @param nuevoPrecio
     */
    public void modificarPrecio(String productoModificar, Integer nuevoPrecio) {
        if (almacen.size() == 0) {
            System.out.println("El Almacen esta vacio :C");
        } else {
            int cont = 0;
            for (Map.Entry<String, Integer> aux : almacen.entrySet()) {
                if (aux.getKey().equalsIgnoreCase(productoModificar)) {
                    cont++;
                    System.out.println("Se Encontro el Producto");
                    aux.setValue(nuevoPrecio);
                    System.out.println("El nuevo precio del Producto " + productoModificar
                            + " es " + aux.getValue());
                }

            }
            if (cont == 0) {
                System.out.println("No se encontro el Producto " + productoModificar);
            }
        }
    }

    /**
     * Eliminamos el producto ingresado por parametro. Lo busca en el mapa, si
     * lo encuentra lo elimina sino tira un mensaje
     *
     * @param productoEliminar
     */
    public void eliminarProducto(String productoEliminar) {
        if (almacen.size() == 0) {
            System.out.println("El Almacen esta vacio :C");
        } else {
            int cont = 0;
            for (Map.Entry<String, Integer> aux : almacen.entrySet()) {
                if (aux.getKey().equalsIgnoreCase(productoEliminar)) {
                    cont++;
                    almacen.remove(aux.getKey());
                    System.out.println("Se removio el producto " + productoEliminar
                            + " de la lista");
                    break;
                }

            }
            if (cont == 0) {
                System.out.println("El producto no existe " + productoEliminar
                        + " en la lista");
            }
        }
    }

    /**
     * Menu interactivo
     */
    public void menu() {
        int op = 0;
        do {
            System.out.println("---------- Menú ----------");
            System.out.println("---------- Elija la opción deseada ----------");
            System.out.println("---------- 1) Cargar productos y precios ----------");
            System.out.println("---------- 2) Mostrar la lista de productos ----------");
            System.out.println("---------- 3) Modificar precio ----------");
            System.out.println("---------- 4) Eliminar producto ----------");
            System.out.println("---------- 5) Salir ----------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("");
                    ingresarProducto();
                    break;
                case 2:
                    System.out.println("");
                    mostarProductos();
                    break;
                case 3:
                    System.out.println("\nIngrese el Producto a Modificar");
                    String productoModificar = leer.next();
                    System.out.println("Ingrese el Nuevo Precio");
                    Integer nuevoPrecio = Integer.parseInt(leer.next());

                    modificarPrecio(productoModificar, nuevoPrecio);
                    break;
                case 4:
                    System.out.println("\nIngrese el Producto a Eliminar");
                    String productoEliminar = leer.next();
                    eliminarProducto(productoEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo c:");
                    break;
                default:
                    System.out.println("-----ERROR, esa opcion no existe-----");

            }

        } while (op != 5);
    }
}
