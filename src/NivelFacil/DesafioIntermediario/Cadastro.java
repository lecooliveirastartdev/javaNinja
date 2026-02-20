package NivelFacil.DesafioIntermediario;

//import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        // Entrada de dados
       // Scanner scanner = new Scanner(System.in);

        // Fazer o array
        int maxNinja = 5;
        int[] ninjas = new int[maxNinja];
        int[] nomeNinja;

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        //
        while (opcao != 3) {

            
// MENU
        // Cadastrar os ninjas em um array e depois mostrar opções com Switch cases
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninja");
        System.out.println("3. Sair");
        System.out.println("Escolha uma opção: ");
       // opcao = scanner.nextLine();
       // scanner.nextLine();

        
        switch (opcao) {
            case 1:
                if (ninjasCadastrados < maxNinja) {
                    System.out.println("Digite o nome do ninja para o cadastro");
                   /// int nomeNinja = scanner.nextLine();
                   // ninjas[ninjasCadastrados] = nomeNinja;
                    // Somando mais um ninja na minha lista
                    ninjasCadastrados++;
                    System.out.println("Ninja cadastrado com sucesso");

                } else {
                    System.out.println("A lista de ninja esta cheia, impossivel cadastrar um novo nija no momento!");
                }
                break;

            case 2:
                if (ninjasCadastrados == 0) {
                    System.out.println("Nenhum ninja cadastrado");

                } else {
                    System.out.println("===== Lista de ninjas =====");
                    for (int i = 0; i < ninjas.length; i++) {
                        System.out.println(ninjas[i]);
                    }
                    break;
                }

                case 3:
                System.out.println("Estamos terminando o programa...Aguarde");
                break;

                default:
                System.out.println("Esta opção não e valida");
                break;


        }

        }
        


    }

}
