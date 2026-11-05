package Facul;

import java.util.Scanner;

public class ConversorTemp {

    public static double calculo_temp_C(double temperatura) {
        return (temperatura * 1.8) + 32;
    }

    public static double calculo_temp_F(double temperatura) {
        return (temperatura - 32) / 1.8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int esc = 0;

        while (esc != 3) {
            System.out.println("\n=================");
            System.out.println(" Escolha uma opção ");
            System.out.println("""
                    1 - Converter Celsius para Fahrenheit
                    2 - Converter Fahrenheit para Celsius
                    3 - Sair do programa""");
            System.out.println("=================\n");

            esc = sc.nextInt();

            if (esc == 1) {
                System.out.print("Digite sua temperatura em Celsius: ");
                double cel = sc.nextDouble();
                double conv_c = calculo_temp_C(cel);
                System.out.printf("Sua temperatura em Fahrenheit é %.2f °F\n", conv_c);

            } else if (esc == 2) {
                System.out.print("Digite sua temperatura em Fahrenheit: ");
                double fah = sc.nextDouble();
                double conv_f = calculo_temp_F(fah);
                System.out.printf("Sua temperatura em Celsius é: %.2f °C\n", conv_f);

            } else if (esc == 3) {
                System.out.println("Encerrando programa...");

            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
        
        sc.close();
    }
}