/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package g8ej6.Entidades;

public class Producto {

    private String produc;
    private Integer precio;

    public Producto() {
    }

    public Producto(String produc, Integer precio) {
        this.produc = produc;
        this.precio = precio;
    }

    public String getProduc() {
        return produc;
    }

    public void setProduc(String produc) {
        this.produc = produc;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "produc=" + produc + ", precio=" + precio + '}';
    }

}
