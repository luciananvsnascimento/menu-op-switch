import java.util.Scanner;
public class MenuSwitch2
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("1 - Calcular e Exibir a Média Aritmética de Duas Notas (Números Reais)");
            System.out.println("2 - Calcular e Exibir a Média Ponderada de Três Notas (Números Reais)");
            System.out.println("3 - Sair");
            op = sc.nextInt();
            switch(op){
                
                case 1:
                    
                    System.out.println("Insira a primeira nota: ");
                    double n1 = sc.nextDouble();
                    System.out.println("Insira a segunda nota: ");
                    double n2 = sc.nextDouble();
                    double media = (n1 + n2) / 2;
                    System.out.println("A média é: " + media);
                    break;
                case 2: 
                    System.out.println("Insira a primeira nota: ");
                    double n4 = sc.nextDouble();
                    System.out.println("Insira a segunda nota: ");
                    double n5 = sc.nextDouble();
                    System.out.println("Insira a terceira nota: ");
                    double n6 = sc.nextDouble();
                    double mediaP = ((n4*3)+(n5*2)+(n6*5)) / 10 ;
                    System.out.println("A média ponderada é: " + mediaP);
                    break;
                case 3:
                    System.out.println("Sair ");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (op != 3);
    }
}