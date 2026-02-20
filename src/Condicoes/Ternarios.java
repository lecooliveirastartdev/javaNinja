package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        Maneiras de reduzir o codigo
        variavel = (condição) ? valorSeVerdadeiro : valorSeFalso
         */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Este ninja esta com mais de 10 missoes" : "Este ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);
    }
}
