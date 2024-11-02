/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        double minutos;
        double costo;
        String nombre; 
        String domicilio;
        double calculo;
        System.out.println("Ingrese nombres y apellidos");
        nombre = datos.nextLine();
        System.out.println("Ingrese la direccion de su domicilio");
        domicilio = datos.nextLine();
        System.out.println("Ingrese el costo por minutos:$");
        costo = datos.nextDouble();
        System.out.println("Ingrese el número de minutos consumidos en el mes");
        minutos = datos.nextDouble();
        calculo = costo*minutos;
        
        System.out.printf("Datos:\nNombres y apellidos: %s\n Dirección: %s\n"
        + "Costo por minutos: $%.2f\n Número de minutos consumidos: %."
        + "sf\n"
        + " Valor a cancelar: $%2.f",
        nombre,
        domicilio,
        minutos,        
        costo, 
        calculo);
        
        
        
    }
    
}
