import java.util.Scanner;

public class MenuSwitch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Verificar se um número é par ou ímpar");
            System.out.println("2 - Calcular o fatorial de um número");
            System.out.println("3 - Verificar se um número é múltiplo de outro");
            System.out.println("4 - Verificar se um número é primo");
            System.out.println("5 - Sair");
            System.out.print("Opção escolhida: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite um número inteiro: ");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0) {
                        System.out.println("O número " + num1 + " é par.");
                    } else {
                        System.out.println("O número " + num1 + " é ímpar.");
                    }
                    break;
                    
                case 2:
                    System.out.print("Digite um número inteiro: ");
                    int num2 = sc.nextInt();
                    int fatorial = 1;
                    for (int i = 2; i <= num2; i++) {
                        fatorial *= i;
                    }
                    System.out.println("O fatorial de " + num2 + " é " + fatorial);
                    break;
                    
                case 3:
                    System.out.print("Digite o primeiro número inteiro: ");
                    int num3 = sc.nextInt();
                    System.out.print("Digite o segundo número inteiro: ");
                    int num4 = sc.nextInt();
                    if (num3 % num4 == 0) {
                        System.out.println(num3 + " é múltiplo de " + num4);
                    } else {
                        System.out.println(num3 + " não é múltiplo de " + num4);
                    }
                    break;
                    
                case 4:
                    System.out.print("Digite um número inteiro: ");
                    int num5 = sc.nextInt();
                    boolean ehPrimo = true;
                    for (int i = 2; i <= num5/2; i++) {
                        if (num5 % i == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                    if (ehPrimo) {
                        System.out.println(num5 + " é um número primo.");
                    } else {
                        System.out.println(num5 + " não é um número primo.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
            System.out.println();
        }
        
        sc.close();
    }

}
