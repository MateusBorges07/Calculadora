import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int opcao;
        while (true) {
            System.out.println("escola uma opcão: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();
            if (opcao == 5) {
                break;
            }
            System.out.println("Digite o primeiro numero: ");
            num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            num2 = scanner.nextDouble();
            switch (opcao) {
                case 1 -> System.out.println("Resultado: " + calc.soma(num1, num2));
                case 2 -> System.out.println("Resultado: " + calc.subtracao(num1, num2));
                case 3 -> System.out.println("Resultado: " + calc.multiplicacao(num1, num2));
                case 4 -> System.out.println("Resultado: " + calc.divisao(num1, num2));
                default -> System.out.println("Opção inválida!");
            }

        }
        System.out.println("programa finalizado!");
    }
}