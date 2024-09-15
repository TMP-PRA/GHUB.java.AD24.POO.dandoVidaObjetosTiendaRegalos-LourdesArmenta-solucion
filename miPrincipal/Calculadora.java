package miPrincipal;

public class Calculadora {
    String nombre;
    double precio;
    private String tipo;

    public Calculadora(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
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


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 80) {
            this.precio -= this.precio * (porcentaje / 100);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Calculadora: " + nombre + ", Precio: $" + precio + ", Tipo: " + tipo;
    }

    
}