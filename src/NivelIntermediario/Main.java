
public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto";
        Naruto.aldeia = "Aldei da folha";
        Naruto.idade = 20;
        

        // Criar ninja  Sasuke Uchiha - Sasuke e um objeto

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;

        Ninja Leco = new Ninja();
        Leco.nome = "Leco Oliveira";
        Leco.aldeia = "Aldeia da folha";
        Leco.idade = 49;

        // Aplicando Metodos Criados
        Leco.sharinganAtivado();
        String chamandoMetodoString = Leco.EuSouUmNinja();
        System.out.println(chamandoMetodoString);
    

    }

}


