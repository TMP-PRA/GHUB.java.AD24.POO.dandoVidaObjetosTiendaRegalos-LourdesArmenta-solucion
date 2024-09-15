package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private TiendaDeRegalos tienda;
   

    @BeforeEach
    public void setUp() {
        tienda = new TiendaDeRegalos("Mi Tienda", "Calle Falsa 123", 100);
      
    }
    

    @Test 
    public void testMenuInitialization() {
        Menu menu = new Menu();
        assertNotNull(menu, "El menú debe inicializarse correctamente");
   
    }

    @Test
    public void testLibro() {
        // Verificar que Libro es una subclase de Producto
        Libro libro = new Libro("Libro1", 29.99, "Cien Años de Soledad", "Gabriel Garcia Marquez", 500);

        // Prueba de getNombre
        assertEquals("Libro1", libro.getNombre(), "El nombre del libro debe ser 'Libro1'");

        // Prueba de setNombre
        libro.setTitulo("El Amor en los Tiempos del Cólera");
        assertEquals("El Amor en los Tiempos del Cólera", libro.getTitulo(), "El titulo del libro debe ser 'El Amor en los Tiempos del Cólera' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(29.99, libro.getPrecio(), "El precio del libro debe ser 29.99");

        // Prueba de setPrecio
        libro.setPrecio(19.99);
        assertEquals(19.99, libro.getPrecio(), "El precio del libro debe ser 19.99 después de usar setPrecio");

        // Prueba de getAutor
        assertEquals("Gabriel Garcia Marquez", libro.getAutor(), "El autor del libro debe ser 'Gabriel Garcia Marquez'");

        // Prueba de setAutor
        libro.setAutor("Mario Vargas Llosa");
        assertEquals("Mario Vargas Llosa", libro.getAutor(), "El autor del libro debe ser 'Mario Vargas Llosa' después de usar setAutor");

        // Prueba de getNumPaginas
        assertEquals(500, libro.getNumPaginas(), "El número de páginas del libro debe ser 500");

        // Prueba de setNumPaginas
        libro.setNumPaginas(600);
        assertEquals(600, libro.getNumPaginas(), "El número de páginas del libro debe ser 600 después de usar setNumPaginas");
    }

    

    @Test
    public void testAplicarDescuentoLibro() {
        // Crear una instancia de Libro
        Libro libro = new Libro("Libro1", 100.0,"El Quijote", "Miguel de Cervantes", 500);

        // Aplicar un descuento válido
        libro.aplicarDescuento(20);
        assertEquals(80.0, libro.getPrecio(), 0.01);

        // Aplicar un descuento no válido
        libro.aplicarDescuento(60);
        assertEquals(80.0, libro.getPrecio(), 0.01); // El precio no debe cambiar

        // Aplicar otro descuento válido
        libro.aplicarDescuento(10);
        assertEquals(72.0, libro.getPrecio(), 0.01);
    }

    @Test
    public void testTelevision(){
        // Prueba de getNombre
        Television television = new Television("Samsung", 499.99, "55 pulg", "4K");
        assertEquals("Samsung", television.getNombre(), "El nombre de la televisión debe ser 'Samsung'");

        // Prueba de setNombre
        television.setNombre("LG");
        assertEquals("LG", television.getNombre(), "El nombre de la televisión debe ser 'LG' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(499.99, television.getPrecio(), "El precio de la televisión debe ser 499.99");

        // Prueba de setPrecio
        television.setPrecio(399.99);
        assertEquals(399.99, television.getPrecio(), "El precio de la televisión debe ser 399.99 después de usar setPrecio");

        // Prueba de getTamaño
        assertEquals("55 pulg", television.getTamanio(), "El tamaño de la televisión debe ser 55");

        // Prueba de setTamaño
        television.setTamanio("65 pulg");
        assertEquals("65 pulg", television.getTamanio(), "El tamaño de la televisión debe ser 65 después de usar setTamaño");

        // Prueba de getResolucion
        assertEquals("4K", television.getResolucion(), "La resolución de la televisión debe ser '4K'");

        // Prueba de setResolucion
        television.setResolucion("8K");
        assertEquals("8K", television.getResolucion(), "La resolución de la televisión debe ser '8K' después de usar setResolucion");
    }

 

    @Test
    public void testAplicarDescuentoTelevision() {
        // Crear una instancia de Television
        Television tv = new Television("Samsung Smart TV", 500.0, "55 pulg", "4K");

        // Aplicar un descuento válido
        tv.aplicarDescuento(20);
        assertEquals(400.0, tv.getPrecio(), 0.01);

        // Aplicar un descuento no válido
        tv.aplicarDescuento(50);
        assertEquals(400.0, tv.getPrecio(), 0.01); // El precio no debe cambiar

        // Aplicar otro descuento válido
        tv.aplicarDescuento(10);
        assertEquals(360.0, tv.getPrecio(), 0.01);
    }

    @Test
    public void testCelular() {
        // Prueba de getNombre
        Celular celular = new Celular("iPhone", 999.99, "Apple", "iOS");
        assertEquals("iPhone", celular.getNombre(), "El nombre del celular debe ser 'iPhone'");

        // Prueba de setNombre
        celular.setNombre("Samsung Galaxy");
        assertEquals("Samsung Galaxy", celular.getNombre(), "El nombre del celular debe ser 'Samsung Galaxy' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(999.99, celular.getPrecio(), "El precio del celular debe ser 999.99");

        // Prueba de setPrecio
        celular.setPrecio(899.99);
        assertEquals(899.99, celular.getPrecio(), "El precio del celular debe ser 899.99 después de usar setPrecio");

        // Prueba de getMarca
        celular.setMarca("Samsung");
        assertEquals("Samsung", celular.getMarca(), "La marca del celular debe ser 'Samsung'");

        // Prueba de setMarca
        celular.setMarca("Apple");
        assertEquals("Apple", celular.getMarca(), "La marca del celular debe ser 'Apple' después de usar setMarca");

        // Prueba de getModelo
        celular.setModelo("Android");
        assertEquals("Android", celular.getModelo(), "El modelo del celular debe ser 'Android'");

    }

    

    @Test
    public void testAplicarDescuentoCelular() {
        // Crear una instancia de Celular
        Celular celular = new Celular("iPhone 12", 1000.0, "Apple", "iOS");

        // Aplicar un descuento válido
        celular.aplicarDescuento(20);
        assertEquals(800.0, celular.getPrecio(), 0.01);

        // Aplicar un descuento no válido
        celular.aplicarDescuento(50);
        assertEquals(800.0, celular.getPrecio(), 0.01); // El precio no debe cambiar

        // Aplicar otro descuento válido
        celular.aplicarDescuento(10);
        assertEquals(720.0, celular.getPrecio(), 0.01);
    }


    @Test
    public void testLicuadora(){
        // Prueba de getNombre
        Licuadora licuadora = new Licuadora("Oster", 2000.00,600,1);
        assertEquals("Oster", licuadora.getNombre(), "El nombre de la licuadora debe ser 'Oster'");

        // Prueba de setNombre
        licuadora.setNombre("Black & Decker");
        assertEquals("Black & Decker", licuadora.getNombre(), "El nombre de la licuadora debe ser 'Black & Decker' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(2000.00, licuadora.getPrecio(), "El precio de la licuadora debe ser 39.99");

        // Prueba de setPrecio
        licuadora.setPrecio(29.99);
        assertEquals(29.99, licuadora.getPrecio(), "El precio de la licuadora debe ser 29.99 después de usar setPrecio");

        // Prueba de getPotencia
        assertEquals(600, licuadora.getPotencia(), "La potencia de la licuadora debe ser 600");

        // Prueba de setPotencia
        licuadora.setPotencia(750);
        assertEquals(750, licuadora.getPotencia(), "La potencia  de la licuadora debe ser 750 después de usar setPotencia");

        // Prueba de getCapacidad
        assertEquals(1, licuadora.getCapacidad(), "La capacidad de la licuadora debe ser 1");

        // Prueba de setCapacidad
        licuadora.setCapacidad(2);
        assertEquals(2, licuadora.getCapacidad(), "La capacidad de la licuadora debe ser 2 después de usar setCapacidad");
    }

    @Test
    public void testAplicarDescuentoLicuadora() {
        // Crear una instancia de Licuadora
        Licuadora licuadora = new Licuadora("Oster", 2000.00,600,1);

        // Aplicar un descuento válido
        licuadora.aplicarDescuento(20);
        assertEquals(1600.0, licuadora.getPrecio(), 0.01);

        // Aplicar un descuento no válido
        licuadora.aplicarDescuento(50);
        assertEquals(1600.0, licuadora.getPrecio(), 0.01); // El precio no debe cambiar

        // Aplicar otro descuento válido
        licuadora.aplicarDescuento(10);
        assertEquals(1440.0, licuadora.getPrecio(), 0.01);
    }


    @Test
    public void testTostadora() {
        // Prueba de getNombre
        Tostadora tostadora = new Tostadora("Black & Decker", 29.99,2,"plata");
        assertEquals("Black & Decker", tostadora.getNombre(), "El nombre de la tostadora debe ser 'Black & Decker'");

        // Prueba de setNombre
        tostadora.setNombre("Hamilton Beach");
        assertEquals("Hamilton Beach", tostadora.getNombre(), "El nombre de la tostadora debe ser 'Hamilton Beach' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(29.99, tostadora.getPrecio(), "El precio de la tostadora debe ser 29.99");

        // Prueba de setPrecio
        tostadora.setPrecio(19.99);
        assertEquals(19.99, tostadora.getPrecio(), "El precio de la tostadora debe ser 19.99 después de usar setPrecio");

        // Prueba de getNumRanuras
        assertEquals(2, tostadora.getNumRanuras(), "El número de ranuras de la tostadora debe ser 2");

        // Prueba de setNumRanuras
        tostadora.setNumRanuras(4);
        assertEquals(4, tostadora.getNumRanuras(), "El número de ranuras de la tostadora debe ser 4 después de usar setNumRanuras");

        // Prueba de getColor
        assertEquals("plata", tostadora.getColor(), "El color de la tostadora debe ser 'plata'");

        // Prueba de setColor
        tostadora.setColor("metalizado");
        assertEquals("metalizado", tostadora.getColor(), "El color de la tostadora debe ser 'metalizado' después de usar setColor");    
        
    }


    @Test
    public void testAplicarDescuentoTostadora() {
         // Crear una instancia de Tostadora
         Tostadora tostadora = new Tostadora("Black & Decker", 29.99, 2, "plata");

         // Aplicar un descuento válido
         tostadora.aplicarDescuento(20);
         assertEquals(23.992, tostadora.getPrecio(), 0.01);
 
         // Aplicar un descuento no válido
         tostadora.aplicarDescuento(95);
         assertEquals(23.992, tostadora.getPrecio(), 0.01); // El precio no debe cambiar
 
         // Aplicar otro descuento válido
         tostadora.aplicarDescuento(10);
         assertEquals(21.5928, tostadora.getPrecio(), 0.01);
    }


    @Test
    public void testCalculadora() {
        // Prueba de getNombre
        Calculadora calculadora = new Calculadora("Casio", 19.99, "científica");
        assertEquals("Casio", calculadora.getNombre(), "El nombre de la calculadora debe ser 'Casio'");

        // Prueba de setNombre
        calculadora.setNombre("Texas Instruments");
        assertEquals("Texas Instruments", calculadora.getNombre(), "El nombre de la calculadora debe ser 'Texas Instruments' después de usar setNombre");

        // Prueba de getPrecio
        assertEquals(19.99, calculadora.getPrecio(), "El precio de la calculadora debe ser 19.99");

        // Prueba de setPrecio
        calculadora.setPrecio(14.99);
        assertEquals(14.99, calculadora.getPrecio(), "El precio de la calculadora debe ser 14.99 después de usar setPrecio");

        // Prueba de getTipo
        calculadora.setTipo("gráfica");
        assertEquals("gráfica", calculadora.getTipo(), "El tipo de la calculadora debe ser 'gráfica'");

        // Prueba de setTipo
        calculadora.setTipo("científica");
        assertEquals("científica", calculadora.getTipo(), "El tipo de la calculadora debe ser 'científica' después de usar setTipo");

    }

    
    @Test
    public void testAplicarDescuentoCalculadora() {
        // Crear una instancia de Calculadora
        Calculadora calculadora = new Calculadora("Casio FX-991ES", 19.99, "Científica");

        // Aplicar un descuento válido
        calculadora.aplicarDescuento(20);
        assertEquals(15.992, calculadora.getPrecio(), 0.01);

        // Aplicar un descuento no válido
        calculadora.aplicarDescuento(90);
        assertEquals(15.992,calculadora.getPrecio(), 0.01); // El precio no debe cambiar

        // Aplicar otro descuento válido
        calculadora.aplicarDescuento(10);
        assertEquals(14.39, calculadora.getPrecio(), 0.01);
    }

    @Test
    public void testSobrescrituraMetodoToString() {
        //Crear una instancia de Libro
        Libro libro = new Libro("Libro1", 29.99, "Cien Años de Soledad", "Gabriel Garcia Marquez", 500);    
        // Verificar el método toString en Libro
        assertEquals("Libro: Libro1, Precio: $29.99, Titulo: Cien Años de Soledad, Autor: Gabriel Garcia Marquez, Paginas: 500", libro.toString());

        // Crear una instancia de Television
        Television television = new Television("Samsung", 499.99, "55 pulg", "4K");
        // Verificar el método toString en Television
        assertEquals("Television: Samsung, Precio: $499.99, Tamaño: 55 pulg, Resolucion: 4K", television.toString());

        // Crear una instancia de Celular
        Celular celular = new Celular("iPhone", 999.99, "Apple", "iOS");
        // Verificar el método toString en Celular
        assertEquals("Celular: iPhone, Precio: $999.99, Marca: Apple, Modelo: iOS", celular.toString());

        // Crear una instancia de Licuadora
        Licuadora licuadora = new Licuadora("Oster", 2000.00,600,1);
        // Verificar el método toString en Licuadora
        assertEquals("Licuadora: Oster, Precio: $2000.0, Potencia: 600, Capacidad: 1", licuadora.toString());
    
        
        // Crear una instancia de Tostadora
        Tostadora tostadora = new Tostadora("Black & Decker", 50.00, 2, "plata");

        // Verificar el método toString en Tostadora
        assertEquals("Tostadora: Black & Decker, Precio: $50.0, Ranuras: 2, Color: plata", tostadora.toString());
    }
    @Test
    public void testAgregarProductos() {
        Libro libro = new Libro("Libro1", 100.0, "Titulo1", "Autor1", 200);
        tienda.agregarLibro(libro);
        assertNotNull(tienda.buscarLibro("Libro1"));

        Celular celular = new Celular("Celular1", 200.0, "Marca1", "Modelo1");
        tienda.agregarCelular(celular);
        assertNotNull(tienda.buscarCelular("Celular1"));

        Television television = new Television("Television1", 300.0, "Tamaño1", "Resolucion1");
        tienda.agregarTelevision(television);
        assertNotNull(tienda.buscarTelevision("Television1"));

        Licuadora licuadora = new Licuadora("Licuadora1", 400.0, 500, 2);
        tienda.agregarLicuadora(licuadora);
        assertNotNull(tienda.buscarLicuadora("Licuadora1"));

        Tostadora tostadora = new Tostadora("Tostadora1", 50.0, 2, "Color1");
        tienda.agregarTostadora(tostadora);
        assertNotNull(tienda.buscarTostadora("Tostadora1"));

        Calculadora calculadora = new Calculadora("Calculadora1", 20.0, "Tipo1");
        tienda.agregarCalculadora(calculadora);
        assertNotNull(tienda.buscarCalculadora("Calculadora1"));

    }

    @Test
    public void testEliminarProductos() {
        // Agregar productos
        Libro libro = new Libro("Libro1", 100.0, "Titulo1", "Autor1", 200);
        tienda.agregarLibro(libro);
        Celular celular = new Celular("Celular1", 200.0, "Marca1", "Modelo1");
        tienda.agregarCelular(celular);
        Television television = new Television("Television1", 300.0, "Tamaño1", "Resolucion1");
        tienda.agregarTelevision(television);
        Licuadora licuadora = new Licuadora("Licuadora1", 150.0, 500, 2);
        tienda.agregarLicuadora(licuadora);
        Tostadora tostadora = new Tostadora("Tostadora1", 50.0, 2, "Rojo");
        tienda.agregarTostadora(tostadora);
        Calculadora calculadora = new Calculadora("Calculadora1", 20.0, "Científica");
        tienda.agregarCalculadora(calculadora);

        

        // Eliminar y verificar que los productos ya no están en el inventario
        tienda.eliminarLibro("Libro1");
        assertNull(tienda.buscarLibro("Libro1"), "El libro debe ser eliminado del inventario");
        
        tienda.eliminarCelular("Celular1");
        assertNull(tienda.buscarCelular("Celular1"), "El celular debe ser eliminado del inventario");
        
        tienda.eliminarTelevision("Television1");
        assertNull(tienda.buscarTelevision("Television1"), "La televisión debe ser eliminada del inventario");

        tienda.eliminarLicuadora("Licuadora1");
        assertNull(tienda.buscarLicuadora("Licuadora1"), "La licuadora debe ser eliminada del inventario");

        tienda.eliminarTostadora("Tostadora1");
        assertNull(tienda.buscarTostadora("Tostadora1"), "La tostadora debe ser eliminada del inventario");

        tienda.eliminarCalculadora("Calculadora1");
        assertNull(tienda.buscarCalculadora("Calculadora1"), "La calculadora debe ser eliminada del inventario");
        
        }

        @Test
    public void testCalcularValorTotalProductos() {
        // Agregar productos al inventario
        Libro libro = new Libro("Libro1", 100.0, "Titulo1", "Autor1", 200);
        tienda.agregarLibro(libro);

        Celular celular = new Celular("Celular1", 200.0, "Marca1", "Modelo1");
        tienda.agregarCelular(celular);

        Television television = new Television("Television1", 300.0, "55 pulgadas", "4K");
        tienda.agregarTelevision(television);

        Licuadora licuadora = new Licuadora("Licuadora1", 150.0, 500, 2);
        tienda.agregarLicuadora(licuadora);

        Tostadora tostadora = new Tostadora("Tostadora1", 50.0, 2, "Rojo");
        tienda.agregarTostadora(tostadora);

        Calculadora calculadora = new Calculadora("Calculadora1", 20.0, "Científica");
        tienda.agregarCalculadora(calculadora);

        // Calcular el valor total de los productos
        double valorTotalEsperado = 100.0 + 200.0 + 300.0 + 150.0 + 50.0 + 20.0;
        double valorTotalCalculado = tienda.calcularValorTotalProductos();

        // Verificar que el valor total calculado es el esperado
        assertEquals(valorTotalEsperado, valorTotalCalculado, 0.001, "El valor total de los productos debe ser correcto");
    }
    
    @Test
    public void testAplicarDescuentoATodosLosProductos() {
        // Agregar productos al inventario
        Libro libro = new Libro("Libro1", 100.0, "Titulo1", "Autor1", 200);
        tienda.agregarLibro(libro);

        Celular celular = new Celular("Celular1", 200.0, "Marca1", "Modelo1");
        tienda.agregarCelular(celular);

        Television television = new Television("Television1", 300.0, "55 pulgadas", "4K");
        tienda.agregarTelevision(television);

        Licuadora licuadora = new Licuadora("Licuadora1", 150.0, 500, 2);
        tienda.agregarLicuadora(licuadora);

        Tostadora tostadora = new Tostadora("Tostadora1", 50.0, 2, "Rojo");
        tienda.agregarTostadora(tostadora);

        Calculadora calculadora = new Calculadora("Calculadora1", 20.0, "Científica");
        tienda.agregarCalculadora(calculadora);

        // Aplicar un descuento del 10% a todos los productos
        tienda.aplicarDescuentoATodosLosProductos(10.0);

        // Verificar que el precio de cada producto se ha actualizado correctamente
        assertEquals(90.0, libro.getPrecio(), 0.001, "El precio del libro debe ser 90.0 después del descuento");
        assertEquals(180.0, celular.getPrecio(), 0.001, "El precio del celular debe ser 180.0 después del descuento");
        assertEquals(270.0, television.getPrecio(), 0.001, "El precio de la televisión debe ser 270.0 después del descuento");
        assertEquals(135.0, licuadora.getPrecio(), 0.001, "El precio de la licuadora debe ser 135.0 después del descuento");
        assertEquals(45.0, tostadora.getPrecio(), 0.001, "El precio de la tostadora debe ser 45.0 después del descuento");
        assertEquals(18.0, calculadora.getPrecio(), 0.001, "El precio de la calculadora debe ser 18.0 después del descuento");
    }

    @Test
    public void testAplicarDescuentoATodosLosProductosde50() {
        // Agregar productos al inventario
        Libro libro = new Libro("Libro1", 100.0, "Titulo1", "Autor1", 200);
        tienda.agregarLibro(libro);

        Celular celular = new Celular("Celular1", 200.0, "Marca1", "Modelo1");
        tienda.agregarCelular(celular);

        Television television = new Television("Television1", 300.0, "55 pulgadas", "4K");
        tienda.agregarTelevision(television);

        Licuadora licuadora = new Licuadora("Licuadora1", 150.0, 500, 2);
        tienda.agregarLicuadora(licuadora);

        Tostadora tostadora = new Tostadora("Tostadora1", 50.0, 2, "Rojo");
        tienda.agregarTostadora(tostadora);

        Calculadora calculadora = new Calculadora("Calculadora1", 20.0, "Científica");
        tienda.agregarCalculadora(calculadora);

        // Aplicar un descuento del 50% a todos los productos
        tienda.aplicarDescuentoATodosLosProductos(50.0);

        // Verificar que el precio de cada producto se ha actualizado correctamente
        assertEquals(50.0, libro.getPrecio(), 0.001, "El precio del libro debe ser 50.0 después del descuento");
        assertEquals(200.0, celular.getPrecio(), 0.001, "El precio del celular debe ser 200.0 porque el descuento no es válido");
        assertEquals(300.0, television.getPrecio(), 0.001, "El precio de la televisión debe ser 300.0 porque el descuento no es válido");
        assertEquals(150.0, licuadora.getPrecio(), 0.001, "El precio de la licuadora debe ser 150.0 porque ell descuento no es válido");
        assertEquals(25.0, tostadora.getPrecio(), 0.001, "El precio de la tostadora debe ser 25.0 después del descuento");
        assertEquals(10.0, calculadora.getPrecio(), 0.001, "El precio de la calculadora debe ser 10.0 después del descuento");
    }

}