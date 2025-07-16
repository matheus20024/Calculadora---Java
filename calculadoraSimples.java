import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        Double number1, number2, multiplicacao, divisao, soma, subtracao;
        int operacao;
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite a primerio número: ");
        number1 = numero.nextDouble();
        System.out.println("Digite o segundo número: ");
        number2 = numero.nextDouble();
        System.out.println("Vamos fazer uma operação!");
        System.out.println("Adição - 1");
        System.out.println("Subtração - 2");
        System.out.println("multiplicação - 3");
        System.out.println("Divisão - 4");
        System.out.println("Digite o número a operação!");
        operacao = numero.nextInt();
        if (operacao == 1){
        soma = number1 + number2;
            System.out.println("O resultado da Adição: " + soma);
        } if (operacao == 2){
        subtracao = number1 - number2;
        System.out.println("O resultado da Subtração: " + subtracao);
        } if (operacao == 3){
        multiplicacao = number1 * number2;
        System.out.println("O resultado da Multiplicação: " + multiplicacao);
        }  if (operacao == 4){
        divisao = number1 / number2;
        System.out.println("O resultado da Divisão: " + divisao);
        }
    }
}
