/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema002;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner gastos = new Scanner(System.in);  
    String nombre1;
    String nombre2;
    String nombre3;
    double hijo1;
    double hijo2;
    double hijo3;
    double total_gastos;
    
    System.out.println("Ingrese gastos del primer hijo");
    nombre1 = gastos.nextLine();
    System.out.println("Ingresa gastos del segundo hijo");
    nombre2 = gastos.nextLine();
    System.out.println("Ingresa gastos del tercer hijo");
    nombre3 = gastos.nextLine();
    System.out.println("Ingrese los gastos pertenecientes a" + nombre1 + ":");
    hijo1 = gastos.nextDouble();
    System.out.println("Ingrese los gastos pertenecientes a" + nombre2 + ":");
    hijo2 = gastos.nextDouble();
    System.out.println("Ingrese los gastos pertenecientes a" + nombre3 + ":");
    hijo3 = gastos.nextDouble();
    total_gastos = hijo1+hijo2+hijo3;
    System.out.println("El total de gastos de"+nombre1+","+nombre2+" y "+nombre3+" es:"+total_gastos);
    
    
     }
    
}
