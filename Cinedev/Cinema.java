import java.util.Scanner;
public class Cinema {

   
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        char[][] SalaDeCinema = new char [10][20];
        int opcao;
        
        //inicializando os assentos livres
        
       for (int i = 0; i < SalaDeCinema.length; i++) {
            for (int j = 0; j < SalaDeCinema[i].length; j++) {
                SalaDeCinema[i][j] = 'L'; 
    }
            
            
}
       //while
       System.out.println("MENU PRINCIPAL");
       System.out.println("1 - VERIFICAR MAPA DOS ASSENTOS");
       System.out.println("2 - COMPRAR INGRESSO");
       System.out.println("3 - CANCELAR COMPRA DE INGRESSO");
       System.out.println("4 - EXIBIR RELATORIO DE OCUPAÇÃO");
       System.out.println("5 - SAIR");
     opcao = leitor.nextInt();
       switch (opcao) {
//Menu Principal
    }
}
}
