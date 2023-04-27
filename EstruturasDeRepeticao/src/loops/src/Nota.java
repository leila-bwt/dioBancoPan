package loops.src;

import java.util.Scanner;

/*Faça um programa que peça uma nota entre zero e dez
 * Mostre uma mensagem caso valor seja invalido
 * e continue pedindo ate que o usuário informe um valor valido
 */

public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota >10) {
            System.out.println("Nota Inválida. Digite novamente: ");
            nota = scan.nextInt();
        }
    }
    
}
