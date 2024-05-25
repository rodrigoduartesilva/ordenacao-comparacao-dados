package br.com.duarte.ordenacao.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaDeNumerosInteiros = new LinkedList<>();

        listaDeNumerosInteiros.add(10);
        listaDeNumerosInteiros.add(4);
        listaDeNumerosInteiros.add(1980);
        listaDeNumerosInteiros.add(25);

        System.out.println("Lista não ordenada: " + listaDeNumerosInteiros);

        Collections.sort(listaDeNumerosInteiros);

        System.out.println("Lista ordenada em ordem crescente: " + listaDeNumerosInteiros);
    }
}