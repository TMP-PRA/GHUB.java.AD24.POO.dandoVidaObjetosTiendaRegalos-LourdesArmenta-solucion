package miPrincipal;

public class Television {
    private String nombre;
    private double precio;
    private String tamanio;
    private String resolucion;

    // Ensure Producto class has a matching constructor
    public Television(String nombre, double precio, String tamanio, String resolucion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanio = tamanio;
        this.resolucion = resolucion;
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

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 30) {
            this.precio -= this.precio * (porcentaje / 100);
            return true;
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "Television: " + nombre + ", Precio: $" + precio + ", Tamaño: " + tamanio + ", Resolucion: " + resolucion;
    }

    
    
}