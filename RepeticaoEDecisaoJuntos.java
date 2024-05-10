package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;

public class RepeticaoEDecisaoJuntos {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listaDeUmADez.add(i);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (Integer numero : listaDeUmADez) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }
        System.out.println("Números Pares: ");
        for (Integer numeroPar : numerosPares) {
            System.out.println(numeroPar);
        }
        System.out.println("Números Impares: ");
        for (Integer numeroImpar : numerosImpares) {
            System.out.println(numeroImpar);
        }
    }
}
// video 01:31:39