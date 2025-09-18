[15:53, 18/09/2025] Jean: import java.util.Scanner;

public class Cinedev {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        char[][] SalaDeCinema = new char[10][20];
        
        int opcao;
        int ocupados = 0;
        // Inicia os assentos livres
        
        for (int i = 0; i < SalaDeCinema.length; i++) {
            for (int j = 0; j < SalaDeCinema[i].length; j++) {
                SalaDeCinema[i][j] = 'L';
            }
        }

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - VERIFICAR MAPA DOS ASSENTOS");
            System.out.println("2 - COMPRAR INGRESSO");
            System.out.println("3 - CANCELAR COMPRA DE INGRESSO");
            System.out.println("4 - EXIBIR RELATORIO DE OCUPAÇÃO");
            System.out.println("5 - SAIR");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    exibirMapa(SalaDeCinema);
                    break;
                case 2:
                    comprarIngresso(SalaDeCinema, leitor);
                    break;
                case 3:
                    System.out.println("TEM QUE FAZER.");
                    break;
                case 4:
                    System.out.println("TEM QUE FAZER.");
                    break;
                case 5:
                    System.out.println("Saindo do sistema. Ate logo");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }

        } while (opcao != 5);

    }

    
    public static void exibirMapa(char[][] SalaDeCinema) {
System.out.println("TE ACALMA");
            }
    
        
    

    // comprar ingresso
    public static void comprarIngresso(char[][] sala, Scanner leitor) {
        int fileira, assento;

        while (true) {
            System.out.print("Digite o numero da fileira (1-10): ");
            fileira = leitor.nextInt();
            System.out.print("Digite o numero do assento (1-20): ");
            assento = leitor.nextInt();

            //  limites
            if (fileira < 1 || fileira > sala.length || assento < 1 || assento > sala[0].length) {
                System.out.println("Fileira ou assento invalido. Tente novamente.");
                continue;
            }

            int i = fileira - 1;
            int j = assento - 1;

            // Verifica se ja está ocupado
            if (sala[i][j] == 'X') {
                System.out.println("Esse assento ja esta ocupado ");
                System.out.print("Deseja tentar novamente? (1-Sim / 0-Não): ");
                int opcao = leitor.nextInt();
                if (opcao == 0) {
                    break; // vai pro menu
                }
            } else {
                sala[i][j] = 'X';
                System.out.println("Ingresso comprado com sucesso.  Assento reservado.");
                int ocupados = + 1;
                break;
                
            }
        }
    }

}


COMMITAR: COMPRAR INGRESSO ADICIONADO
[15:57, 18/09/2025] Jean: import java.util.Scanner;

public class Cinedev {

    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        char[][] SalaDeCinema = new char[10][20];
        
        int opcao;
        int ocupados = 0;
        // Inicia os assentos livres
        
        for (int i = 0; i < SalaDeCinema.length; i++) {
            for (int j = 0; j < SalaDeCinema[i].length; j++) {
                SalaDeCinema[i][j] = 'L';
            }
        }

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - VERIFICAR MAPA DOS ASSENTOS");
            System.out.println("2 - COMPRAR INGRESSO");
            System.out.println("3 - CANCELAR COMPRA DE INGRESSO");
            System.out.println("4 - EXIBIR RELATORIO DE OCUPAÇÃO");
            System.out.println("5 - SAIR");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    exibirMapa(SalaDeCinema);
                    break;
                case 2:
                    comprarIngresso(SalaDeCinema, leitor);
                    break;
                case 3:
                    System.out.println("Função de cancelamento ainda não implementada.");
                    break;
                case 4:
                    System.out.println("Função de relatório ainda não implementada.");
                    break;
                case 5:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

    }

    
    public static void exibirMapa(char[][] SalaDeCinema) {
 


    for (int j = 0; j < SalaDeCinema[0].length; j++) {
        System.out.printf("%2d ", j + 1);
    }
    System.out.println();

   
    for (int i = 0; i < SalaDeCinema.length; i++) {
        System.out.printf("F%2d | ", i + 1); 
        for (int j = 0; j < SalaDeCinema[i].length; j++) {
            System.out.print(SalaDeCinema[i][j] + "  ");
        }
    }

            }

    // comprar ingresso
    public static void comprarIngresso(char[][] sala, Scanner leitor) {
        int fileira, assento;

        while (true) {
            System.out.print("Digite o numero da fileira (1-10): ");
            fileira = leitor.nextInt();
            System.out.print("Digite o numero do assento (1-20): ");
            assento = leitor.nextInt();

            //  limites
            if (fileira < 1 || fileira > sala.length || assento < 1 || assento > sala[0].length) {
                System.out.println("Erro: fileira ou assento invalido. Tente novamente.");
                continue;
            }

            int i = fileira - 1;
            int j = assento - 1;

            // Verifica se ja está ocupado
            if (sala[i][j] == 'X') {
                System.out.println("Esse assento ja está ocupado!");
                System.out.print("Deseja tentar novamente? (1-Sim / 0-Não): ");
                int opcao = leitor.nextInt();
                if (opcao == 0) {
                    break; // vai pro menu
                }
            } else {
                sala[i][j] = 'X';
                System.out.println("Ingresso comprado com sucesso! Assento reservado.");
                int ocupados = + 1;
                break;
                
            }
        }
    }

}
