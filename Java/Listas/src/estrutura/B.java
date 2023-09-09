package estrutura;

/*
* CONTEÚDO DO ARQUIVO:
* 0. Criando uma nova lista;
* 1. Adicionar Elementos;
* 2. Imprimir uma lista;
* 3. Acessar elementos;
* 4. Remover elementos;
* 5. Obter índice de um elemento da lista;
* 6. Percorrer a lista;
* 7. Alterar elementos;
* 8. Observações finais.
* */

import java.util.ArrayList;
import java.util.List;

public class B {
    public static void main(String[] args) {
        // 0 — CRIANDO UMA LISTA:
        List<Integer> lista = new ArrayList<>();

        // 1 — ADICIONANDO ELEMENTOS:
        lista.add(1);  // adiciona '1' ao final da lista.
        lista.add(3);  // adiciona '3' ao final da lista.
        lista.add(4);  // adiciona '4' ao final da lista.
        lista.add(10);  // adiciona '10' ao final da lista.

        // 2 — IMPRIMIR UMA LISTA:
        System.out.println(lista);  // Saída: [1, 3, 4, 10]

        // 3 — ACESSAR ELEMENTOS:
        int i = lista.get(2);  // Retorna a posição 2 da lista. => i = 4
        int j = lista.get(0);  // Retorna a posição 0 da lista. => j = 1
        System.out.println("i = " + i + "; j = " + j);  // Saída: i = 4; j = 1

        // 4 — REMOVER ELEMENTOS:
        lista.remove(2);  // Remove a posição 2 atual da lista.
        System.out.println(lista);  // [1, 3, 10]

        // 5 — OBTER ÍNDICE DE UM ELEMENTO DA LISTA:
        int index = lista.indexOf(10);  // Obtém a posição do elemento '10', na lista.  => index = 2
        System.out.println(index);  // Saída: 2
        // Obs: caso o elemento procurado não se encontre na lista, o método retornará -1.
        index = lista.indexOf(9);  // Elemento não cadastrado. => index = -1
        System.out.println(index);  // Saída: -1

        // 6 — PERCORRER LISTA:
        // 6.1 — For i:
        System.out.println("for i:");
        for (int k = 0; k < lista.size(); k++) {
            System.out.println(lista.get(k));
        }
        // 6.2 — For Each:
        System.out.println("for each:");
        for (int k : lista) {
            System.out.println(k);
        }

        // ambos acima possuem o mesmo resultado.

        // 7 — ALTERAR ELEMENTOS:
        lista.set(1, 9);  // substitui o elemento da posição 1 por 9.
        System.out.println(lista);  // [1, 9, 10]

        // 8 — OBSERVAÇÕES FINAIS:
        /*
        * Caso tente substituir ou remover algum elemento de um índice
        * inexistente (exemplo: uma lista possui 3 elementos, e tenta-se
        * remover o 4.º ou então substituir o 5.º), o programa irá parar
        * e uma mensagem de erro será exibida no terminal. Portanto, ao
        * programar, deve-se ter o cuidado com o alcance da lista, para
        * que esse tipo de inconveniente não aconteça.
        * */
    }
}
