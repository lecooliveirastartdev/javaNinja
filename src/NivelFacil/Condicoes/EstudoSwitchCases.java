package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {

     /*
     SwitchCases: que serve para gerar casos especificos.

     Objetivo desta aula: Pedir para o usuario escolher  entre os ninjas
     */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem");
        System.out.println("1 -  Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        //Reação so escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu o Sakura haruno");
                break;
            default:
                System.out.println("Você nao digitou nenhuma resposta válida, tente novamente.");


        }

        // Fechar a caixa
        scanner.close();


    }
}
