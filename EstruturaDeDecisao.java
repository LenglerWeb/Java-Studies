package com.youtube.jovemtranquilao.logica;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        if(false) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        int numero = 3;

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        stringIgual() ;
    }

    public static void stringIgual() {
        String frase = "Hoje é segunda-feira seis horas da tarde";

        if(frase.contains("segunda-feira")) {
            if (frase.contains("seis horas da tarde")) {
                System.out.println("segunda-feira, seis horas da tarde, momento de alegria");
            } else {
                System.out.println("Dia da tristeza");
            }
        } else if (frase.contains("sexta-feira") || frase.contains("sábado") || frase.contains("domingo")) {
            System.out.println("Dia de alegria");
        } else {
            System.out.println("Dia de trabalho normal");
        }
    }
}
