
public class Main {
    public static void main(String[] args) {

        // Obj Uchiha REVISAR
        Uchiha itachi = new Uchiha( );

        Hokages Hiruzen = new Hokages(45);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato namikaze", 32, false);
        System.out.println(Minato.VivoOuNao + Minato.nome + Minato.idade);

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habikidadeEspecial();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Naruto Uzumaki";
        sasuke.habikidadeEspecial();

    }

}
