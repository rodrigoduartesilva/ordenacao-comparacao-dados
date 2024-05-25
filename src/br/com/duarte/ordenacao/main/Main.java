package br.com.duarte.ordenacao.main;

import br.com.duarte.ordenacao.model.Titulo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> listaDeNumerosInteiros = new LinkedList<>();
//
//        listaDeNumerosInteiros.add(10);
//        listaDeNumerosInteiros.add(4);
//        listaDeNumerosInteiros.add(1980);
//        listaDeNumerosInteiros.add(25);
//
//        System.out.println("Lista não ordenada: " + listaDeNumerosInteiros);
//
//        Collections.sort(listaDeNumerosInteiros);
//
//        System.out.println("Lista ordenada em ordem crescente: " + listaDeNumerosInteiros);

        //Resolução item 3:

        Titulo tituloNome1 = new Titulo();
        Titulo tituloNome2 = new Titulo();
        Titulo tituloNome3 = new Titulo();


        tituloNome1.setNome("The Matrix");
        tituloNome2.setNome("Jogador Número 1");
        tituloNome3.setNome("Blade Runner");

        List<Titulo> listaDeTitulos = new LinkedList<>();

        listaDeTitulos.add(tituloNome1);
        listaDeTitulos.add(tituloNome2);
        listaDeTitulos.add(tituloNome3);

        Collections.sort(listaDeTitulos);

        System.out.println(listaDeTitulos);
    }
}