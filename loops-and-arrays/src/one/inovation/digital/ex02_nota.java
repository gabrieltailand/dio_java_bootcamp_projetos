package one.inovation.digital;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class ex02_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota;

        System.out.println("Nota: ");
        nota = scan.nextFloat();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente.");
            nota = scan.nextFloat();
        }

        System.out.println("Fim do Progama.");
    }
}
