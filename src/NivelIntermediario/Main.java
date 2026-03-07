
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Missoes missao1 = new Missoes("Resgatar cachorro ", RankDeMissoes.S);
        missao1.exibirDetalhes();
        System.out.println("--------------------------------");

        System.out.println("------------Naruto Uzumaki------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", " Aldeia da folha", 18, 100, 2.10);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki com o nome alterado");
        System.out.println("Naruto Uzumaki com o nome alterado");

        System.out.println("");

        System.out.println("------------Sasuke Uchiha------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da  folha", 15, 400, 1.84);
        System.out.println(sasuke.getAltura());

        /*
         * LIST nao sao estaticas elas podem aumentar ou diminuir
         * .add -> ADICIONA | .remove -> REMOVE | .set -> TROCAR | .size -> VER TAMANO List
         * lis
         */
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        System.out.println(ninjasList);

        ninjasList.remove("Naruto Uzumaki");
        System.out.println(ninjasList);

        // Trocar elementos
        ninjasList.set(0, "Leco Oliveira");
        System.out.println(ninjasList);
        System.out.println(ninjasList.size());

    }

}
