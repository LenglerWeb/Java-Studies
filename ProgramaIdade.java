/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Eduardo
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        LocalDate dataAtual = LocalDate.now();
        
        System.out.print("Informe o seu ano de nascimento:  ");
        int ano = teclado.nextInt();
        // Obtém o ano atual
        int anoAtual = dataAtual.getYear();
        int idade = (anoAtual - ano);
        
        System.out.println("Você tem "+ idade);
        
        if (idade < 18) {
            System.out.println("Você é Menor de Idade!");
        } else {
            System.out.println("Você já é Maior de Idade!");
        }
    }
}
   
