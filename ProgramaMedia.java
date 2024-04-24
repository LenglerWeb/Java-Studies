/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float media = (n1 + n2) / 2;
        
        System.out.println("A média do aluno é: " + media);
        
        if(media >= 9){
            System.out.println("Parabéns");
        }
        
        
    }
    
}
