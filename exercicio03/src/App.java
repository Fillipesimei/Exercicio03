//Fillipe Símei Souza Ribeiro
//

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner fs = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = fs.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = fs.nextDouble();

        System.out.println("Operações: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
        System.out.print("Escolha: ");
        int opcao = fs.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        fs.close();
    }
}