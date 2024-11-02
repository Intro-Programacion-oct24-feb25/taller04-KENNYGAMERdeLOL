/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    Scanner componentes = new Scanner(System.in);
    String nombre;
    double cpu;
    double teclado;
    double ratón;
    double pantalla;
    double total;
    System.out.print("Ingrese el nombre del cliente");
    nombre = componentes.nextLine();
    System.out.print("Ingrese el valor del CPU: $");
    cpu = componentes.nextDouble();
    System.out.print("Ingrese el valor del teclado: $"); 
    teclado = componentes.nextDouble();
    System.out.print("Ingrese el valor del ratón: $");
    ratón = componentes.nextDouble();
    System.out.print("Ingrese el valor de la pantalla: $");
    pantalla = componentes.nextDouble();
    total = cpu+teclado+ratón+pantalla;
    
    // segun el ejercicio cada valor de los componentes es un número entero,
    // por lo tano no usaremos números decimales para calcular el valor total
    // de la computadora de escritorio.
    
     System.out.printf("Reporte: \nNombres del cliente: %s\nValores "
                + "principales:"
                + "\nCPU:  $ %.0f\nTeclado:  $ %.0f\nRatón:  $ %.0f\n"
                + "Pantalla:  $ %.0f\n\n\nValor a cancelar: $%.0f",
                nombre,
                cpu,
                teclado,
                ratón,
                pantalla,
                total);
    }
    
}
