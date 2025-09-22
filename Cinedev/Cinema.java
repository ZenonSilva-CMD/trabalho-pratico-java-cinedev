import java.util.Scanner;

public class Cinedev {

 
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        char[][] SalaDeCinema = new char[10][20];
        
        int opcao;
   
      
        
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
                    cancelarIngresso(SalaDeCinema, leitor);
                     break;
                case 4:
                   RelatorioOcupacao(SalaDeCinema, leitor);
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

  
    public static void comprarIngresso(char[][] sala, Scanner leitor) {
        int fileira, assento;

        while (true) {
            System.out.print("Digite o numero da fileira (1-10): ");
            fileira = leitor.nextInt();
            System.out.print("Digite o numero do assento (1-20): ");
            assento = leitor.nextInt();

          
            if (fileira < 1 || fileira > sala.length || assento < 1 || assento > sala[0].length) {
                System.out.println("Erro: fileira ou assento invalido. Tente novamente.");
                continue;
            }

            int i = fileira - 1;
            int j = assento - 1;

           
            if (sala[i][j] == 'X') {
                System.out.println("Esse assento ja está ocupado!");
                System.out.print("Deseja tentar novamente? (1-Sim / 0-Não): ");
                int opcao = leitor.nextInt();
                if (opcao == 0) {
                    break; 
                }
            } else {
                sala[i][j] = 'X';
                System.out.println("Ingresso comprado com sucesso! Assento reservado.");
                break;
          
            }
        }
    }
                
                public static void cancelarIngresso(char[][] sala, Scanner leitor) {
    int fileira, assento;

    while (true) {
        System.out.print("Digite o número da fileira (1-10): ");
        fileira = leitor.nextInt();
        System.out.print("Digite o número do assento (1-20): ");
        assento = leitor.nextInt();

      
        if (fileira < 1 || fileira > sala.length || assento < 1 || assento > sala[0].length) {
            System.out.println("Erro: fileira ou assento inválido. Tente novamente.");
            continue;
        }

        int i = fileira - 1;
        int j = assento - 1;

        
        if (sala[i][j] == 'L') {
            System.out.println("Esse assento já está livre!");
            System.out.print("Deseja tentar novamente? (1-Sim / 0-Não): ");
            int opcao = leitor.nextInt();
            if (opcao == 0) {
                break; 
            }
        } else {
            sala[i][j] = 'L';
            System.out.println("Cancelamento realizado com sucesso! Assento liberado.");
            break;
        }
    }
}
                
             
                   public static void RelatorioOcupacao(char[][] sala, Scanner leitor) {
                    int valortotal = 0;
                    for (int i = 0; i < sala.length; i++) {
                   for (int j = 0; j < sala[i].length; j++) {   
                   valortotal ++;
                   }
                    }
                   System.out.println("Numero de assentos na sala:" + valortotal);
                     int livres = 0;
                      int ocupados = 0;
                   for (int i = 0; i < sala.length; i++) {
                   for (int j = 0; j < sala[i].length; j++) {
                   if (sala[i][j] == 'X') {
                ocupados++;
                   }
                else { 
                livres ++;
                        
                        }
                   }
                   }
                    double percentual = (ocupados / (double) valortotal) * 100;
                    for (int i = 0; i < sala.length; i++) {
                   for (int j = 0; j < sala[i].length; j++) {
                
          
                   }
                    }
        System.out.printf("Percentual de ocupação: %.2f%%\n", percentual);      
        System.out.println("Total de assentos ocupados:" + ocupados);
                System.out.println("Total de assentos livres:" + livres);
    }
                   }                   
