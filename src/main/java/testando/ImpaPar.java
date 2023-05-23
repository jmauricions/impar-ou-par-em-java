package testando;

import java.util.Scanner;

public class ImpaPar {
    public static void main(String[] args) {
        //linha para importar o Scanner
        Scanner leitura = new Scanner(System.in);
        //mensagem que vai mostrar o que é para digitar na variável abaixo
        System.out.println("Digite um número, para verificar se é ímpar ou par:\n");
        //variável que vai receber o número do usuário
        double numero = leitura.nextDouble();
        //condição que vai verificar se o número é ímpar ou par
        if (numero % 2 != 0) {
            System.out.println("O número " + numero + " é ímpar.");
        } else {
            System.out.println("O número " + numero + " é par.");
        }

    }
}

