/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaabarrotes;

import java.util.Random;

/**
 * Clase que representa un producto en la tienda.
 */
public class Producto {
    private String nombre;
    private int[] ventasSemanales;

    /**
     * Constructor de la clase Producto.
     * @param nombre Nombre del producto.
     */
    public Producto(String nombre) {
        this.nombre = nombre;
        this.ventasSemanales = new int[7]; // 7 días de la semana
        generarVentasAleatorias();
    }

    /**
     * Genera ventas aleatorias entre 0 y 9 para cada día de la semana.
     */
    private void generarVentasAleatorias() {
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            ventasSemanales[i] = rand.nextInt(10); // Números de 0 a 9
        }
    }

    /**
     * Calcula el total de ventas del producto en la semana.
     * @return Total de ventas semanales.
     */
    public int getTotalVentas() {
        int total = 0;
        for (int ventas : ventasSemanales) {
            total += ventas;
        }
        return total;
    }

    /**
     * Devuelve el nombre del producto.
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve las ventas diarias del producto.
     * @return Arreglo con las ventas diarias.
     */
    public int[] getVentasSemanales() {
        return ventasSemanales;
    }
}
