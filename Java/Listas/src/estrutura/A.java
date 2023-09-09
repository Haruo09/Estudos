package estrutura;

/*
 * CONTEÚDO DESTE ARQUIVO:
 * 1. Como importar;
 * 2. Sintaxe;
 * 3. Como instanciar;
 * 4. Observações sobre criação da lista.
 * */

// 1 — COMO IMPORTAR:
import java.util.List;
import java.util.ArrayList;  // Este outro Import é necessário também, e mais para frente entenderá.

public class A {
    public static void main(String[] args) {
        /* 2 — SINTAXE:
         * A sintaxe de criação de uma lista é parecida com a sintaxe de
         * criação de outros objetos. A dferença crucial é a presença de
         * "< >", os quais colocam-se, entre eles, o tipo de dado da lista.
         * */

        /* 3 — COMO CRIAR UMA LISTA:
        * 1. Importar as devidas bibliotecas (algumas IDEs importam sozinhas);
        * 2. Instanciar objeto (sintaxe explicada acima);
        * 3. ser feliz :D
        * */

        // Exemplos:
        List<Integer> listaDeInteiros = new ArrayList<>();
        List<String> listaDeStrings = new ArrayList<>();
        List<Double> listaDeDobles = new ArrayList<>();

        /* 4 — OBSERVAÇÕES:
        * 1. Listas em Java, diferentemente de Python, geralmente criam-se
        * vazias, apesar de ser possível criá-las com valores. Mas isso
        * não virá ao caso, pelo menos não agora.
        *
        * 2. IMPORTANTE: Dentro de "< >" não se colocam simplismente tipos
        * (int, double, float, ...), colocam-se suas respectivas Classes.
        *
        * Exemplo errado:
        * List<int> lista = new ArrayList<>();
        *
        * Exemplo certo:
        * List<Integer> lista = new ArrayList<>();
        * */
    }
}

// fim da classe.
