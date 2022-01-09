import java.util.Scanner;

/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

Exemplo de Entrada 	Exemplo de Saída

7
-5
6
-4
12

3 valores pares

 */


public class ParesEntreCinco {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();

            //TODO: Implemente a condição abaixo verificando se "n" é par, ou seja, se o resto da divisão de "n" por 2 é zero.
            if ( n%2 == 0    ) {
                quantidadePares++;
            }
        }
        System.out.printf("%d valores pares\n", quantidadePares);
    }
}