
public class Main {
    public static void main(String[] args) {

        // Obj Hatake
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi hataki";
        Kakashi.aldeia = "Aldeia da folha";
        Kakashi.idade = 48; 
        Kakashi.boasVindas();
        Kakashi.sharinganAtivado();
        Kakashi.ninjaDeElite();

        // Obj Uchiha 
        Uchiha itachi = new Uchiha();
        itachi.nome = "Itachi";

        Hokages Hiruzen = new Hokages(45);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato namikaze", 32, false);
        System.out.println(Minato.VivoOuNao + Minato.nome + Minato.idade);

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habikidadeEspecial();
        naruto.ninjaDeElite();

        // Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Naruto Uzumaki";
        sasuke.habikidadeEspecial();

    }

}
