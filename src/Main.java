import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("""
                *****************************
                BEM-VINDO AO ALURA BANK
                Por favor, insira seu nome
                *****************************
                """);

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        double saldo = 0;
        String mensagem = String.format("Olá %s, seu saldo atual é R$ %.2f", nome, saldo);
        System.out.println(mensagem);

        String menu= """
                Insira as suas opções:
                1. Inserir Saldo
                2. Consultar Saldo
                3. Sacar
                4. Sair
                
                """;

        int opcao;

        do{
            System.out.println(menu);
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Inserir valor");
                    double valor = entrada.nextDouble();
                    saldo += valor;
                    System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);

                    break;
                case 2:
                    System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                    break;
                case 3:
                    System.out.println("Valor a sacar:");
                    valor = entrada.nextDouble();
                    if(valor <= saldo) {
                        saldo -= valor;
                        System.out.printf("Você sacou R$ %.2f. Saldo atual: R$ %.2f%n", valor, saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Alura Bank!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(opcao != 4);
        entrada.close();

            }

        }






