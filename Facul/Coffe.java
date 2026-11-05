package Facul;

import java.util.Scanner;

public class Coffe {

    public static double descontos(double total, int cookie) {
        if (cookie >= 3) {
            double desconto_cookie = cookie * 2.00;
            total -= desconto_cookie;
        }

        if (total > 150) {
            total -= (total * 0.10);
        } else if (total >= 50 && total <= 150) {
            total -= (total * 0.05);
        }
        return total;
    }

    public static double calcular_doacao(double total) {
        return total * 0.02;
    }

    public static double media_arrecadacao(double total, int quantia) {
        return total / quantia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int esc;
        int decidir;
        int qnt_pedidos = 0;
        int qnt_capuccino = 0;
        double qnt_total_vendas = 0;
        int qnt_doadores = 0;
        double total_doacoes = 0;

        do {
            double total_pagar = 0;
            int qnt_cookie = 0;

            System.out.print("Digite seu nome, por favor: ");
            String nome_cliente = sc.nextLine();

            System.out.println("\n====================");
            System.out.println("        MENU        ");
            System.out.println("====================");
            System.out.println("1- Café expresso (R$ 6,00)");
            System.out.println("2- Capuccino (R$ 9,00)");
            System.out.println("3- Pão de queijo (R$ 5,00)");
            System.out.println("4- Cookie de chocolate (R$ 12,00)");
            System.out.println("0- Encerrar o pedido");
            System.out.println("====================");

            do {
                System.out.print("\nDigite o código do produto (ou 0 para finalizar o pedido): ");
                esc = sc.nextInt();

                if (esc >= 1 && esc <= 4) {
                    System.out.print("Quantas unidades deste produto? ");
                    int qtd = sc.nextInt();

                    switch (esc) {
                        case 1:
                            total_pagar += 6.00 * qtd;
                            System.out.println("Café expresso adicionado no pedido!");
                            break;
                        case 2:
                            total_pagar += 9.00 * qtd;
                            System.out.println("Capuccino adicionado no pedido!");
                            qnt_capuccino += qtd;
                            break;
                        case 3:
                            total_pagar += 5.00 * qtd;
                            System.out.println("Pão de queijo adicionado no pedido!");
                            break;
                        case 4:
                            total_pagar += 12.00 * qtd;
                            System.out.println("Cookie de chocolate adicionado no pedido!");
                            qnt_cookie += qtd;
                            break;
                    }
                    System.out.printf("Valor atual do seu pedido é: R$ %.2f\n", total_pagar);
                } else if (esc == 0) {
                    System.out.println("Encerrando pedido...");
                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }

            } while (esc != 0);

            total_pagar = descontos(total_pagar, qnt_cookie);

            System.out.println("\n====================");
            System.out.println("CAMPANHA ONG ZERO FOME");
            System.out.println("====================");
            System.out.println("Deseja doar 2% do seu valor para a campanha?");
            System.out.println("(1 - SIM) ou (2 - NÃO): ");
            System.out.println("====================");

            int decision = sc.nextInt();
            if (decision == 1) {
                double doacao_valor = calcular_doacao(total_pagar);
                total_pagar += doacao_valor;

                System.out.println("\n===================");
                System.out.printf("Agradecemos pela sua contribuição de R$ %.2f para a campanha!\n", doacao_valor);
                System.out.println("===================");

                qnt_doadores++;
                total_doacoes += doacao_valor;
            }

            System.out.println("\n====================");
            System.out.println("     RESUMO PEDIDO     ");
            System.out.println("===================");
            System.out.println("Cliente: " + nome_cliente);
            System.out.printf("O valor total a ser pago é: R$ %.2f\n", total_pagar);
            System.out.println("======================");

            qnt_total_vendas += total_pagar;
            qnt_pedidos++;

            System.out.println("\n===================");
            System.out.print("Deseja encerrar o dia? (1 - SIM) (2 - NÃO): ");
            decidir = sc.nextInt();
            sc.nextLine();

        } while (decidir == 2);

        System.out.println("\n===================");
        System.out.println("      Fim do dia      ");
        System.out.println("===================");
        System.out.printf("O valor total das vendas do dia foi de R$ %.2f\n", qnt_total_vendas);
        System.out.println("Quantidade de pedidos realizados no dia foi: " + qnt_pedidos + " pedido(s)!");
        System.out.println("Quantidade de capuccinos pedidos foi de " + qnt_capuccino + " unidade(s)!");

        if (qnt_doadores > 0) {
            double media_doacao = media_arrecadacao(total_doacoes, qnt_doadores);
            System.out.printf("A média arrecadada por doador foi: R$ %.2f\n", media_doacao);
            System.out.println("===================");
        } else {
            System.out.println("Nenhum valor arrecadado no dia!");
            System.out.println("===================");
        }

        sc.close();
    }
}