/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaabarrotes;


public class Tienda {
    private Producto[] productos;
    private static final String[] DIAS = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    /**
     * Constructor de la clase Tienda.
     * @param nombresProductos Arreglo con los nombres de los productos.
     */
    public Tienda(String[] nombresProductos) {
        productos = new Producto[nombresProductos.length];
        for (int i = 0; i < nombresProductos.length; i++) {
            productos[i] = new Producto(nombresProductos[i]);
        }
    }

    /**
     * Muestra el total de ventas por producto.
     */
    public void mostrarVentasPorProducto() {
        System.out.println("\nTotal de ventas por producto:");
        for (Producto p : productos) {
            System.out.println("• " + p.getNombre() + ": " + p.getTotalVentas());
        }
    }

    /**
     * Encuentra el día con más ventas totales.
     */
    public void mostrarDiaConMasVentas() {
        int maxVentas = 0;
        int diaMax = 0;

        for (int dia = 0; dia < 7; dia++) {
            int sumaVentasDia = 0;
            for (Producto p : productos) {
                sumaVentasDia += p.getVentasSemanales()[dia];
            }
            if (sumaVentasDia > maxVentas) {
                maxVentas = sumaVentasDia;
                diaMax = dia;
            }
        }

        System.out.println("\nEl día con más ventas es " + DIAS[diaMax] + " con un total de " + maxVentas + " ventas.");
    }

    /**
     * Encuentra el producto más vendido en la semana.
     */
    public void mostrarProductoMasVendido() {
        Producto productoMasVendido = productos[0];

        for (Producto p : productos) {
            if (p.getTotalVentas() > productoMasVendido.getTotalVentas()) {
                productoMasVendido = p;
            }
        }

        System.out.println("\nEl producto más vendido es " + productoMasVendido.getNombre() + " con " + productoMasVendido.getTotalVentas() + " unidades.");
    }

    /**
     * Muestra la tabla de ventas semanales.
     */
    public void mostrarMatrizVentas() {
        System.out.println("\nMatriz de ventas semanales:");
        System.out.printf("%-10s", "Día");
        for (Producto p : productos) {
            System.out.printf("%-10s", p.getNombre());
        }
        System.out.println();

        for (int dia = 0; dia < 7; dia++) {
            System.out.printf("%-10s", DIAS[dia]);
            for (Producto p : productos) {
                System.out.printf("%-10d", p.getVentasSemanales()[dia]);
            }
            System.out.println();
        }
    }
}
