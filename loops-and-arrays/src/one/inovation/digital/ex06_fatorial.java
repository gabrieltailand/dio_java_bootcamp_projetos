package one.inovation.digital;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class ex06_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicador = 1;

        System.out.print(fatorial +"! = ");
        for (int i = fatorial; i >= 1; i --) {
            multiplicador = multiplicador * i;

        }

        System.out.println(multiplicador);
    }
}
