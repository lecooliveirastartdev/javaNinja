package Condicoes;

import java.util.Scanner;

/*
Scanner = E um jeito de trazer o usuario para dentro da aplicação.

Objetivo: O usuario vai criar um ninja e vamos validar
 */
public class ScannerDoUsuario {
	public static void main(String[] args) {
		//Abrir  o Scanner
		Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
		System.out.println("Escreva aqui o nome do ninja: ");
		String nomeDoNinja = caixaDeTexto.nextLine();
		System.out.println("O nome do ninja é: " + nomeDoNinja);


        //Receber a idade do ninja
		System.out.println("Qua a idade do seu ninja?");
		int idadeDoNInja = caixaDeTexto.nextInt();
		System.out.println("Seu ninja tem " + idadeDoNInja + " anos de  iadade");


		//Tratamento de dadod
		if (idadeDoNInja >=18) {
			System.out.println("Este ninja esta graduado para missões mais perigosas");

		}else
		System.out.println("Este ninja deverar aguardar a maior idada!");


		//Fechar o Scanner
		caixaDeTexto.close();


	}
}
