package NivelFacil.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
        IF e ELSE - Condições

        Objetivo: passar o ninja de nivel de acordo com o numero de missoes
         */

        //Ninja Naruto
        String nome = "Naruto Uzamki";
        int idade = 20;
        short numeroDeMissoes = 10;

        // se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin ");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}

