# Desafio: hora da prática

### Autor:

#### Rodrigo Duarte

[Linkedin](https://www.linkedin.com/in/rodrigoduar-te/)

[GitHub](https://github.com/rodrigoduartesilva/)

A compreensão profunda de Collections.sort,LinkedList, Comparable, compareTo, sort e ArrayLists capacitam a ordenação eficiente de dados, enquanto a interface Comparable e o método compareTo oferecem controle sobre a ordem desejada.

1. Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

```Java

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
```

2. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

```Java

package br.com.duarte.ordenacao.model;

public class Titulo implements Comparable<Titulo>{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int compareTo(Titulo tituloComparar) {
        return this.getNome().compareTo(tituloComparar.nome);
    }
}


```

3. Sobrescreva o método toString na classe Titulo para que este possa imprimir apenas o nome do título.

```Java

@Override
    public String toString() {
        return getNome();
    }


```

4. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

```Java

package br.com.duarte.ordenacao.main;

import br.com.duarte.ordenacao.model.Titulo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
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


```

5. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

```Java

package br.com.duarte.ordenacao.main;

import br.com.duarte.ordenacao.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> listaNomesArrayList = new ArrayList<>();
        List<String> listaNomesLinkedList = new LinkedList<>();

        listaNomesArrayList.add("Samira");
        listaNomesArrayList.add("Mauricio");
        listaNomesArrayList.add("Belinha");
        listaNomesArrayList.add("Cinza");

        System.out.println("Lista usando ArrayList: " + listaNomesArrayList);

        listaNomesLinkedList.add("Samira");
        listaNomesLinkedList.add("Mauricio");
        listaNomesLinkedList.add("Belinha");
        listaNomesLinkedList.add("Cinza");

        System.out.println("Lista usando LikedList: " + listaNomesLinkedList);
    }
}


```

6. Modifique o Exercício 5 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
