package miPrincipal;

public class Inventario{
    
    
    private Libro[] libros;
    private Celular[] celulares;
    private Television[] televisiones;
    private Licuadora[] licuadoras;
    private Tostadora[] tostadoras;
    private Calculadora[] calculadoras;
    private int contadorTotal;
    private int contadorLibros;
    private int contadorCelulares;
    private int contadorTelevisiones;
    private int contadorLicuadoras;
    private int contadorTostadoras;
    private int contadorCalculadoras;

    public Inventario() {
       
        this.libros = new Libro[10];
        this.celulares = new Celular[10];
        this.televisiones = new Television[10];
        this.licuadoras = new Licuadora[10];
        this.tostadoras = new Tostadora[10];
        this.calculadoras = new Calculadora[10];
        
        this.contadorLibros=0;
        this.contadorCelulares=0;
        this.contadorTelevisiones=0;
        this.contadorLicuadoras=0;
        this.contadorTostadoras=0;
        this.contadorCalculadoras=0;
        this.contadorTotal = 0;
    }

    public Inventario(int capacidad) {
       
        this.libros = new Libro[capacidad];
        this.celulares = new Celular[capacidad];
        this.televisiones = new Television[capacidad];
        this.licuadoras = new Licuadora[capacidad];
        this.tostadoras = new Tostadora[capacidad];
        this.calculadoras = new Calculadora[capacidad];
        this.contadorTotal = 0;
        this.contadorLibros=0;
        this.contadorCelulares=0;
        this.contadorTelevisiones=0;
        this.contadorLicuadoras=0;
        this.contadorTostadoras=0;
        this.contadorCalculadoras=0;
        
    }

    public int getContadorTotal() {
        return contadorTotal;
    }

    public Libro[] getLibros() {
        return libros;
    }
    public Celular[] getCelulares() {
        return celulares;
    }
    public Television[] getTelevisiones() {
        return televisiones;
    }
    public Licuadora[] getLicuadoras() {
        return licuadoras;
    }   
    public Tostadora[] getTostadoras() {
        return tostadoras;
    }   
    public Calculadora[] getCalculadoras() {
        return calculadoras;
    }

    public boolean agregarLibro(Libro libro) {
        if (contadorLibros < libros.length) {
            libros[contadorLibros++] = libro;
            contadorTotal++;
            return true;
        } else {
            System.out.println("Inventario lleno. No se puede agregar más libros.");
            return false;
        }
    }

    public boolean eliminarLibro(String nombre) {
        
        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].getNombre().equals(nombre)) {
                for (int j = i; j < contadorLibros; j++) {
                    libros[j] = libros[j + 1];
                }
                contadorLibros--;
                contadorTotal--;
                return true;
                
            }
        }
        return false;
    }

    public boolean eliminarLibro(Libro libro) {
        
        for (int i = 0; i < contadorLibros; i++) {
            
            if (libros[i].equals(libro)) {
                
                for (int j = i; j < contadorLibros; j++) {//contadorLibros - 1
                    
                    System.out.println("libros[" + j + "] = libros[" + (j + 1) + "]");  
                    libros[j] = libros[j + 1];
                }
                contadorLibros--;
                contadorTotal--;
                return true;
                
            }
        }
        return false;
    }

    public Libro buscarLibro(String nombre) {
        
        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].getNombre().equals(nombre)) {
                return libros[i];

            }
        }
        return null;
    }
    public boolean agregarCelular(Celular celular) {
        if (contadorCelulares < celulares.length) {
            celulares[contadorCelulares++] = celular;
            contadorTotal++;
            return true;
        }
        return false;
    }

    public boolean eliminarCelular(Celular celular) {
        for (int i = 0; i < contadorCelulares; i++) {
            if (celulares[i].equals(celular)) {
                for (int j = i; j < contadorCelulares ; j++) {
                    celulares[j] = celulares[j + 1];
                }
                contadorCelulares--;
                contadorTotal--;
                return true;
            
            }
        }
        return false;
        
    }

    public Celular buscarCelular(String nombre) {
        for (int i = 0; i < contadorCelulares; i++) {
            if (celulares[i].getNombre().equals(nombre)) {
                return celulares[i];
            }
        }
        return null;
    }

    public boolean agregarTelevision(Television television) {
        if (contadorTelevisiones < televisiones.length) {
            televisiones[contadorTelevisiones++] = television;
            contadorTotal++;
            return true;
        }
        return false;
    }

    public boolean eliminarTelevision(Television television) {
        for (int i = 0; i < contadorTelevisiones; i++) {
            if (televisiones[i].equals(television)) {
                for (int j = i; j < contadorTelevisiones; j++) {
                    televisiones[j] = televisiones[j + 1];
                }
                contadorTelevisiones--;
                contadorTotal--;
                return true;
                
            }
        }
        return false;
        
    }

    public Television buscarTelevision(String nombre) {
        for (int i = 0; i < contadorTelevisiones; i++) {
            if (televisiones[i].getNombre().equals(nombre)) {
                return televisiones[i];
            }
        }
        return null;
    }

    public boolean agregarLicuadora(Licuadora licuadora) {
        if (contadorLicuadoras < licuadoras.length) {
            licuadoras[contadorLicuadoras++] = licuadora;
            contadorTotal++;
            return true;

        }
        return false;
    }

    public boolean eliminarLicuadora(Licuadora licuadora) {
        for (int i = 0; i < contadorLicuadoras; i++) {
            if (licuadoras[i].equals(licuadora)) {
                for (int j = i; j < contadorLicuadoras ; j++) {
                    licuadoras[j] = licuadoras[j + 1];
                }
                contadorLicuadoras--;
                contadorTotal--;
                return true;
                
            }
        }
        return false;
        
    }

    public Licuadora buscarLicuadora(String nombre) {
        for (int i = 0; i < contadorLicuadoras; i++) {
            if (licuadoras[i].getNombre().equals(nombre)) {
                return licuadoras[i];
            }
        }
        return null;
    }

    public boolean agregarTostadora(Tostadora tostadora) {
        if (contadorTostadoras < tostadoras.length) {
            tostadoras[contadorTostadoras++] = tostadora;
            contadorTotal++;
            return true;
        }
        return false;
    }

    public boolean eliminarTostadora(Tostadora tostadora) {
        for (int i = 0; i < contadorTostadoras; i++) {
            if (tostadoras[i].equals(tostadora)) {
                for (int j = i; j < contadorTostadoras; j++) {
                    tostadoras[j] = tostadoras[j + 1];
                }
                contadorTostadoras--;
                contadorTotal--;
                return true;
                
            }
        }
        return false;
        
    }

    public Tostadora buscarTostadora(String nombre) {
        for (int i = 0; i < contadorTostadoras; i++) {
            if (tostadoras[i].getNombre().equals(nombre)) {
                return tostadoras[i];
            }
        }
        return null;
    }

    public boolean agregarCalculadora(Calculadora calculadora) {
        if (contadorCalculadoras < calculadoras.length) {
            calculadoras[contadorCalculadoras++] = calculadora;
            contadorTotal++;
            return true;
        }
        return false;
    }

    public boolean eliminarCalculadora(Calculadora calculadora) {
        for (int i = 0; i < contadorCalculadoras; i++) {
            if (calculadoras[i].equals(calculadora)) {
                for (int j = i; j < contadorCalculadoras; j++) {
                    calculadoras[j] = calculadoras[j + 1];
                }
                contadorCalculadoras--;
                contadorTotal--;
                return true;
                
            }
        }
        return false;
        
    }

    public Calculadora buscarCalculadora(String nombre) {
        for (int i = 0; i < contadorCalculadoras; i++) {
            if (calculadoras[i].getNombre().equals(nombre)) {
                return calculadoras[i];
            }
        }
        return null;
    }

    public double calcularValorTotalProductos() {
        double valorTotal = 0.0;

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null) {
                valorTotal += libros[i].getPrecio();
            }
        }

        for (int i = 0; i < contadorCelulares; i++) {
            if (celulares[i] != null) {
                valorTotal += celulares[i].getPrecio();
            }
        }

        for (int i = 0; i < contadorTelevisiones; i++) {
            if (televisiones[i] != null) {
                valorTotal += televisiones[i].getPrecio();
            }
        }

        for (int i = 0; i < contadorLicuadoras; i++) {
            if (licuadoras[i] != null) {
                valorTotal += licuadoras[i].getPrecio();
            }
        }

        for (int i = 0; i < contadorTostadoras; i++) {
            if (tostadoras[i] != null) {
                valorTotal += tostadoras[i].getPrecio();
            }
        }

        for (int i = 0; i < contadorCalculadoras; i++) {
            if (calculadoras[i] != null) {
                valorTotal += calculadoras[i].getPrecio();
            }
        }

        return valorTotal;
       
    }

    public void aplicarDescuentoATodos(double porcentaje) {
        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null) {
                libros[i].aplicarDescuento(porcentaje);
            }
        }

        for (int i = 0; i < contadorCelulares; i++) {
            if (celulares[i] != null) {
                celulares[i].aplicarDescuento(porcentaje);
            }
        }

        for (int i = 0; i < contadorTelevisiones; i++) {
            if (televisiones[i] != null) {
                televisiones[i].aplicarDescuento(porcentaje);
            }
        }

        for (int i = 0; i < contadorLicuadoras; i++) {
            if (licuadoras[i] != null) {
                licuadoras[i].aplicarDescuento(porcentaje);
            }
        }

        for (int i = 0; i < contadorTostadoras; i++) {
            if (tostadoras[i] != null) {
                tostadoras[i].aplicarDescuento(porcentaje);
            }
        }

        for (int i = 0; i < contadorCalculadoras; i++) {
            if (calculadoras[i] != null) {
                calculadoras[i].aplicarDescuento(porcentaje);
            }
        }
        
    }

    public void mostrarInventario() {
        for (int i = 0; i < contadorLibros; i++) {
            System.out.println(libros[i]);
        }
        for (int i = 0; i < contadorCelulares; i++) {
            System.out.println(celulares[i]);
        }
        for (int i = 0; i < contadorTelevisiones; i++) {
            System.out.println(televisiones[i]);
        }
        for (int i = 0; i < contadorLicuadoras; i++) {
            System.out.println(licuadoras[i]);
        }
        for (int i = 0; i < contadorTostadoras; i++) {
            System.out.println(tostadoras[i]);
        }
        for (int i = 0; i < contadorCalculadoras; i++) {
            System.out.println(calculadoras[i]);
        }

    }


}