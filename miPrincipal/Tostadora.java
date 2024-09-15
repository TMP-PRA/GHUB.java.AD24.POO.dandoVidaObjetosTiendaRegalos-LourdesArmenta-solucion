package miPrincipal;

public class Tostadora  {
    private String nombre;
    private double precio;
    private int numRanuras;
    private String color;

    public Tostadora(String nombre, double precio, int numRanuras, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.numRanuras = numRanuras;
        this.color = color;
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


    public int getNumRanuras() {
        return numRanuras;
    }

    public void setNumRanuras(int numRanuras) {
        this.numRanuras = numRanuras;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 90) {
            this.precio -= this.precio * (porcentaje / 100);
            return true;
        }
        return false;
    }

    

    // Sobrescribir el método detallesProducto
    @Override
    public String toString() {
        return "Tostadora: " + nombre + ", Precio: $" + precio + ", Ranuras: " + numRanuras + ", Color: " + color;
    }
    
    
}