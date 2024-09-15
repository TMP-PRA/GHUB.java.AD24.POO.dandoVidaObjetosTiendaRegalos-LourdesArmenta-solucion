package miPrincipal;

public class Licuadora {
    private String nombre;
    private double precio;
    private int potencia;
    private int capacidad;

    public Licuadora(String nombre, double precio, int potencia, int capacidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.potencia = potencia;
        this.capacidad = capacidad;
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


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
       return "Licuadora: " + nombre + ", Precio: $" + precio + ", Potencia: " + potencia + ", Capacidad: " + capacidad;
    }


    
}