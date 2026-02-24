
public class Main {
    public static void main(String[] args) {
        // Objeto 01
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivaçao();
        Naruto.habilidadeEspecial();
        System.out.println(" ");
        // Objeto UCHIHA DO DESAFIO
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Uchiha Sasuke";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.missao = "Recuperar o ammuleto";
        Sasuke.sharinganAtivado();
        Sasuke.nivelDeDificuldade();
        Sasuke.statusDaMissao();
        Sasuke.mostrarInfoformaçes();
        Sasuke.habikidadeEspecial();
        System.out.println(" ");

        // Objeto 03
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Sakura";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 18;
        Hinata.ByakuganAtivado();
        System.out.println(" ");

        // Objeto 04
        Haruno Sakura = new Haruno();
        Sakura.nome = "Haruno Sakura";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();
        System.out.println(" ");

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivaçao();
        Boruto.AtivarOkarma();
        Boruto.AtivarJogan();
        System.out.println(" ");

    

    }

}
