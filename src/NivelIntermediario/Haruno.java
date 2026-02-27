public class Haruno extends Ninja {

    public Haruno(){
        super();

    }

    public Haruno(String nome, String nivelDeDificuldade, String statusDaMissao, String missao, String aldeia,
            int idade) {
        super(nome, nivelDeDificuldade, statusDaMissao, missao, aldeia, idade);
    }

    public void AtivarCura() {
        System.out.println("Eu sou " + nome + ", E eu ativei mimha cura fora do comun");
    }
    
    // Metodo abstrato obrigatorio que veio da classe NINJA
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Esta e minha estrategia de batalha ");
    }

}
