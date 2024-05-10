package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {

        listaDeNomes();
        inverteLista();

    }

    public static void listaDeNomes() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("José");
        palavraList.add("Maria");
        palavraList.add("Eduardo");

        for (String palavras: palavraList) {
            System.out.println(palavras);
        }
    }

    public static void inverteLista() {
        String normal = "Eduardo";
        String invertido = "";

        for (int posicao = normal.length() - 1; posicao >= 0; posicao --) {
            invertido = invertido + normal.charAt(posicao);
        }

        System.out.println(invertido);
    }
}
