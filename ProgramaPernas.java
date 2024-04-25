/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o número de pernas:  ");
        
        int num = teclado.nextInt();
        
        switch (num){ 
                case 1: 
                    System.out.println("Saci");
                    break;
                case 2:
                    System.out.println("Bípede");
                    break;
                case 4:
                    System.out.println("Quadrúpede");
                    break;
                case 6, 8:
                    System.out.println("Aranha");
                    break;
                default:
                    System.out.println("outra coisa!");
        
    }
  }
    
}
