
package miPrincipal;

public class Celular  {
    private String nombre;
    private double precio;
    private String marca;
    private String modelo;

    public Celular(String nombre, double precio, String marca, String modelo) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    }
    

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 20) {
            this.precio -= this.precio * (porcentaje / 100);
            return true;
        }
        return false;
    }
 
    @Override
    public String toString() {
        return "Celular: " + nombre + ", Precio: $" + precio + ", Marca: " + marca + ", Modelo: " + modelo;
    }

   
}   