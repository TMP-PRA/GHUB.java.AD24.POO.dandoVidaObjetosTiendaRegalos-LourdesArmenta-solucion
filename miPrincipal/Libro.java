package miPrincipal;
public class Libro {
    private String nombre;
    private double precio;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro (String nombre, double precio, String titulo, String autor, int numPaginas) {
        this.nombre = nombre;
        this.precio = precio;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
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


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) {
            this.precio -= this.precio * (porcentaje / 100);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro: " + nombre + ", Precio: $" + precio + ", Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + numPaginas;
    }


   
}