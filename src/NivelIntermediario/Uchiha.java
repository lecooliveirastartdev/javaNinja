public class Uchiha extends Ninja implements ShariganInterface {

    // Metodo Sharigan Ativado VEM DIRETO DA INTERFACE!
    public void sharinganAtivado() {
        System.out.println(nome + "Eu sou " + nome + ", e meu sharigan esta ativado ");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade, int numerosDemissoesConcluidas, String rank) {
        super(nome, aldeia, idade, numerosDemissoesConcluidas, rank);

    }

    public Uchiha(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    String habikidadeEspecial;

    // Metodo Habilidade Especial
    public void mostraHabilidadeEspecial() {
        System.out.println("Habilidade Especial ");
    }

    public void nivelDeDificuldade() {
        System.out.println(" Este e meu nivel de dificuldade ");

    }

    public void statusDaMissao() {
        System.out.println("Este e meu status da missão ");
    }

    public void mostrarInfoformaçes() {
        System.out.println("Teste ");
    }

    // Sobrescrever Metodo
    @Override
    public void habikidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e este é meu ataque Uchiha ");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Esta e minha estrategia de batalha ");
    }

    @Override
    public void inteligenciaDeCombate() {

    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + " e você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + " e você é um promissor");
        } else {
            System.out.println("Seu QI é: " + " e você é um genio");
        }
    }

}
