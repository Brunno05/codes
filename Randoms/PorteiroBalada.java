package Randoms;

import java.util.Scanner;

    public class PorteiroBalada {

        static class Pessoa{
            String nome;
            int idade;
            boolean ingresso;
            boolean vip;
        }

        public static boolean Entrada (int idade, boolean ingresso, boolean vip) {
            return false;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantas pessoas da lista são? ");
            int tamanho = sc.nextInt();
            sc.nextLine();

            Pessoa [] fila = new Pessoa[tamanho];

            for(int i = 0; i < fila.length; i++){
                fila[i] = new Pessoa();

                System.out.println("Pessoa "+(i+1));

                System.out.print("Nome da pessoa: ");
                fila[i].nome = sc.nextLine();

                System.out.print("Idade da pessoa: ");
                fila[i].idade = sc.nextInt();

                System.out.print("Tem ingresso? (true/false): ");
                fila[i].ingresso = sc.nextBoolean();

                System.out.print("É VIP? (true/false): ");
                fila[i].vip = sc.nextBoolean();

                sc.nextLine();

                System.out.println("\n--- Resultado ---");
                for (Pessoa p : fila) {
                    boolean entrou = Entrada(p.idade, p.ingresso, p.vip);
                    System.out.println(p.nome + ": " + (entrou ? "Pode entrar" : "Barrado"));
                }

        }


    }


}

