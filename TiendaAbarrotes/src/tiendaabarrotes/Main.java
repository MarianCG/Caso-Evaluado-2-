/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaabarrotes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de productos al usuario
        System.out.println("Ingrese la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        // Crear el arreglo de nombres de productos
        String[] nombresProductos = new String[cantidadProductos];

        // Pedir nombres de los productos
        System.out.println("Ingrese los nombres de los productos:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            nombresProductos[i] = scanner.nextLine();
        }

        // Crear la tienda con los productos ingresados
        Tienda tienda = new Tienda(nombresProductos);

        // Mostrar los resultados
        tienda.mostrarMatrizVentas();
        tienda.mostrarVentasPorProducto();
        tienda.mostrarDiaConMasVentas();
        tienda.mostrarProductoMasVendido();

        scanner.close();
    }
}
