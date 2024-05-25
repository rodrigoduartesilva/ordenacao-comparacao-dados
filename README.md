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

3. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

4. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

5. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
