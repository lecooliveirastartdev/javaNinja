
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

    }

}
