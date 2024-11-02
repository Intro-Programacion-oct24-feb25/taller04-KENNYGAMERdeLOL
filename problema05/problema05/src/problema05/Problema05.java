/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner servicios  = new Scanner(System.in);
        double Netflix;
        double Youtube;
        double Dropbox;
        double Spotify;
        double descuento1;
        double dy;
        double descuento2;
        double cal;
        double sd;
        System.out.print("Ingrese el valor de consumo de netflix: $");
        Netflix = servicios.nextDouble();
        System.out.print("Ingrese el valor de consumo de Youtbe Premium: $");
        Youtube = servicios.nextDouble();
        System.out.print("Ingrese el valor de consumo de Dropbox: $");
        Dropbox = servicios.nextDouble();
        System.out.print("Ingrese el valor de consumo de spotify: $");
        Spotify = servicios.nextDouble();
        
        sd = Netflix+Youtube+Dropbox+Spotify;
        dy = Netflix * 0.77;
        descuento1 = Youtube *0.77;
        descuento2 = Dropbox*0.55;
        
        cal = dy+descuento1+descuento2+Spotify;
         System.out.printf("\n-Reporte sobre el total mensual de los servicios "
              
          
        + "digitales-\n"
                
                + "__\nSubtotal: $%.2f\nDescuentos: \n\tNetflix 23%%: $"
                + "%.2f\n\tYoutube Premium 23%%: $%.2f\n\tDropbox 45%%: $%.2f\n"
                + "Sin descuento: \n\tSpotify: $%.2f\n"
                +  "\nTotal: $%.2f",
          
                sd,
                dy,
                descuento1,
                descuento2,
                Spotify,
                cal);
         
        
        
                
          
        
    }
    
}
