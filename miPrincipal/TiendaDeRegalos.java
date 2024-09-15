package miPrincipal;


public class TiendaDeRegalos{
    private String nombre;
    private String direccion;
    private Inventario inventario;
    

    public TiendaDeRegalos(int capacidadInventario) {
        this.inventario = new Inventario(capacidadInventario);
        
    }

    public TiendaDeRegalos(String nombre, String direccion, int capacidadInventario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario(capacidadInventario);
    }

    public void presentarse() {
        System.out.println("Bienvenido a " + nombre + " ubicada en " + direccion);
    }

    public void cumplirAños() {
        System.out.println(nombre + " está celebrando su aniversario!");
    }

    public void agregarLibro(Libro libro) {
        inventario.agregarLibro(libro);
        System.out.println("Libro agregado: " + libro);

    }

    public void eliminarLibro(String nombreLibro) {
        Libro libro = buscarLibro(nombreLibro);
        if (libro != null) {
            inventario.eliminarLibro(libro);
            System.out.println("Libro eliminado: " + libro.toString()); 
        } else {
            System.out.println("Libro no encontrado: " + nombreLibro);
        }
    }

    public void agregarCelular(String nombre, double precio, String marca, String modelo) {
        Celular celular = new Celular(nombre, precio, marca, modelo);
        
        inventario.agregarCelular(celular);
        System.out.println("Celular agregado: " + celular.toString());
    }

    public void eliminarCelular(String nombreCelular) {
        Celular celular = buscarCelular(nombreCelular);
        if (celular != null) {
            inventario.eliminarCelular(celular);
            System.out.println("Celular eliminado: " + celular.toString());
        } else {
            System.out.println("Celular no encontrado: " + nombreCelular);
        }
    }

    public void agregarTelevision(String nombre, double precio, String tamanio, String resolucion) {
        Television television = new Television(nombre, precio, tamanio, resolucion);
        inventario.agregarTelevision(television);
        System.out.println("Televisor agregado: " + television.toString());
    }

    public void eliminarTelevision(String nombreTelevision) {
        Television television = buscarTelevision(nombreTelevision);
        if (television != null) {
            inventario.eliminarTelevision(television);
            System.out.println("Televisor eliminado: " + television.toString());
        } else {
            System.out.println("Televisor no encontrado: " + nombreTelevision);
        }
    }

    public void agregarLicuadora(String nombre, double precio, int potencia, int capacidad) {
        Licuadora licuadora = new Licuadora(nombre, precio, potencia, capacidad);
        inventario.agregarLicuadora(licuadora);
        System.out.println("Licuadora agregada: " + licuadora.toString());
    }

    public void eliminarLicuadora(String nombreLicuadora) {
        Licuadora licuadora = buscarLicuadora(nombreLicuadora);
        if (licuadora != null) {
            inventario.eliminarLicuadora(licuadora);
            System.out.println("Licuadora eliminada: " + licuadora);
        } else {
            System.out.println("Licuadora no encontrada: " + nombreLicuadora);
        }
    }

    public void agregarTostadora(String nombre, double precio, int ranuras, String color) {
        Tostadora tostadora = new Tostadora(nombre, precio, ranuras, color);
        inventario.agregarTostadora(tostadora);
        System.out.println("Tostadora agregada: " + tostadora);
    }

    public void eliminarTostadora(String nombreTostadora) {
        Tostadora tostadora = buscarTostadora(nombreTostadora);
        if (tostadora != null) {
            inventario.eliminarTostadora(tostadora);
            System.out.println("Tostadora eliminada: " + tostadora.toString());
        } else {
            System.out.println("Tostadora no encontrada: " + nombreTostadora);
        }
    }

    public void agregarCalculadora(String nombre, double precio, String tipo) {
        Calculadora calculadora = new Calculadora(nombre, precio, tipo);
        inventario.agregarCalculadora(calculadora);
        System.out.println("Calculadora agregada: " + calculadora);
    }

    public void eliminarCalculadora(String nombreCalculadora) {
        Calculadora calculadora = buscarCalculadora(nombreCalculadora);
        if (calculadora != null) {
            inventario.eliminarCalculadora(calculadora);
            System.out.println("Calculadora eliminada: " + calculadora.toString());
        } else {
            System.out.println("Calculadora no encontrada: " + nombreCalculadora);
        }
    }

    public Libro buscarLibro(String nombreLibro) {
        Libro[] libros = inventario.getLibros();
        for (int i = 0; i < libros.length; i++) {
           if (libros[i] != null && libros[i].getNombre().equals(nombreLibro)) {
            return libros[i];
           }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    public Celular buscarCelular(String nombreCelular) {
        Celular[] celulares = inventario.getCelulares();
        for (int i = 0; i < celulares.length; i++) {
            if (celulares[i] != null && celulares[i].getNombre().equals(nombreCelular)) {
                return celulares[i];
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    public Television buscarTelevision(String nombreTelevision) {
        Television[] televisiones = inventario.getTelevisiones();
        for (int i = 0; i < televisiones.length; i++) {
            if (televisiones[i] != null && televisiones[i].getNombre().equals(nombreTelevision)) {
                return televisiones[i];
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    public Licuadora buscarLicuadora(String nombreLicuadora) {
        Licuadora[] licuadoras = inventario.getLicuadoras();
        for (int i = 0; i < licuadoras.length; i++) {
            if (licuadoras[i] != null && licuadoras[i].getNombre().equals(nombreLicuadora)) {
                return licuadoras[i];
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    public Tostadora buscarTostadora(String nombreTostadora) {
        Tostadora[] tostadoras = inventario.getTostadoras();
        for (int i = 0; i < tostadoras.length; i++) {
            if (tostadoras[i] != null && tostadoras[i].getNombre().equals(nombreTostadora)) {
                return tostadoras[i];
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    public Calculadora buscarCalculadora(String nombreCalculadora) {
        Calculadora[] calculadoras = inventario.getCalculadoras();
        for (int i = 0; i < calculadoras.length; i++) {
            if (calculadoras[i] != null && calculadoras[i].getNombre().equals(nombreCalculadora)) {
                return calculadoras[i];
            }
        }
        return null; // Devuelve null si no se encuentra el producto
    }


    public void listarProductos() {
        inventario.mostrarInventario();
                
    }

    public void venderLibro(String nombreLibro) {
        Libro libro = buscarLibro(nombreLibro);
        if (libro != null) {
            inventario.eliminarLibro(libro);
            System.out.println("Libro vendido: " + nombreLibro);
        } else {
            System.out.println("Libro no encontrado: " + nombreLibro);
        }
    }

    public void actualizarPrecioLibro(String nombreLibro, double nuevoPrecio) {
        Libro libro = buscarLibro(nombreLibro);
        if (libro!= null) {
            libro.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado para " + nombreLibro + ": $" + nuevoPrecio);
        } else {
            System.out.println("Libro no encontrado: " + nombreLibro);
        }
    }
    public void aplicarDescuentoATodosLosProductos(double porcentaje) {
        inventario.aplicarDescuentoATodos(porcentaje);
        System.out.println("Descuento aplicado a los productos permitidos: " + porcentaje + "%");
    }

    public double calcularValorTotalProductos() {
        double valorTotal = inventario.calcularValorTotalProductos();
        System.out.println("Valor total de los productos en inventario: $" + valorTotal);
        return valorTotal;
    }
    
    public void agregarLibro(String nombre, double precio, String titulo,String autor, int paginas) {
        Libro libro = new Libro(nombre, precio, titulo, autor, paginas);
        
        if(inventario.agregarLibro(libro))
            System.out.println("Libro agregado: " + libro);
        else
            System.out.println("No se pudo agregar el libro: " + libro);
    }

    public void agregarCelular(Celular celular) {
        inventario.agregarCelular(celular);
        System.out.println("Celular agregado: " + celular.toString());
    }

    public void agregarTelevision(Television television) {
        inventario.agregarTelevision(television);
        System.out.println("Television agregado: " + television.toString());

    }

    public void agregarLicuadora(Licuadora licuadora) {
        inventario.agregarLicuadora(licuadora);
        System.out.println("Licuadora agregada: " + licuadora.toString());

    }

    public void agregarTostadora(Tostadora tostadora) {
        inventario.agregarTostadora(tostadora);
        System.out.println("Tostadora agregada: " + tostadora.toString());
    }

    public void agregarCalculadora(Calculadora calculadora) {
        inventario.agregarCalculadora(calculadora);
        System.out.println("Calculadora agregada: " + calculadora.toString());
    }


  

} 